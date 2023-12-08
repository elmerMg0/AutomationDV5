package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.FormAutentication;
import ui.HomePage;
import ui.HomePageTodo;

public class Login {
    public static void as (WebDriver webDriver, String username, String password){
        Click.on(webDriver, HomePageTodo.loginBtn);
        //Click.on(webDriver, FormAutentication.username);
        Enter.text(webDriver, FormAutentication.username, username);
        //Click.on(webDriver, FormAutentication.password);
        Enter.text(webDriver, FormAutentication.password, password);
        Click.on(webDriver, FormAutentication.loginButton);
        //ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Remove Elements");
    }
}
