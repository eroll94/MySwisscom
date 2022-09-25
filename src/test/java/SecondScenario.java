import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

import static io.appium.java_client.MobileBy.AndroidUIAutomator;

public class SecondScenario extends TestBase{

    String addedMeansOfPayment = "The new means of payment has been added and you can use it immediately.";

    String deletedMeansOfPayment = "I no longer wish to use this means of payment Delete means of payment";
    String invalidCard = "Invalid card number";

    String verPayIsSucc = "How would you like to pay?";
    SecondScenarioPoM secondScenarioPoM;
    LoginPoM loginPoM;
    LogoutPoM logoutPoM;
    NavButtonsPoM navButtonsPoM;

    NotificationPoM notificationPoM;

    @Test(description = "Trying to add wrong card number -- Test made by Myself-playground")
    public void addWrongCard() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);

        //login and payment
        loginPoM.logIn("tpmabtjka_jcieqrv", "SixTest@12");
        //choose add payment
        logoutPoM.clickOnNav();
        secondScenarioPoM.addPayment();
        secondScenarioPoM.addCreditCardDetails("5200000000000077","06/25","123");

        Assert.assertEquals(addedMeansOfPayment, "", "compared values are not same!");
        //verification
        WebElement invalidCardTakenValue = driver.findElementByAccessibilityId("Invalid card number");
        String invalidCardTakenValueFromApp = invalidCardTakenValue.getText();
        System.out.println("This is taken value from app: " + invalidCardTakenValueFromApp);
        Assert.assertEquals(invalidCard, invalidCardTakenValueFromApp, "compared values are not same");
        //delete card
        

        //logout
        secondScenarioPoM.arrBack();
        secondScenarioPoM.closePage();
        navButtonsPoM.panoramaBtnClick();
        logoutPoM.logOutMain();
    }

    @Test(priority = 2 , description = "2.1 credit card already exist do pay online")
    public void payOnlineWithAddedCard() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        //login and payment
        loginPoM.logIn("jzdvqp.ldrczgm@bluewin.ch", "SixTest@123");
        //choose add payment
        navButtonsPoM.billsBtnClick();
        secondScenarioPoM.payOnlineMain();
//        logoutPoM.clickOnNav();
//        secondScenarioPoM.addPayment();
//        secondScenarioPoM.addCreditCardDetails("5200000000000077","06/25","123");
        //verification
        WebElement payOnlinePossibility = driver.findElementByAccessibilityId("How would you like to pay?");
        WebElement credCardVer = driver.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"Mastercard 520000xxxxxx0007\"])[1]");
        String payOnlinePossibilityCard = payOnlinePossibility.getText();
        String payOnlinePossibleCreditCardVer = credCardVer.getText();
        System.out.println("This is taken value from app: " + payOnlinePossibilityCard);
        System.out.println("This is taken value from app: " + payOnlinePossibleCreditCardVer);
        Assert.assertEquals(verPayIsSucc, payOnlinePossibilityCard, "compared values are not same");
        Assert.assertEquals("Mastercard 520000xxxxxx0007", payOnlinePossibleCreditCardVer,  "compared values are not same");
        //logout

        secondScenarioPoM.closePage();
