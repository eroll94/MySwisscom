import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SmokeTestAndroid extends TestBase {

    LoginPoM loginPoM;
    LogoutPoM logoutPoM;
    NavButtonsPoM navButtonsPoM;
    NotificationPoM notificationPoM;

    @Test
    public void startAndroid() throws MalformedURLException, InterruptedException {
        androidSetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        notificationPoM = new NotificationPoM(driver);
        notificationPoM.clickOnNextBtn();
//        loginPoM.logIn("ccqgseo56.48", "Tester@123"); ----> check this tommorrow pop-up appears!
        Thread.sleep(4000);
        driver.findElementByClassName("android.widget.EditText").sendKeys("ccqgseo56.48");
        Thread.sleep(2000);
        driver.findElementByClassName("android.widget.Button").click();
        Thread.sleep(2000);
        driver.findElementByClassName("android.widget.EditText").sendKeys("Tester@123");
        Thread.sleep(2000);
        driver.findElementByClassName("android.widget.Button").click();

    }

}
