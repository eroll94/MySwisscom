package MySwisscom_iOS_PoC;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    IOSDriver driver = null;
    WebDriverWait wait = null;

    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desCap = new DesiredCapabilities();
        desCap.setCapability("platformName", "iOS");
//        desCap.setCapability("platformVersion", "15.2.1");
        desCap.setCapability("platformVersion", "15.2");
//        desCap.setCapability("udid", "f9de75d027b1db338fd8bfcd7ee07f1442ca79eb");
        desCap.setCapability("udid", "FBB6C72E-2C3E-4676-92B0-4D2474A6764E");
        desCap.setCapability("deviceName", "Iphone 13");
//        desCap.setCapability("deviceName", "Iphone 8");
        desCap.setCapability("xcodeOrgId", "appleid@sixsentix.com");
        desCap.setCapability("xcodeSigningId", "iPhone Developer");
        desCap.setCapability("automationName", "XCUITest");
        desCap.setCapability("bundleId", "com.swisscom.appnext.dev.vega");
//        desCap.setCapability("autoAcceptAlerts", "true");
//        desCap.setCapability("safariAllowPopups", "true");
        desCap.setCapability("noReset", "true");
        desCap.setCapability("fullContextList", "true");
//        desCap.setCapability("printPageSourceOnFindFailure", "true");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new IOSDriver(url, desCap);

        wait = new WebDriverWait(driver, 20);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();

    }

}
