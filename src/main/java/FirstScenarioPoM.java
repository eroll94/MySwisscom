import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.interactions.touch.TouchActions;

import javax.annotation.OverridingMethodsMustInvokeSuper;
import java.util.HashMap;

public class FirstScenarioPoM extends Base{

    HashMap<String,Object>scrollObject=new HashMap<>();
    public FirstScenarioPoM(AppiumDriver driver) {
        super(driver);
    }
    //////////////////////////COMMON THINGS FOR FIRST SCENARIO////////////////////////////

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All invoicing accounts\"]")
    MobileElement dropdownInv;
//    acesabilityid = All invoicing accounts

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Details of the runnings costs\"]")
    MobileElement detailsOfTheRunningCosts;

    //accessabilityid ---? Details of the runnings costs
    ///////////////////////////////////////////////////////////////////////////////////
    //////////////////FIRST SCENARIO///////////////////////////////////////////

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]/XCUIElementTypeOther")
    MobileElement firstScenClickOnRunCost;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"All contracts\"")
    MobileElement allContracts;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"079 797 20 95\"")
    MobileElement numForFirstScen;


    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Invoice details\"")
    MobileElement invoiceDetails;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"main\"`]/XCUIElementTypeOther[7]/XCUIElementTypeOther")
    MobileElement curCostMain;
    //xpath //XCUIElementTypeOther[@name="main"]/XCUIElementTypeOther[7]/XCUIElementTypeOther

    @iOSXCUITFindBy(xpath = "/html/body/next-root/next-root/ion-app/next-billing-landing-page/next-billing-current-costs/next-billing-subpage/div/ion-content/div/div/next-billing-subpage-content/div/div[2]/next-box/sdx-card/div/div[1]/div/div/div/div[2]/div/sdx-expand-and-collapse/div/next-billing-detail-tab[1]/div/div[2]/div[1]")
    MobileElement firstElement;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"952.45\"")
    MobileElement currMonthforFirstTestCost;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"846.25\"]")
    MobileElement billForPrevMonthFirstTest;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"079 000 21 23\"")
    MobileElement numForFirstTestInFirstScenario;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeLink[`label == \"Back to previous page.\"`][3]")
//            (xpath = "(//XCUIElementTypeLink[@name=\"Back to previous page.\"])[3]")
    MobileElement backToPreviosPageFirstScenario;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"blue Mobile L\"")
    MobileElement mobileLFirstTest;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Intercontinental Pack\"")
    MobileElement intercontinentalFirstTest;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Simply Digital\"")
    MobileElement simplyDigFirstTest;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"139.90\" AND name == \"139.90\" AND value == \"3\"")
//            (xpath = "(//XCUIElementTypeStaticText[@name=\"139.90\"])[2]")
    MobileElement totalSubFirstTest;


    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"91.90\"])[1]")
    MobileElement conOutgoingAbroad;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Telephony, included\"])[1]")
    MobileElement telephonyIncludedFirstTest;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Telephony, standard tariff\"])[1]")
    MobileElement telephonyStandardTarifFirstTest;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F SMS/MMS, included\"]")
    MobileElement smsMmsIncludedFirstTest;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"10.80\"])[1]")
    MobileElement conIncommingAbroad;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Telephony, included\"])[2]")
    MobileElement telephonyIncludedFirstTestIncoming;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Telephony, standard tariff\"])[2]")
    MobileElement telStandardIncoming;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Total CHF 102.70\"")
    MobileElement totalConFirstTest;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Usage details\"]")
    MobileElement usageDetailsFirstTest;
    /////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////SECOND SCENARIO////////////////////////////////////////////

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"079 000 11 49\"])[2]")
//            classchain ---> **/XCUIElementTypeStaticText[`label == "079 000 26 06"`][2]
            //name----? 079 000 26 06
    MobileElement choosePhoneNumForSecondTest;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"6.92\"]")
