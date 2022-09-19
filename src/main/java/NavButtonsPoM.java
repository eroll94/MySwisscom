import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class NavButtonsPoM extends Base {

    public NavButtonsPoM(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeLink[`label == \"Panorama\"`][1]")
    MobileElement panoramaBtn;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeLink[`label == \"Your products\"`][1]")
    MobileElement yourProductsBtn;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeLink[`label == \"Bills\"`][1]")
    MobileElement billsBtn;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeLink[`label == \"Shop\"`][1]")
    MobileElement shopBtn;

    public void panoramaBtnClick(){
        click(panoramaBtn);
    }
    public void yourProductClick(){
        click(yourProductsBtn);
    }

    public void billsBtnClick(){
        click(billsBtn);
    }

    public void shopBtnClick(){
        click(shopBtn);
    }

//xpath    (//XCUIElementTypeLink[@name="Bills"])[1]

}