//        secondScenarioPoM.closePayOnline();
        navButtonsPoM.panoramaBtnClick();
        logoutPoM.logOutMain();
    }

    @Test
    public void payOnlineWithAddedCardAndroid() throws MalformedURLException, InterruptedException {
        androidSetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        notificationPoM = new NotificationPoM(driver);
        //login and payment
        notificationPoM.clickOnNextBtn();
        loginPoM.logIn("jzdvqp.ldrczgm@bluewin.ch", "SixTest@123");
        //choose add payment
        navButtonsPoM.billsBtnClick();
        secondScenarioPoM.payOnlineMain();
        Thread.sleep(3000);
//        WebElement credCardVer = driver.findElementById("33");
        String credCardVer = driver.findElementByXPath("//*[contains(@text,'Mastercard')]").getText();
//        List<WebElement> credCardVer = driver.findElementsByXPath("//*[contains(@text,'Mastercard')]");
//        String payOnlinePossibleCreditCardVer = credCardVer.toString();
//        String newPayOnlinePossibleWithCredCard = payOnlinePossibleCreditCardVer
        System.out.println("This is taken value from app: " + credCardVer);
        Assert.assertEquals("Mastercard 520000xxxxxx0007", credCardVer,  "compared values are not same");


        secondScenarioPoM.closePage();
        Thread.sleep(2000);
        WebElement secondClosePage = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button");
        Thread.sleep(2000);
        secondClosePage.click();
//        secondScenarioPoM.closePayOnline();
        navButtonsPoM.panoramaBtnClick();
        logoutPoM.logOutBtnAndroid();

    }

    @Test(priority = 1 , description = "2.2 Add credit card then pay with that card and delete at end")
    public void addCorrectCardAndDelete() throws MalformedURLException, InterruptedException {
        //init everything
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
//        login
        loginPoM.logIn("tpmabtjka_jcieqrv", "SixTest@12");

//        add correct card
//        secondScenarioPoM.addCreditCardDetails("5200000000000007","06/25","123");
        navButtonsPoM.billsBtnClick();
        secondScenarioPoM.secTest();
        Assert.assertEquals("Card no (Visa)", secondScenarioPoM.insertVisaCard.getText(), "failed");
        secondScenarioPoM.closeWebPayment();
        secondScenarioPoM.closeSubAndBack();
        logoutPoM.logOutMain();


    }

    @Test(priority = 3 , description = "2.3 credit card already exist do pay online without widget")
    public void payOnlineWithoutWidget() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        //login and payment
//        loginPoM.logIn("jzdvqp.ldrczgm@bluewin.ch", "SixTest@123"); // this should be 2.1
        loginPoM.logIn("kwxhsixp@wkgtcoq.ch", "SixTest@12");
        //click on bills and payonline without widget
        navButtonsPoM.billsBtnClick();
        secondScenarioPoM.payableByMain();
        secondScenarioPoM.payOnlineMain();
//        logoutPoM.clickOnNav();
//        secondScenarioPoM.addPayment();
//        secondScenarioPoM.addCreditCardDetails("5200000000000077","06/25","123");
        //verification
        WebElement payOnlinePossibility = driver.findElementByAccessibilityId("How would you like to pay?");
        WebElement credCardVer = driver.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"Mastercard 520000xxxxxx0007\"])[1]");
        String payOnlinePossibilityCard = payOnlinePossibility.getText();
        String payOnlinePossibleCreditCardVer = credCardVer.getText();
        System.out.println("This is taken value from app: " + payOnlinePossibilityCard);
        System.out.println("This is taken value from app: " + payOnlinePossibleCreditCardVer);
        Assert.assertEquals(verPayIsSucc, payOnlinePossibilityCard, "compared values are not same");
        Assert.assertEquals("Mastercard 520000xxxxxx0007", payOnlinePossibleCreditCardVer, "compared values are not same");

//        Assert.assertEquals("credit card","credit card","compared values are not same");
        //logout
        secondScenarioPoM.backToPreviosPageMain();
        secondScenarioPoM.closePage();
//        navButtonsPoM.panoramaBtnClick();
        logoutPoM.logOutMain();
    }

    @Test
    public void payOnlineWithoutWidgetAndroid() throws MalformedURLException, InterruptedException {
        androidSetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        notificationPoM = new NotificationPoM(driver);
        //login and payment
        notificationPoM.clickOnNextBtn();
        loginPoM.logIn("kwxhsixp@wkgtcoq.ch", "SixTest@12");
        //choose add payment
        navButtonsPoM.billsBtnClick();
        Thread.sleep(3000);

        secondScenarioPoM.findByPayableBy();

        secondScenarioPoM.payOnlineMain();
        Thread.sleep(3000);
        String credCardVer = driver.findElementByXPath("//*[contains(@text,'Mastercard')]").getText();
        System.out.println("This is taken value from app: " + credCardVer);
        Assert.assertEquals("Mastercard 520000xxxxxx0007", credCardVer,  "compared values are not same");
        secondScenarioPoM.closePage();
        Thread.sleep(2000);
        WebElement secondClosePage = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button");
        Thread.sleep(2000);
        secondClosePage.click();
//        secondScenarioPoM.closePayOnline();
        navButtonsPoM.panoramaBtnClick();
        logoutPoM.logOutBtnAndroid();
    }

}
