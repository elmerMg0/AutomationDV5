package task.validations;

import actions.WaitUnitElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;

public class IsDeleteElement {
    public static boolean visible (WebDriver webDriver){
        return WaitUnitElement.isVisible(webDriver, AddRemove.remove);

    }
}
