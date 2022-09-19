import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class NotificationPoM extends Base{
    public NotificationPoM(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Next\"")
    MobileElement notNextBtn;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Configure push notifications\"")
    MobileElement pushNotiBtn;

    public void clickOnNextBtn(){
        click(notNextBtn);
    }

    public void clickOnNotifyBtn(){
        click(pushNotiBtn);
    }

//    class chain
//        **/XCUIElementTypeButton[`label == "Next"`]
//
//    predicate
//    label == "Next"

//    class chain
//            **/XCUIElementTypeButton[`label == "Configure push notifications"`]
//
//    predicate
//    label == "Configure push notifications"

}
