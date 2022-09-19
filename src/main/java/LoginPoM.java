import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPoM extends Base{

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
//            acesabiliti -  Log in
    MobileElement loginBtnMain;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Username or mobile number'")
    MobileElement usernameElement;

    @iOSXCUITFindBy (iOSNsPredicate = "label == 'Continue'")
    MobileElement continueBtn;

    @iOSXCUITFindBy (iOSNsPredicate = "label == 'Password'")
    MobileElement passwordElement;

    @iOSXCUITFindBy (iOSNsPredicate = "label == 'Login'")
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
    public void logIn(String username, String password){
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


