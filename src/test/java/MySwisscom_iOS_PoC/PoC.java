package MySwisscom_iOS_PoC;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PoC extends BaseClass{

    String curCostValue = "0.00";

    String curCostValue1 = curCostValue.replaceAll("\\s","");
//    IOSDriver driver = null;
//    @BeforeTest
//    public void setUp() throws MalformedURLException {
//
//            DesiredCapabilities desCap = new DesiredCapabilities();
//            desCap.setCapability("platformName", "iOS");
//            desCap.setCapability("platformVersion", "15.2");
//            desCap.setCapability("udid", "FBB6C72E-2C3E-4676-92B0-4D2474A6764E");
//            desCap.setCapability("deviceName", "Iphone 13");
//            desCap.setCapability("xcodeOrgId", "appleid@sixsentix.com");
//            desCap.setCapability("xcodeSigningId", "iPhone Developer");
//            desCap.setCapability("automationName", "XCUITest");
//            desCap.setCapability("bundleId", "com.swisscom.appnext.dev.vega");
//            desCap.setCapability("noReset", "true");
//            desCap.setCapability("fullContextList", "true");
//
//            URL url = new URL("http://127.0.0.1:4723/wd/hub");
//
//            driver = new IOSDriver(url, desCap);
//
//            System.out.println("----------App started----------");
//
//    }

    @Test
    public void testPoC() throws InterruptedException {
//        Thread.sleep(7000);
        System.out.println("Started app");


    //login
//        WebElement login = driver.findElementByName("Log in");
//        Thread.sleep(5000);
//        login.click();
//        Thread.sleep(5000);
//        WebElement usrName = driver.findElementByName("Username or mobile number");
//        Thread.sleep(4000);
//        usrName.sendKeys("ccqgseo56.48");
//        Thread.sleep(4000);
//        WebElement cnt = driver.findElementByName("Continue");
//        Thread.sleep(3000);
//        cnt.click();
//        WebElement pass = driver.findElementByName("Password");
//        pass.sendKeys("Tester@123");
//        WebElement lgnClick = driver.findElementByName("Login");
//        lgnClick.click();
//        Thread.sleep(6000);
        //        login
        WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("Log in"))));
        login.click();
        WebElement usrName = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("Username or mobile number"))));
        Thread.sleep(1000);
        usrName.sendKeys("ccqgseo56.48");
        WebElement cnt = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("Continue"))));
//        WebElement cnt = driver.findElementByName("Continue");
        cnt.click();
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("Password"))));
//        WebElement pass = driver.findElementByName("Password");
        pass.sendKeys("Tester@123");
        WebElement lgnClick = driver.findElementByName("Login");
        lgnClick.click();

        ////click on bill
        WebElement clickOnBills = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("Bills"))));
        clickOnBills.click();

//        Thread.sleep(4500);
//        TouchAction touchAction = new TouchAction(driver);
//        touchAction.tap(PointOption.point(221, 771))
//                .perform();

//        Thread.sleep(5000);

        //pick a value and verify
//        WebElement currValue = driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"6.92\"]");
//        WebElement currValue = driver.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"0.00\"])[1]");
        WebElement currValue = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//XCUIElementTypeStaticText[@name=\"0.00\"])[1]"))));

        String curNewValue = currValue.getText();
        String curNewValue1 = curNewValue.replaceAll("\\s","");
        System.out.println("This is taken value from app: " + curNewValue);
//        Thread.sleep(3000);

        //Verification
        Assert.assertEquals(curNewValue1,curCostValue1,"Compared values not same!");

//        WebElement avatarIcon = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"navigation\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton");
        WebElement avatarIcon = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//XCUIElementTypeOther[@name=\"navigation\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton"))));

        avatarIcon.click();

        Thread.sleep(3000);
        //logout
        WebElement logoutBtn = driver.findElementByIosClassChain("**/XCUIElementTypeButton[`label == \"Log out\"`]");
        logoutBtn.click();

        Thread.sleep(1000);
        TouchAction touchActionLogout = new TouchAction(driver);
        touchActionLogout.tap(PointOption.point(12, 698))
                .perform();

//        Thread.sleep(1000);
    }
}