// ios predicate --> label == "42.72"
    MobileElement clickOnRunningCostForSecondTest;

    //class chain ---> **/XCUIElementTypeLink[`label == "Display details for June 2022"`]
    //predicate -----> label == "Display details for June 2022"


    //connections -- ver
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F Telephony to mobile network Swisscom, whole week rate, Start Voice\"]")
    MobileElement telephonyToMobileNetwork;

    //accesId -->  Telephony to mobile network Swisscom, whole week rate, Start Voice

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F SMS national, whole week rate, Start SMS\"]")
    MobileElement smsNational;

    //accessId -->  SMS national, whole week rate, Start SMS

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F MMS national, Start MMS\"]")
    MobileElement mmsNational;

    //accessId -->  MMS national, Start MMS

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet usage, Lifeline Data\"])[1]")
    MobileElement packetUsageLifeline1;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet usage, Lifeline Data\"])[2]")
    MobileElement getPacketUsageLifeline2;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, 3071\"])[1]")
    MobileElement packet3071;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, Start Data\"])[1]")
    MobileElement startData;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F SMS, worldwide tariff, Start SMS\"]")
    MobileElement smsWWtarif;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F MMS outgoing abroad, Start MMS\"]")
    MobileElement mmsOutStartMms;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, 3071\"])[2]")
    MobileElement packet2;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, Start Data\"])[2]")
    MobileElement startData2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F MMS incoming abroad, Start MMS\"]")
    MobileElement mmsIncomingStartMms;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"6.92\"])[2]")
    MobileElement total;

//    iosclasschain --> **/XCUIElementTypeOther[`value == "3"`][3]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Usage details\"]")
    MobileElement usageDetails;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Filter\"]")
    MobileElement filter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"160.35\"]")
    //(iOSClassChain = "**/XCUIElementTypeOther[`label == \"main\"`]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]")
    MobileElement biMonthlyFirst;
    //-->xpath //XCUIElementTypeOther[@name="main"]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"103.25\"]")
    MobileElement biMonthlySecond;
    //-->xpath //XCUIElementTypeOther[@name="main"]/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Bill\"]")
    MobileElement bill;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Done\"`]")
    MobileElement doneBtnPdf;

    public void clickOnDropDown(){
        click(dropdownInv);
    }

    public void chooseNumFromDrop(){
        click(choosePhoneNumForSecondTest);
    }

    public void clickOnRunCostForSecondTest(){
        click(clickOnRunningCostForSecondTest);
    }
    public void clickOnUsageDetails(){
        click(usageDetails);
    }

    public void clickOnFilter(){
        click(filter);
    }
    public void clickOnDetailRunCost(){
        click(detailsOfTheRunningCosts);
    }

    public void firstBp(){
        click(biMonthlyFirst);
    }
    public void secondBp(){
        click(biMonthlySecond);
    }
    public void openAndClosePdf() throws InterruptedException {

        HashMap<String,Object>scrollObject=new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("xpath","//XCUIElementTypeButton[@name=\"Bill\"]");
        driver.executeScript("mobile:scroll", scrollObject);
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Bill\"]").click();
        Thread.sleep(7000);
        //click on done btn to close pdf
        TouchAction touchActionLogoutDone = new TouchAction(driver);
        touchActionLogoutDone.tap(PointOption.point(7, 47))
                .perform();
    }

    public void clickOnFirstContainerInfirstScen(){
        click(firstScenClickOnRunCost);
        click(allContracts);
        click(numForFirstScen);
        click(invoiceDetails);
    }

    public void verifyRunningCost(){

        scrollObject.put("direction", "down");
        scrollObject.put("xpath","//XCUIElementTypeStaticText[@name=\"952.45\"]");
        driver.executeScript("mobile:scroll", scrollObject);
//        driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"952.45\"]").click();
        click(currMonthforFirstTestCost);
        click(allContracts);
        click(numForFirstTestInFirstScenario);
        click(detailsOfTheRunningCosts);
    }

    public void clickOnBillForPreviosMonth(){
        scrollObject.put("direction", "down");
        scrollObject.put("xpath","//XCUIElementTypeStaticText[@name=\"846.25\"]");
        driver.executeScript("mobile:scroll", scrollObject);
        click(billForPrevMonthFirstTest);
        click(allContracts);
        click(numForFirstTestInFirstScenario);
    }



}
