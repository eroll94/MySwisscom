import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
   public static AppiumDriver driver;

    public void iOSsetup() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desCap = new DesiredCapabilities();
        desCap.setCapability("platformName", "iOS");
        desCap.setCapability("platformVersion", "15.5");
//        desCap.setCapability("udid", "D72ACB1F-C557-460B-8BB3-707E078F797C");
        desCap.setCapability("udid", "0BB5A406-2A33-4F41-98CA-35A62B57E62E"); //13
        desCap.setCapability("deviceName", "Iphone 13");
//        desCap.setCapability("xcodeOrgId", "appleid@sixsentix.com");
        desCap.setCapability("xcodeOrgId", "erolsh94@gmail.com");
        desCap.setCapability("xcodeSigningId", "iPhone Developer");
        desCap.setCapability("automationName", "XCUITest");
        desCap.setCapability("bundleId", "com.swisscom.appnext.dev.vega");
//        desCap.setCapability("autoAcceptAlerts", "true");
//        desCap.setCapability("safariAllowPopups", "true");
        desCap.setCapability("noReset", "true");
        desCap.setCapability("fullContextList", "true");
//        desCap.setCapability("printPageSourceOnFindFailure", "true");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), desCap);

    }
    public void androidSetup() throws MalformedURLException {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "Android SDK built for x86");
//            cap.setCapability("automationName", "UiAutomator2");
            cap.setCapability("udid","emulator-5554");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion","11");
//            cap.setCapability("platformVersion","10");
            cap.setCapability("appPackage","com.swisscom.appnext.dev.vega");
            cap.setCapability("appActivity","com.swisscom.myswisscom.MainActivity");
//        cap.setCapability("appActivity","com.swisscom.loginsdk.LoginActivity");he
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    public static void tearDown(){
        if (null != driver){
            driver.quit();
        }
    }
}
