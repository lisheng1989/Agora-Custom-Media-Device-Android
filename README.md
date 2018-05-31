# Agora-Custom-Media-Device

*Read this in other languages: [English](README.en.md)*

## 简介

本开源示例项目基于 Agora Native SDK 中新增的 MediaIO 接口开发，演示了如何使用 Agora SDK 实现以下功能：

* 共享手机屏幕或者投射特定的 View 到远端；
* 本地视频和 Camera 作为外部数据源，本地显示并推送视频或 Camera 数据到远端；基于新的 MediaIO 接口，实现频道内视频源动态切换。

在运行本示例项目前，你可以：

* 查看Agora视频SDK的入门示例项目：[Agora-Android-Tutorial-1to1](https://github.com/AgoraIO/Agora-Android-Tutorial-1to1)
* 查看 Android 平台的使用旧接口实现屏幕共享的示例项目：[Agora-Screen-Sharing-Android](https://github.com/AgoraIO/Agora-Screen-Sharing-Android)
* 查看 iOS 平台的示例项目：[Agora-Screen-Sharing-iOS](https://github.com/AgoraIO/Agora-Screen-Sharing-iOS)

## 准备开发环境

* 请保证你的 Android Studio 版本在 Android Studio 2.0 及以上
* Android 真机设备（Nexus 5X 或其他设备）
* 由于部分模拟机有功能缺失或性能问题，Agora 推荐使用真机

## 运行示例程序

1. 在 [Agora.io 注册](https://dashboard.agora.io/cn/signup/) 注册账号，并创建自己的测试项目，获取到 App ID。
2. 下载本页示例项目。
3. 在示例程序的 *app/src/main/res/values/strings.xml* 路径下，填入获取到的 App ID：

   ```
   <string name="agora_app_id"><#YOUR APP ID#></string>
   ```
4. 选择如下任意一种方法集成 Agora SDK：

 * 方法一：（推荐）在项目对应的模块的 **app/build.gradle** 文件的依赖属性中加入通过 JCenter 自动集成 Agora SDK 的地址：

   ```
   compile 'io.agora.rtc:full-sdk:2.2.0'
   ```
   > 如果要在自己的应用中集成 Agora 视频 SDK，添加链接地址是最重要的一步

 * 方法二：通过下载 SDK 包集成
 
   1）在 [Agora.io SDK](https://www.agora.io/cn/download/) 下载 **视频通话 + 直播 SDK**，解压后将其中的 **libs** 文件夹下的 ***.jar** 和 **arm64-v8a**/**x86**/**armeabi-v7a** 文件分别复制到本项目的 *app/libs* 和 *app/src/main/jniLibs* 路径下
   
   2）在本项目的 "app/build.gradle" 文件依赖属性中添加如下依赖关系：
   ```
   compile fileTree(dir: 'libs', include: ['*.jar'])
   ```
5. 用 Android Studio 打开该项目，连上设备，编译并运行。也可以使用 `Gradle` 直接编译运行。

## 联系我们

- 完整的 API 文档见 [文档中心](https://docs.agora.io/cn/)
- 如果在集成中遇到问题，你可以到 [开发者社区](https://dev.agora.io/cn/) 提问
- 如果有售前咨询问题，你可以拨打 400 632 6626，或加入官方Q群 12742516 提问
- 如果需要售后技术支持，你可以在 [Agora Dashboard](https://dashboard.agora.io) 提交工单
- 如果发现了示例代码的 Bug，欢迎提交 [issue](https://github.com/AgoraIO/Agora-Screen-Sharing-Android/issues)

## 代码许可

The MIT License (MIT).
