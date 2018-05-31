# Agora-Custom-Media-Device-Android

*其他语言版本： [简体中文](README.md)*

## Introduction

This open source sample project shows how to use the new MeidaIO interface provided in the Agora SDK.

With this sample project, you can:

* Enable to sharing mobile phone screen or share a specific View to the remote
* Use both local video and Camera as the data source, play the local source and send it to the remote, and switch the source in the channel

Before running this sample project, you may:

* See the sample project for Agora Video SDK: [Agora-Android-Tutorial-1to1](https://github.com/AgoraIO/Agora-Android-Tutorial-1to1)
* See the Android screen sharing sample project with old APIs: [Agora-Screen-Sharing-Android](https://github.com/AgoraIO/Agora-Screen-Sharing-Android)
* See the iOS screen sharing sample project: [Agora-Screen-Sharing-iOS](https://github.com/AgoraIO/Agora-Screen-Sharing-iOS)

## Preparing the Developer Environment

* Ensure that your Android Studio version is later than Android Studio 2.0 (included)
* Prepare Android devices with audio and video functionalities
* Android simulators are NOT supported

## Running the App

1. Create a developer account at [Agora.io](https://dashboard.agora.io/signin/), and obtain an App ID. 
2. Download this sample propject.
3. Fill in the obtained App ID in the "app/src/main/res/values/strings.xml" file of the sample project.

   ```
   <string name="agora_app_id"><#YOUR APP ID#></string>
   ```
4. Choose either of the following two methods to integrate the Agora Video SDK:

 * Method 1: (Recommended) Add the address in the property of the dependence of the "app/build.gradle" to automatically integrate the Agora Video SDK into this project through JCenter:
  
   ```
   compile 'io.agora.rtc:full-sdk:2.2.0'
   ```
   > Adding the link address is the most important step if you want to integrate the Agora Video SDK in your own application.

 * Method 2: Download the SDK and integrate:
 
   1) Download the **Agora Video SDK** from [Agora.io SDK](https://www.agora.io/en/blog/download/). Unzip the downloaded SDK package and copy ***.jar** ABD **arm64-v8a**/**x86**/**armeabi-v7a** under **libs** to *app/libs* and *app/src/main/jniLibs* respectively.
   2)add the fllowing code in the property of the dependence of the "app/build.gradle":

   ```
   compile fileTree(dir: 'libs', include: ['*.jar'])
   ```
5. Open the project with Android Studio, connect your Android device, build and run. You can also use `Gradle` to build and run.

## Connect Us

- You can find full API document at [Document Center](https://docs.agora.io/en/)
- You can file bugs about this demo at [issue](https://github.com/AgoraIO/Agora-Screen-Sharing-Android/issues)

## License

The MIT License (MIT).
