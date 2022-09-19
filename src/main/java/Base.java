import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    AppiumDriver driver;

//    public Base(IOSDriver iosDriver){
//        PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
//        driver = iosDriver;
//    }

    public Base(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver;

    }
    public void waitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver, 45);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clear(MobileElement element){
        waitForVisibility(element);
        element.clear();
    }

    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
    }

    public void sendText(MobileElement element, String text){
        waitForVisibility(element);
        element.sendKeys(text);
    }

    public void getText(MobileElement element){
        waitForVisibility(element);
        element.getText();
    }

}
