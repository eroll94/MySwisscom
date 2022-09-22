import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import io.appium.java_client.android.nativekey.AndroidKey;

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
        loginPoM.logIn("ccqgseo56.48", "Tester@123");
        navButtonsPoM.billsBtnClick();
        logoutPoM.logOutBtnAndroid();
    }

}
