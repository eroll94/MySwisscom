import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;

import java.util.HashMap;

public class SecondScenarioPoM extends Base{


    public SecondScenarioPoM(AppiumDriver driver) {
        super(driver);
    }
    HashMap<String,Object> scrollObject=new HashMap<>();
    TouchAction touchActionLogout = new TouchAction(driver);

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Add means of payment\"")
    MobileElement AddPayment;
//    classchain
//    **/XCUIElementTypeLink[`label == "Add means of payment"`]

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSwitch[`value == \"0\"`]")
    MobileElement agreeWith;
//    ios predicate
//            checkInArrow
//    value == "0"

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Next\"`]")
    MobileElement nextBtn;


    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Select means of payment\"")
    MobileElement  clickOnDropDownMenu;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Mastercard\"")
    MobileElement choosePaymentMasterCard;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Visa\"")
    MobileElement choosePaymentVisaCard;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Twint\"")
    MobileElement choosePaymentTwint;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Card no (Mastercard)\"]")
//            (iOSNsPredicate = "label == \"Card no (Mastercard)\" AND name == \"Card no (Mastercard)\" AND value == \"Card no (Mastercard)\"")
//            (iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Card no (Mastercard)\"`]")
            //                  **/XCUIElementTypeStaticText[`label == "Card no (Mastercard)"`]


    MobileElement insertCreditCardNum;
//    ios chain
//        **/XCUIElementTypeStaticText[`label == "Card no (Mastercard)"`]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Expiry\"]")
//                (tagName = "Expiry")
//            (iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Expiry\"`]")
//            (xpath = "//XCUIElementTypeStaticText[@name=\"Expiry\"]")
//            (iOSNsPredicate = "label == \"Expiry\" AND name == \"Expiry\" AND value == \"Expiry\"")
    MobileElement insertExperyDate;

//    ios chain
//            **/XCUIElementTypeStaticText[`label == "Expiry"`]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"CVV\"]")
//            (iOSNsPredicate = "label == \"CVV\" AND name == \"CVV\" AND type == \"XCUIElementTypeOther\"")
    MobileElement addCCV;
//    ccv
//    chain
//    **/XCUIElementTypeOther[`label == "CVV"`]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Continue\"]")
//            (iOSClassChain = "**/XCUIElementTypeButton[`label == \"Next\"`]")
                         //XCUIElementTypeButton[@name="Continue"]
//            (xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
//            (iOSNsPredicate = "label == \"Continue\" AND name == \"Continue\" AND type == \"XCUIElementTypeButton\"")
    MobileElement continueBtn;
//    cnt btn
//    chain
//    **/XCUIElementTypeButton[`label == "Next"`]

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"The new means of payment has been added and you can use it immediately.\"")
    MobileElement verPaymentAdded;

//    new means of payment added verification
//    chain
//    **/XCUIElementTypeStaticText[`label == "The new means of payment has been added and you can use it immediately."`]
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close subpage and back to previous page.\"]")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button")
    MobileElement closePage;

    //xpath //XCUIElementTypeButton[@name="Close subpage and back to previous page."]

//    close page
//    chain
//    **/XCUIElementTypeButton[`label == "Close subpage and back to previous page."`]

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"main\"`]/XCUIElementTypeButton[3]")
    MobileElement deleteAddedPaymentPencil;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"I no longer wish to use this means of payment Delete means of payment\"")
    MobileElement clickToDeletePayment;

//    chain
//    **/XCUIElementTypeButton[`label == "I no longer wish to use this means of payment Delete means of payment"`]

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Confirm\"")
    MobileElement ConfirmDeleteCardBtn;
//    confirm deleted btn
//    chain
//    **/XCUIElementTypeButton[`label == "Confirm"`]

    @iOSXCUITFindBy(iOSClassChain = " **/XCUIElementTypeStaticText[`label == \"Your means of payment has been successfully deleted.\"`]")
    MobileElement VerPaymentHasDeleted;
//    successfuly deleted screen
//    predicate
//    label == "Your means of payment has been successfully deleted." AND name == "Your means of payment has been successfully deleted." AND value == "2" AND type == "XCUIElementTypeStaticText"


    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Invalid card number\"")
    MobileElement invalidCreditCardVerification;
//    invalid card number
//            chain
//      **/XCUIElementTypeStaticText[`label == "Invalid card number"`]
//    predicate

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"Back to previous page.\"])[5]")
    MobileElement arrowBack;

//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"Back to previous page.\"])[5]")
//    MobileElement arrowBack;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"main\"`]/XCUIElementTypeOther[10]/XCUIElementTypeOther")
    //xpath ----> //XCUIElementTypeOther[@name="main"]/XCUIElementTypeOther[10]/XCUIElementTypeOther
    MobileElement payableBy;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Pay online\"`]")
    @AndroidFindBy(accessibility = "Pay online")
//  xpath android --> //android.view.View[@content-desc="Pay online"]
    MobileElement payOnline;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View/android.widget.Button")
