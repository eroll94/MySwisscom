import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class FourthScenarioPoM extends Base{


    public FourthScenarioPoM(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Reactivate connection\"]")
    MobileElement ReactivateConnection;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
    MobileElement ButtonNext;
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Back to previous page.\"")
    MobileElement ButtonBack;
    String expectedMessage = "New deadline";
    public void clickReactivateConnection(){
        click(ReactivateConnection);
    }

    public void clickButtonNext(){
        click(ButtonNext);
    }

    public void clickButtonBack(){
        click(ButtonBack);
    }

}

