import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ThirdScenario extends TestBase{

    ThirdScenarioPoM thirdScenarioPoM;
    LoginPoM loginPoM;
    LogoutPoM logoutPoM;
    NavButtonsPoM navButtonsPoM;
    @Test(description = "Trying to add wrong card number")
    public void thirdScenarioTest() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        thirdScenarioPoM = new ThirdScenarioPoM(driver);
        //login
        loginPoM.logIn("zcua0tuo", "SixTest@1");
        // Click on Bills
        navButtonsPoM.billsBtnClick();
        // Click on Pay Later
        thirdScenarioPoM.clickPayLater();
        thirdScenarioPoM.clickButtonNext();
        thirdScenarioPoM.clickPaymentDeadline();
        thirdScenarioPoM.clickButtonNext();
        // Verify last page
        Assert.assertEquals( thirdScenarioPoM.NewDeadline.getText(), thirdScenarioPoM.expectedMessage , "failed");
        thirdScenarioPoM.clickButtonBack();
        thirdScenarioPoM.clickButtonBack();
        thirdScenarioPoM.clickButtonBack();
        //logout
        logoutPoM.logOutMain();
    }
}
