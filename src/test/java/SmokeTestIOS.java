import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SmokeTestIOS extends TestBase {
    LoginPoM loginPoM;
    LogoutPoM logoutPoM;
    NavButtonsPoM navButtonsPoM;
    @Test
    public void iOSTest() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        loginPoM.logIn("ccqgseo56.48", "Tester@123");
        navButtonsPoM.billsBtnClick();
        logoutPoM.logOutMain();

    }
    @AfterTest
    public void cleanUp(){
        driver.quit();
    }
}
