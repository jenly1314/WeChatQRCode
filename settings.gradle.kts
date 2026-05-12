pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.application",
                "com.android.library" -> useModule("com.android.tools.build:gradle:${requested.version}")
            }
        }
    }
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "WeChatQRCode"
include(
    ":app",
    ":opencv",
    ":opencv-armv7a",
    ":opencv-armv64",
    ":opencv-x86",
    ":opencv-x86_64",
    ":opencv-qrcode",
    ":opencv-qrcode-scanning",
    ":wechat-qrcode",
    ":wechat-qrcode-scanning",
)
