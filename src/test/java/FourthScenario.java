import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FourthScenario extends TestBase{

    FourthScenarioPoM fourthScenarioPoM;
    LoginPoM loginPoM;
    LogoutPoM logoutPoM;
    NavButtonsPoM navButtonsPoM;
    @Test(description = "Reactivate connection is available")
    public void fourthScenarioTest() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        fourthScenarioPoM = new FourthScenarioPoM(driver);
        //login
        //loginPoM.logIn("orvvndxo", "SixTest@123");
        // Click on Bills
        navButtonsPoM.billsBtnClick();
        // Click on Reactivate connection
        fourthScenarioPoM.clickReactivateConnection();
        //logout
        logoutPoM.logOutMain();
    }
}
