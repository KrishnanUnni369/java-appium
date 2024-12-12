package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected AndroidDriver driver;

    public void setup() throws MalformedURLException {
       UiAutomator2Options options = new UiAutomator2Options()
        .setPlatformName("Android") // Specifies the platform to be tested (Android).
        .setPlatformVersion("11.0") // Specifies the version of the Android platform to be used.
        .setDeviceName("emulator-5554") // Identifies the device or emulator to use for testing.
        .setAutomationName("UiAutomator2") // Specifies the automation engine (UiAutomator2 is widely used for Android).
        .setApp(System.getProperty("user.dir") + "/path to apk") // Path to the app under test. Changed to a generic path using `user.dir` to get the current directory.
        .setNewCommandTimeout(Duration.ofSeconds(3600)) // Sets the timeout for a new command to 3600 seconds (useful for long-running tests).
        .setEnsureWebviewsHavePages(true) // Ensures that all WebViews have pages loaded before interacting with them.
        .setNativeWebScreenshot(true); // Enables taking screenshots for hybrid and native apps.


        // Set hardware keyboard manually
        options.setCapability("connectHardwareKeyboard", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }

    public AndroidDriver getDriver() {
        return driver;
    }
    public void teardown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver quit successfully.");
        }
    }
}
