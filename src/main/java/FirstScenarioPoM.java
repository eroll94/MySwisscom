import io.appium.java_client.*;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import javax.annotation.OverridingMethodsMustInvokeSuper;
import java.util.HashMap;
import java.util.List;

import static io.appium.java_client.MobileBy.AndroidUIAutomator;

public class FirstScenarioPoM extends Base {

    HashMap<String, Object> scrollObject = new HashMap<>();
    Actions action=new Actions(driver);

    TouchAction touchActionLogout = new TouchAction(driver);

    public FirstScenarioPoM(AppiumDriver driver) {
        super(driver);
    }
    //////////////////////////COMMON THINGS FOR FIRST SCENARIO////////////////////////////

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All invoicing accounts\"]")
    MobileElement dropdownInv;
//    acesabilityid = All invoicing accounts

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Details of the runnings costs\"]")
    @AndroidFindBy(className = "android.widget.Button")
//    Details of the runnings costs
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

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"032 931 35 98\"")
    MobileElement numForThirdTestInFirstScenario;


    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeLink[`label == \"Back to previous page.\"`][3]")
//            (xpath = "(//XCUIElementTypeLink[@name=\"Back to previous page.\"])[3]")
    MobileElement backToPreviosPageFirstScenario;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"blue Mobile L\"")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[15]/android.view.View")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"Mobile L\"))")
    MobileElement mobileLFirstTest;


    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Intercontinental Pack\"")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"Intercontinental \"))")
    MobileElement intercontinentalFirstTest;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Simply Digital\"")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"Simply \"))")
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

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"81.90\"])[2]")
    MobileElement biMonthforFirst;

    //class chain ---> **/XCUIElementTypeLink[`label == "Display details for June 2022"`]
    //predicate -----> label == "Display details for June 2022"


    //connections -- ver
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F Telephony to mobile network Swisscom, whole week rate, Start Voice\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Telephony to mobile network Swisscom, whole week rate, Start Voice\"]/android.widget.TextView")
    MobileElement telephonyToMobileNetwork;

    //accesId -->  Telephony to mobile network Swisscom, whole week rate, Start Voice

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F SMS national, whole week rate, Start SMS\"]")
//    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"SMS national, whole week rate, Start SMS\"]/android.widget.TextView")
    @AndroidFindBy(xpath = "//*[contains(@text,'SMS national, whole week rate')]")
//    @AndroidBy(xpath = "//android.view.View[@content-desc=\"SMS national, whole week rate, Start SMS\"]")
    MobileElement smsNational;

    //accessId -->  SMS national, whole week rate, Start SMS
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F MMS national, Start MMS\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"MMS national, Start MMS\"]/android.widget.TextView")
    MobileElement mmsNational;

    //accessId -->  MMS national, Start MMS

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet usage, Lifeline Data\"])[1]")
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Packet usage, Lifeline Data\"])[1]/android.widget.TextView")
    MobileElement packetUsageLifeline1;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet usage, Lifeline Data\"])[2]")
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Packet usage, Lifeline Data\"])[2]/android.widget.TextView")
    MobileElement getPacketUsageLifeline2;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, 3071\"])[1]")
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Packet, 3071\"])[1]/android.widget.TextView")
    MobileElement packet3071;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, Start Data\"])[1]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Packet, Start Data\"]/android.widget.TextView\n")
    MobileElement startData;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F SMS, worldwide tariff, Start SMS\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"SMS, worldwide tariff, Start SMS\"]/android.widget.TextView")

    MobileElement smsWWtarif;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F MMS outgoing abroad, Start MMS\"]")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"MMS outgoing abroad, Start MMS\"]/android.widget.TextView")
    MobileElement mmsOutStartMms;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, 3071\"])[2]")
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Packet, 3071\"])[2]/android.widget.TextView")
    MobileElement packet2;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, Start Data\"])[2]")
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Packet, Start Data\"])[2]/android.widget.TextView")
    MobileElement startData2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F MMS incoming abroad, Start MMS\"]")
//    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"MMS incoming abroad, Start MMS\")")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"MMS incoming abroad, Start MMS\"]/android.widget.TextView")
    //android.view.View[@content-desc=\"Telephony to mobile network Swisscom, whole week rate, Start Voice\"]/android.widget.TextView"
    MobileElement mmsIncomingStartMms;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"6.92\"])[2]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"6.92\"))")
