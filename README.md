# 实验一 Android 开发基础

移动软件开发课程实验，作者：王鑫懿（学号 121052024077）。

课程的第一个工程，用来验证 Android 开发环境是否搭好：加载布局、用 findViewById 取控件、响应按钮点击，并用 Toast 和 Log 输出结果，同时在界面上显示当前运行设备与系统版本。

## 主要内容

- MainActivity 中读取 Build.MODEL、Build.VERSION.RELEASE 等常量并显示在界面上，用来确认工程跑在了哪台设备上
- EditText 输入姓名，点击“打招呼”用 Toast 显示问候语，点击“清空”把输入框置空
- 在 onCreate/onStart/onResume/onPause/onStop/onDestroy 中打 Log，配合 Logcat 观察生命周期

## 如何运行

1. 用 Android Studio 打开本目录（不要打开上层文件夹）
2. 首次 Sync 需要联网下载 Gradle 8.7 与依赖；国内网络若拉不动 Google Maven，可保留 `settings.gradle` 里的阿里云镜像
3. 选择模拟器或真机，运行 `app`

环境配置：Android Gradle Plugin 8.5.2 / Gradle 8.7 / compileSdk 34 / minSdk 24 / JDK 17

## 目录

```
app/src/main/java/        源码
app/src/main/res/         布局、字符串、图片等资源
docs/                     实验报告（Word）
```

## 说明

工程根目录附有 .gitignore（参照 GitHub 官方 Android 模板），提交时不会带上 build/、.idea/、local.properties。
