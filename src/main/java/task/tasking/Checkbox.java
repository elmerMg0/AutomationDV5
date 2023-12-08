package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.CheckboxList;
import ui.FormAutentication;
import ui.HomePage;

public class Checkbox {
    public static void as (WebDriver webDriver){
        Click.on(webDriver, HomePage.checkbox);
        Click.on(webDriver, CheckboxList.checkbox1);
        Click.on(webDriver, CheckboxList.checkbox2);
    }
}
