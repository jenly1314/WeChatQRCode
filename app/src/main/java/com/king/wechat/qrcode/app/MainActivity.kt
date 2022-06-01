package com.king.wechat.qrcode.app

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.king.mlkit.vision.camera.util.LogUtils
import com.king.mlkit.vision.camera.util.PermissionUtils
import com.king.wechat.qrcode.WeChatQRCodeDetector
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.opencv.OpenCV
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    companion object{

        const val SCAN_RESULT = "SCAN_RESULT"

        const val REQUEST_CODE_QRCODE = 0x10
        const val REQUEST_CODE_REQUEST_EXTERNAL_STORAGE = 0x11
        const val REQUEST_CODE_PICK_PHOTO = 0x12
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //初始化OpenCV
        OpenCV.initAsync(this)
        //初始化WeChatQRCodeDetector
        WeChatQRCodeDetector.init(this)
    }

    private fun getContext() = this

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if(requestCode == REQUEST_CODE_REQUEST_EXTERNAL_STORAGE && PermissionUtils.requestPermissionsResult(Manifest.permission.READ_EXTERNAL_STORAGE,permissions,grantResults)){
            startPickPhoto()
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK){
            when(requestCode){
                REQUEST_CODE_QRCODE -> processQRCodeResult(data?.getStringExtra(SCAN_RESULT))
                REQUEST_CODE_PICK_PHOTO -> processPickPhotoResult(data)
            }
        }
    }

    private fun processPickPhotoResult(data: Intent?){
        data?.let {
            try{
                lifecycleScope.launch {
                    val bitmap = MediaStore.Images.Media.getBitmap(contentResolver,it.data)
                    val result = withContext(Dispatchers.IO){
                        //通过WeChatQRCodeDetector识别图片中的二维码
                        WeChatQRCodeDetector.detectAndDecode(bitmap)
                    }
                    if(result.isNotEmpty()){//不为空，则表示识别成功
                        //打印所有结果
                        for((index,text) in result.withIndex()){
                            LogUtils.d("result$index:$text")
                        }
                        //一般需求都是识别一个码，所以这里取第0个就可以；有识别多个码的需求，可以取全部
                        Toast.makeText(getContext(),result[0],Toast.LENGTH_SHORT).show()
                    }else{//为空表示识别失败
                        LogUtils.d("result = null")
                    }
                }

            }catch (e: Exception){
                LogUtils.w(e)
            }

        }
    }

    private fun processQRCodeResult(text: String?){
        text?.let {
            Log.d(SCAN_RESULT, it)
            Toast.makeText(getContext(),it,Toast.LENGTH_SHORT).show()
        }
    }

    private fun pickPhotoClicked(){
        if(PermissionUtils.checkPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)){
            startPickPhoto()
        }else{
            PermissionUtils.requestPermission(this,Manifest.permission.READ_EXTERNAL_STORAGE,REQUEST_CODE_REQUEST_EXTERNAL_STORAGE)
        }
    }

    private fun startPickPhoto(){
        val pickIntent = Intent(Intent.ACTION_PICK,
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        pickIntent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*")
        startActivityForResult(pickIntent, REQUEST_CODE_PICK_PHOTO)
    }

    fun onClick(view: View) {
        when(view.id){
            R.id.btnWeChatQRCode -> startActivityForResult(Intent(this,WeChatQRCodeActivity::class.java), REQUEST_CODE_QRCODE)
            R.id.btnPickPhoto -> pickPhotoClicked()
        }
    }
}