package task.validations;

import actions.WaitUnitElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.FormAutentication;

public class isLogged {

    public static boolean buttonIsLogout (WebDriver webDriver){
        return WaitUnitElement.isVisible(webDriver, FormAutentication.logoutButton);

    }
}
