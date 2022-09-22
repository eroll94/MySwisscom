import com.testautomationguru.utility.PDFUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class FirstScenario extends TestBase {

    SecondScenarioPoM secondScenarioPoM;
    LoginPoM loginPoM;
    LogoutPoM logoutPoM;
    NavButtonsPoM navButtonsPoM;
    NotificationPoM notificationPoM;
    FirstScenarioPoM firstScenarioPoM;

    PDFUtil pdfUtil = new PDFUtil();

    @Test
    public void tc1() throws IOException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        firstScenarioPoM = new FirstScenarioPoM(driver);
        //login and payment
//        loginPoM.logIn("tfmaogqevw@jcxkkvp.com", "SixTest@1"); - web

        loginPoM.logIn("second.feb1", "SixTest@123");
        navButtonsPoM.billsBtnClick();
        firstScenarioPoM.verifyRunningCost();
        Assert.assertEquals("blue Mobile L", firstScenarioPoM.mobileLFirstTest.getText(), "failed");
        Assert.assertEquals("Intercontinental Pack", firstScenarioPoM.intercontinentalFirstTest.getText(), "failed");
        Assert.assertEquals("Simply Digital", firstScenarioPoM.simplyDigFirstTest.getText(), "failed");
//        Assert.assertEquals("139.90", firstScenarioPoM.totalSubFirstTest.getText(), "failed");
        Assert.assertEquals("91.90", firstScenarioPoM.conOutgoingAbroad.getText(), "failed");
        Assert.assertEquals("\uE00F Telephony, included", firstScenarioPoM.telephonyIncludedFirstTest.getText(), "failed");
        Assert.assertEquals("\uE00F Telephony, standard tariff", firstScenarioPoM.telephonyStandardTarifFirstTest.getText(), "failed");
        Assert.assertEquals("\uE00F SMS/MMS, included", firstScenarioPoM.smsMmsIncludedFirstTest.getText(), "failed");
        Assert.assertEquals("10.80", firstScenarioPoM.conIncommingAbroad.getText(), "failed");
        Assert.assertEquals("\uE00F Telephony, included", firstScenarioPoM.telephonyIncludedFirstTestIncoming.getText(), "failed");
        Assert.assertEquals("\uE00F Telephony, standard tariff", firstScenarioPoM.telStandardIncoming.getText(), "failed");
//        Assert.assertEquals("\uE00F 102.70", firstScenarioPoM.totalConFirstTest.getText(), "failed");
        navButtonsPoM.billsBtnClick();
        //open pdf
        firstScenarioPoM.clickOnBillForPreviosMonth();
        firstScenarioPoM.openAndClosePdf();
        String pdfText = String.valueOf(pdfUtil.getText("/Users/sixsentix/Desktop/pdfs//MYSWISSCOM_00.pdf"));
        System.out.println("This is translated text from pdf is : " + pdfText);
        Assert.assertTrue(pdfText.contains("Second Feb"),"failed");
        Assert.assertTrue(pdfText.contains("CHF 846.25"),"failed");
        //logout
        navButtonsPoM.billsBtnClick();
        logoutPoM.logOutMain();

    }
    @Test(description = "only should be verified running cost for current month")
    public void tc2() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        firstScenarioPoM = new FirstScenarioPoM(driver);
        //login and payment
        loginPoM.logIn("adriandezember.blgtests1", "Tester@1234");

        navButtonsPoM.billsBtnClick();
        firstScenarioPoM.clickOnDropDown();
        firstScenarioPoM.chooseNumFromDrop();
        firstScenarioPoM.clickOnRunCostForSecondTest();
        firstScenarioPoM.clickOnDetailRunCost();
        Assert.assertEquals("\uE00F Telephony to mobile network Swisscom, whole week rate, Start Voice", firstScenarioPoM.telephonyToMobileNetwork.getText(), "failed");
        Assert.assertEquals("\uE00F SMS national, whole week rate, Start SMS", firstScenarioPoM.smsNational.getText(), "failed");
        Assert.assertEquals("\uE00F MMS national, Start MMS", firstScenarioPoM.mmsNational.getText(), "failed");
        Assert.assertEquals("\uE00F Packet usage, Lifeline Data", firstScenarioPoM.packetUsageLifeline1.getText(), "failed");
        Assert.assertEquals("\uE00F Packet usage, Lifeline Data", firstScenarioPoM.getPacketUsageLifeline2.getText(), "failed");
        Assert.assertEquals("\uE00F Packet, 3071", firstScenarioPoM.packet3071.getText(), "failed");
        Assert.assertEquals("\uE00F Packet, Start Data", firstScenarioPoM.startData.getText(), "failed");
        Assert.assertEquals("\uE00F SMS, worldwide tariff, Start SMS", firstScenarioPoM.smsWWtarif.getText(), "failed");
        Assert.assertEquals("\uE00F MMS outgoing abroad, Start MMS", firstScenarioPoM.mmsOutStartMms.getText(), "failed");
        Assert.assertEquals("\uE00F Packet, Start Data", firstScenarioPoM.startData2.getText(), "failed");
        Assert.assertEquals("\uE00F MMS incoming abroad, Start MMS", firstScenarioPoM.mmsIncomingStartMms.getText(), "failed");
        Assert.assertEquals("6.92", firstScenarioPoM.total.getText(), "failed");
        navButtonsPoM.billsBtnClick();
        logoutPoM.logOutMain();
