import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPoM extends Base{

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(className = "android.widget.Button")
//    @AndroidFindBy(uiAutomator = "uiAutomator = \"new UiScrollable(new UiSelector().scrollable(true))\" +\n" +
//            "            \".scrollIntoView(new UiSelector().textContains(\"Log \"))\")")
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button\n")
    MobileElement loginBtnMain;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Username or mobile number'")
//    @AndroidFindBy(id = "username")
    @AndroidFindBy(className = "android.widget.EditText")
    MobileElement usernameElement;

    @iOSXCUITFindBy (iOSNsPredicate = "label == 'Continue'")
//    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
//            ".scrollIntoView(new UiSelector().textContains(\"Contin\"))")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"Continue\"))")
//    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"WebView__Window\"]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View/android.widget.Button\n")
    MobileElement continueBtn;

    @iOSXCUITFindBy (iOSNsPredicate = "label == 'Password'")
//    @AndroidFindBy(id = "password")
    @AndroidFindBy(className = "android.widget.EditText")
    MobileElement passwordElement;

    @iOSXCUITFindBy (iOSNsPredicate = "label == 'Login'")
//    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
//            ".scrollIntoView(new UiSelector().textContains(\"Logi\"))")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"Login\"))")
//    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"WebView__Window\"]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.widget.Button")
    MobileElement loginBtn;


    public LoginPoM(AppiumDriver driver) {
        super(driver);
    }

    public void clickOnLogin(){
        click(loginBtnMain);
    }

    public void enterUsername(String username){
        sendText(usernameElement, username);
    }
    public void clickContinue(){
        click(continueBtn);
    }

    public void enterPassword(String password){
        sendText(passwordElement, password);
    }

    public void clickLoginToMain(){
        click(loginBtn);
    }
    public void logIn(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        clickOnLogin();
        enterUsername(username);
        clickContinue();
        enterPassword(password);
        clickLoginToMain();
//        try {
//
//        } catch (Exception e){
//
//            System.out.println("Exception while trying to log in to MySwisscom app");
//        }

    }
}


