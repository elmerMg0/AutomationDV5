package task.validations;

import actions.WaitUnitElement;
import org.openqa.selenium.WebDriver;
import ui.CheckboxList;

public class AreCheckboxes {
    public static boolean visible (WebDriver webDriver){
        return WaitUnitElement.isVisible(webDriver, CheckboxList.checkbox1) && WaitUnitElement.isVisible(webDriver, CheckboxList.checkbox2);
    }
}