//    @AndroidFindBy(className = "android.widget.Button")
    MobileElement payNextBtn;

    @iOSXCUITFindBy(accessibility = "How would you like to pay?")
    MobileElement verAccesability;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back to previous page.\"]")
    MobileElement backToPreviosPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close subpage and back to previous page.\"]")
    MobileElement closeSubPageAndBackToPrevios;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[10]/XCUIElementTypeOther")
    MobileElement secTestOutStanding;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][2]")
//            (xpath = "//XCUIElementTypeStaticText[@name=\"New credit card\"]")
    MobileElement credCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[3]")
//            (iOSNsPredicate = "label == \"Save the new credit card for future payments.\"")
            // classchain --> **/XCUIElementTypeStaticText[`label == "Save the new credit card for future payments."`]
//            (xpath = "//XCUIElementTypeStaticText[@name=\"Save the new credit card for future payments.\"]")
    MobileElement unclickSaveCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Visa\"]")
//            class-chain **/XCUIElementTypeStaticText[`label == "Visa"`]
    MobileElement visaCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Card no (Visa)\"]")
//            (iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Card no (Visa)\"`]")
//            (xpath = "//XCUIElementTypeStaticText[@name=\"Card no (Visa)\"]")
    MobileElement insertVisaCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Expiry\"]")
//            (iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Expiry\"`]")
//            (xpath = "//XCUIElementTypeStaticText[@name=\"Expiry\"]")
    MobileElement insertExpireDate;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"CVV\"]")
//            (iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"CVV\"`]")
//            (xpath = "//XCUIElementTypeStaticText[@name=\"CVV\"]")
    MobileElement insertCCV;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"close_web\"]")

//            classChain **/XCUIElementTypeButton[`label == "close_web"`]
    MobileElement closeWebAddCard;

    public void addPaymentClick(){
        click(AddPayment);
    }
    public void agreeWithTerms(){
        click(agreeWith);
    }
    public void clickNextBtn(){
        click(nextBtn);
    }
    public void clickOnDropDown(){
        click(clickOnDropDownMenu);
    }
    public void chooseCard(){
        click(choosePaymentMasterCard);
    }

    public void addPayment(){
        addPaymentClick();
        clickOnDropDown();
        chooseCard();
        agreeWithTerms();
        clickNextBtn();
    }

    public void insertCardNum(String cardNumber){
        click(insertCreditCardNum);
        sendText(insertCreditCardNum, cardNumber);
    }

    public void insertExpiry(String exp){
        click(insertExperyDate);
        sendText(insertExperyDate, exp);
    }
    public void insertCCV(String ccv){
        click(addCCV);
        sendText(addCCV, ccv);
    }
    public void clickCnt(){
        click(continueBtn);
    }
    public void arrBack(){
        click(arrowBack);
    }

    public void addCreditCardDetails(String cardnumber, String exp, String ccv) throws InterruptedException {
        insertCardNum(cardnumber);
        insertExpiry(exp);
        insertCCV(ccv);
        Thread.sleep(5000);
        TouchAction touchActionLogout = new TouchAction(driver);
        touchActionLogout.tap(PointOption.point(16, 332))
                .perform();
//        clickCnt();
    }

    public void successfullyAddedPayment(){
        getText(verPaymentAdded);
    }

    public void closePage(){
        click(closePage);
    }
    public void getTextFrominvalidCreditCardVerification(){
        getText(invalidCreditCardVerification);
    }

    public void payOnlineMain() throws InterruptedException {
        click(payOnline);
        Thread.sleep(3000);
        click(payNextBtn);
    }
    public void payableByMain(){
        scrollObject.put("direction", "down");
        scrollObject.put("xpath","//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[10]/XCUIElementTypeOther");
        driver.executeScript("mobile:scroll", scrollObject);
        click(payableBy);
//        click(payNextBtn);
    }

    public void closePayOnline(){
        click(backToPreviosPage);
        click(closeSubPageAndBackToPrevios);
    }
    public void backToPreviosPageMain(){
        click(backToPreviosPage);
    }

    public void secTest() throws InterruptedException {
        scrollObject.put("direction", "down");
        scrollObject.put("xpath","//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[10]/XCUIElementTypeOther");
        driver.executeScript("mobile:scroll", scrollObject);
        click(secTestOutStanding);
        click(payOnline);
        click(payNextBtn);
        click(credCard);
        Thread.sleep(2000);

        touchActionLogout.tap(PointOption.point(64, 346))
                .perform();
//        click(unclickSaveCard);
        Thread.sleep(1000);
        click(payNextBtn);
        click(visaCard);
//        click(insertVisaCard);
        sendText(insertVisaCard,"4900000000000003");
//        click(insertVisaCard);
        sendText(insertExpireDate,"06/25");
//        click(insertCCV);
        sendText(insertCCV, "123");
    }
    public void closeWebPayment(){
        click(closeWebAddCard);
    }
    public void closeSubAndBack(){
        click(closeSubPageAndBackToPrevios);
    }

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"payable by\"))")
    MobileElement element;

    public void findByPayableBy(){
        click(element);
    }
}
