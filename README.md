# Java Appium Framework For Android

This repository contains a basic Java Appium framework for testing Android applications. It provides an easy-to-follow setup guide and a sample APK to help you get started with mobile automation testing.

## Sample APK

You can download the sample APK from the following link:

[ApiDemos-debug.apk](https://github.com/appium/appium/blob/master/packages/appium/sample-code/apps/ApiDemos-debug.apk)

---

## Prerequisites

1. **Android Studio**
2. **Appium**
3. **Appium Inspector**
4. **Java Development Kit (JDK)**

---

## Step-by-Step Guide to Setup

1. **Install Android Studio**

   - **Download and Install Android Studio**:  
     Visit the official [Android Studio website](https://developer.android.com/studio) and follow the installation instructions for your operating system.

   - **Configure Android SDK**:  
     Launch Android Studio, open **SDK Manager** (File > Settings > Appearance & Behavior > System Settings > Android SDK), and install:
     - Latest SDK tools
     - Necessary Android API levels (e.g., Android 11.0)
     - Android SDK Platform-Tools (for ADB, fastboot, etc.)

   - **Set Up Emulator**:  
     Open **AVD Manager** (Tools > Device Manager) and create an emulator with the desired Android version. Start the emulator and ensure it boots up successfully.

2. **Install Appium**

   - **Install Node.js**:  
     Appium requires Node.js. Download and install it from the [Node.js website](https://nodejs.org). Verify the installation by running:
     ```bash
     node -v
     npm -v
     ```

   - **Install Appium**:  
     Run the following command to install Appium globally:
     ```bash
     npm install -g appium
     ```

   - **Start Appium Server**:  
     Launch the Appium server by running:
     ```bash
     appium
     ```

3. **Install Appium Inspector**

   - **Download and Install Appium Inspector**:  
     Visit the [Appium Inspector Releases](https://github.com/appium/appium-inspector/releases) page and download the latest version for your operating system. Follow the installation instructions.

   - **Configure Appium Inspector**:  
     Open Appium Inspector and configure it to connect to the Appium server by providing the required desired capabilities (explained below).

4. **Configure Environment Variables**

   - **Locate Android SDK Path**:  
     In Android Studio, find the SDK path under:  
     **File > Settings > Appearance & Behavior > System Settings > Android SDK**

   - **Set Up Environment Variables**  
     Add the Android SDK path to your environment variables:

     **For Windows**:
     - Set `ANDROID_HOME` as a system variable and point it to the SDK path.
     - Add the following to the `PATH` variable:
       ```bash
       %ANDROID_HOME%\platform-tools
       %ANDROID_HOME%\tools
       ```

     **For macOS/Linux**:
     - Add the following to your `~/.bash_profile` or `~/.zshrc`:
       ```bash
       export ANDROID_HOME=/path/to/sdk
       export PATH=$ANDROID_HOME/platform-tools:$ANDROID_HOME/tools:$PATH
       ```

   - **Verify the Setup**:  
     Ensure ADB is running correctly by executing:
     ```bash
     adb devices
     ```

5. **Configure Desired Capabilities in Appium Inspector**

   - Open Appium Inspector and create a new session.
   - Enter the desired capabilities in the Inspector's configuration window. Here's an example:
   ```json
   {
     "platformName": "Android",
     "platformVersion": "11.0",
     "deviceName": "emulator-5554",
     "automationName": "UiAutomator2",
     "app": "/path/to/your/app.apk"
   }


6. Launch the Emulator:
Start your emulator or connect a physical device via USB.

Start Appium Server:
Run the Appium server:

appium

7. Troubleshooting
If the Emulator Is Not Detected:
Ensure that ADB is running correctly by checking the connected devices:

adb devices
If the device is not listed, restart the ADB server:

adb kill-server
adb start-server
