import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ThirdScenarioPoM extends Base{

    public ThirdScenarioPoM(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pay later\"]")
    MobileElement PayLater;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
    MobileElement ButtonNext;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"1\"`][2]")
    MobileElement PaymentDeadline;
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Back to previous page.\"")
    MobileElement ButtonBack;
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"New deadline\"")
    MobileElement NewDeadline;
    String expectedMessage = "New deadline";
    public void clickPayLater(){
        click(PayLater);
    }

    public void clickButtonNext(){
        click(ButtonNext);
    }

    public void clickPaymentDeadline(){
        click(PaymentDeadline);
    }

    public void clickButtonBack(){
        click(ButtonBack);
    }


}
