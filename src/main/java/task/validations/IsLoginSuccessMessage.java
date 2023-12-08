package task.validations;

import actions.WaitUnitElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAutentication;

public class IsLoginSuccessMessage {
    public static boolean visible(WebDriver webDriver){
        return WaitUnitElement.isVisible(webDriver, FormAutentication.alertSuccess);
    }

    public static String getTextSuccess(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormAutentication.alertSuccess);
        return element.getText();
    }

    //validar el color
    public static String getTextColor(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormAutentication.alertSuccess);
        return element.getCssValue("background-color");
    }
}
