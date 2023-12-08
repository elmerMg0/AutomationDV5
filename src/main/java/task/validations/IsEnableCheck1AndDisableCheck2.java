package task.validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.CheckboxList;
import ui.FormAutentication;

public class IsEnableCheck1AndDisableCheck2 {

    public static boolean checkbox1EnableCheckbox2Disable(WebDriver webDriver){
        WebElement elementCheckbox1 = webDriver.findElement(CheckboxList.checkbox1);
        WebElement elementCheckbox2 = webDriver.findElement(CheckboxList.checkbox2);
        return elementCheckbox1.isSelected() && !elementCheckbox2.isSelected();
    }

    public static boolean checkbox1Enable(WebDriver webDriver){
        WebElement elementCheckbox1 = webDriver.findElement(CheckboxList.checkbox1);
        return elementCheckbox1.isSelected();
    }
}
