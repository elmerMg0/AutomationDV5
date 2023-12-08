package task.validations;

import actions.WaitUnitElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAutentication;

public class IsLoginErrorMessage {
    public static boolean visible(WebDriver webDriver){
        return WaitUnitElement.isVisible(webDriver, FormAutentication.alertSuccess);
    }

    public static String getTextErrorUsername(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormAutentication.alertSuccess);
        return element.getText();
    }
    public static String getTextErrorPassword(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormAutentication.alertSuccess);
        return element.getText();
    }
}
