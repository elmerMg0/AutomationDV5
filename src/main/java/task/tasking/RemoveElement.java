package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.HomePage;

public class RemoveElement {
    public static void as (WebDriver webDriver){
        Click.on(webDriver, HomePage.addRemove);
        Click.on(webDriver, AddRemove.add);
        Click.on(webDriver, AddRemove.remove);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Remove Elements");
    }
}