//    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Total CHF 6.92\"))")
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

    public void clickOnDropDown() {
        click(dropdownInv);
    }

    public void chooseNumFromDrop() {
        click(choosePhoneNumForSecondTest);
    }

    public void clickOnRunCostForSecondTest() {
        click(clickOnRunningCostForSecondTest);
    }

    public void clickOnUsageDetails() {
        click(usageDetails);
    }

    public void clickOnFilter() {
        click(filter);
    }

    public void clickOnDetailRunCost() {
        click(detailsOfTheRunningCosts);
    }

    public void firstBp() {
        click(biMonthlyFirst);
    }

    public void secondBp() {
        click(biMonthlySecond);
    }

    public void openAndClosePdf() throws InterruptedException {

        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("xpath", "//XCUIElementTypeButton[@name=\"Bill\"]");
        driver.executeScript("mobile:scroll", scrollObject);
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Bill\"]").click();
        Thread.sleep(7000);
        //click on done btn to close pdf
        TouchAction touchActionLogoutDone = new TouchAction(driver);
        touchActionLogoutDone.tap(PointOption.point(7, 47))
                .perform();
    }

    public void clickOnFirstContainerInfirstScen() {
        click(firstScenClickOnRunCost);
        click(allContracts);
        click(numForFirstScen);
        click(invoiceDetails);
    }

    public void verifyRunningCost() {

        scrollObject.put("direction", "down");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"952.45\"]");
        driver.executeScript("mobile:scroll", scrollObject);
//        driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"952.45\"]").click();
        click(currMonthforFirstTestCost);
        click(allContracts);
        click(numForFirstTestInFirstScenario);
        click(detailsOfTheRunningCosts);
    }

    public void clickOnBillForPreviosMonth() {
        scrollObject.put("direction", "down");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"846.25\"]");
        driver.executeScript("mobile:scroll", scrollObject);
        click(billForPrevMonthFirstTest);
        click(allContracts);
        click(numForFirstTestInFirstScenario);
    }

    public void thirdTestFirstScen() {
        click(dropdownInv);
        click(numForThirdTestInFirstScenario);
        scrollObject.put("direction", "down");
        scrollObject.put("xpath", "(//XCUIElementTypeStaticText[@name=\"81.90\"])[2]");
        driver.executeScript("mobile:scroll", scrollObject);
        click(biMonthforFirst);

    }

    public void findPrepaidNumForAndroid() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().text(\"079 000 11 49\"));")).click();
        Thread.sleep(5000);
       click(clickOnRunningCostAndroid);
    }

    public void findFirstTestAndClickOnRunCostAndroid() throws InterruptedException {
        Thread.sleep(4000);
        clickOnRuninngCostForFirstTestAndroid();
        Thread.sleep(6500);
//        driver.findElementByClassName("android.widget.Button").click();
    }

//    public void clickOnRunningCostAndroid() {
//        driver.findElement(AndroidUIAutomator("new UiScrollable(new UiSelector()"
//                + ".scrollable(true)).scrollIntoView("
//                + "new UiSelector().text(\"Details of the runnings costs\"));")).click();
//    }

    public void clickOnRuninngCostForFirstTestAndroid() {
        driver.findElement(AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().textContains(\"849.75\"));")).click();
//        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true))" +
//                        ".scrollIntoView(new UiSelector().textContains(\"part_text\"))"));


    }
    public void scroolDownDetailCost(){
     click(contractsClick);
     action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//     click(numForAndFirstTest);
     click(clickOnRunningCostAndroid);
//    action.sendKeys(Keys.SHIFT).build().perform();
    action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();

    }
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"contracts\"))")
    MobileElement contractsClick;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"Details of \"))")
    MobileElement clickOnRunningCostAndroid;

    public void clickOnPayableFirstScen() throws InterruptedException {
        click(payableByDiv);
        Thread.sleep(2000);
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();
        Thread.sleep(2000);
//        click(clickOnPdf);

        click(closePdf);
    }

    public void clickOnPayableFirstScenBiMonthly() throws InterruptedException {
        click(payableByDiv);
        Thread.sleep(2000);
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();
        Thread.sleep(2000);
//        click(clickOnPdf);

        click(closePdf);
    }


    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"payable by\"))")
    MobileElement payableByDiv;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"Bil\"))")
    MobileElement clickOnPdf;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    MobileElement closePdf;



}

