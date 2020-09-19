package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MyAndroidDriver {

    private DesiredCapabilities caps;

    public MyAndroidDriver(){

        caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Google Nexus 6_1");
        //caps.setCapability("udid", "192.168.106.101:5555"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "5.1");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("appPackageName", "com.vbanthia.androidsampleapp");
        caps.setCapability("appActivity", "com.vbanthia.androidsampleapp.MainActivity");
        caps.setCapability("noReset", "false");
    }

    public AndroidDriver initDriver() throws MalformedURLException {
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }
}
