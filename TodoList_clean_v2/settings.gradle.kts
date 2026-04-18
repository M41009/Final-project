pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        //maven { url = uri("https://maven.aliyun.com/repository/public") }
        //maven { url = uri("https://maven.aliyun.com/repository/google") }
        // 添加阿里云 Google 镜像
        maven("https://maven.aliyun.com/repository/google")
        // 添加阿里云 Maven 中央仓库镜像
        maven("https://maven.aliyun.com/repository/public")

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        //maven { url = uri("https://maven.aliyun.com/repository/public") }
        // 添加阿里云 Google 镜像
        maven("https://maven.aliyun.com/repository/google")
        // 添加阿里云 Maven 中央仓库镜像
        maven("https://maven.aliyun.com/repository/public")
        maven("https://jitpack.io") //added by 2024.4.21

        google()
        mavenCentral()
    }
}

rootProject.name = "TodoList"
include(":app")
 