//        firstScenarioPoM.clickOnUsageDetails(); - allow later
//        firstScenarioPoM.clickOnFilter(); -- nok

    }
    @Test
    public void tc2Android() throws MalformedURLException, InterruptedException {
        androidSetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        firstScenarioPoM = new FirstScenarioPoM(driver);
        notificationPoM = new NotificationPoM(driver);

        notificationPoM.clickOnNextBtn();
        loginPoM.logIn("adriandezember.blgtests1", "Tester@1234");

        navButtonsPoM.billsBtnClick();
        firstScenarioPoM.findPrepaidNumForAndroid();


        Thread.sleep(2000);
        Assert.assertEquals("Telephony to mobile network Swisscom, whole week rate, Start Voice", firstScenarioPoM.telephonyToMobileNetwork.getText(), "failed");
//        Assert.assertEquals("\uE00F SMS national, whole week rate, Start SMS", firstScenarioPoM.smsNational.getText(), "failed");
//        Assert.assertEquals("\uE00F MMS national, Start MMS", firstScenarioPoM.mmsNational.getText(), "failed");
//        Assert.assertEquals("\uE00F Packet usage, Lifeline Data", firstScenarioPoM.packetUsageLifeline1.getText(), "failed");
//        Assert.assertEquals("\uE00F Packet usage, Lifeline Data", firstScenarioPoM.getPacketUsageLifeline2.getText(), "failed");
//        Assert.assertEquals("\uE00F Packet, 3071", firstScenarioPoM.packet3071.getText(), "failed");
//        Assert.assertEquals("\uE00F Packet, Start Data", firstScenarioPoM.startData.getText(), "failed");
//        Assert.assertEquals("\uE00F SMS, worldwide tariff, Start SMS", firstScenarioPoM.smsWWtarif.getText(), "failed");
//        Assert.assertEquals("\uE00F MMS outgoing abroad, Start MMS", firstScenarioPoM.mmsOutStartMms.getText(), "failed");
//        Assert.assertEquals("\uE00F Packet, Start Data", firstScenarioPoM.startData2.getText(), "failed");
//        Assert.assertEquals("\uE00F MMS incoming abroad, Start MMS", firstScenarioPoM.mmsIncomingStartMms.getText(), "failed");
//        Assert.assertEquals("6.92", firstScenarioPoM.total.getText(), "failed");
        navButtonsPoM.billsBtnClick();
        logoutPoM.logOutBtnAndroid();

    }


    @Test
    public void tc3() throws IOException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        firstScenarioPoM = new FirstScenarioPoM(driver);
        //login and payment
        loginPoM.logIn("rfshscye.ftcbhyxviv", "SixTest@12");
        navButtonsPoM.billsBtnClick();
        firstScenarioPoM.thirdTestFirstScen();
        firstScenarioPoM.openAndClosePdf();
        String pdfText = String.valueOf(pdfUtil.getText("/Users/sixsentix/Desktop/pdfs//MYSWISSCOM_BiMonthly.pdf"));
        System.out.println("This is translated text from pdf is : " + pdfText);
        Assert.assertTrue(pdfText.contains("Bilnaz Aebli"),"failed");
        Assert.assertTrue(pdfText.contains("CHF 81.90"),"failed");
        Assert.assertTrue(pdfText.contains("032 931 35 98"), "failed");
        //logout
        navButtonsPoM.billsBtnClick();
        logoutPoM.logOutMain();



    }
    @Test(description = "pdfs should be verified only")
    public void tc4() throws IOException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        firstScenarioPoM = new FirstScenarioPoM(driver);
        //login and payment
        loginPoM.logIn("vlrhpos", "SixTest@1");
        navButtonsPoM.billsBtnClick();

        firstScenarioPoM.firstBp();
        firstScenarioPoM.openAndClosePdf();
//        accesabilityid --> QLOverlayDoneButtonAccessibilityIdentifier

        String pdfText = String.valueOf(pdfUtil.getText("/Users/sixsentix/Desktop/pdfs/MYSWISSCOM_00 (1).pdf"));
        System.out.println("This is text from pdf : " + pdfText);

        Assert.assertTrue(pdfText.contains("Jayke Jock"),"failed");
        Assert.assertTrue(pdfText.contains("CHF 160.35"),"failed");

        secondScenarioPoM.arrBack();
        firstScenarioPoM.secondBp();
        firstScenarioPoM.openAndClosePdf();

        String pdfTextSec = String.valueOf(pdfUtil.getText("/Users/sixsentix/Desktop/pdfs/MYSWISSCOM_00 (2).pdf"));
        System.out.println("This is text from pdf : " + pdfTextSec);
        Assert.assertTrue(pdfTextSec.contains("Jayke Jock"),"failed");
        Assert.assertTrue(pdfTextSec.contains("CHF 103.25"),"failed");

        navButtonsPoM.billsBtnClick();
        logoutPoM.logOutMain();

    }

}
