package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.FormAutentication;
import ui.FormRegister;
import ui.HomePage;
import ui.HomePageTodo;

public class SignUp {
    public static void as (WebDriver webDriver, String fullname, String email, String passowrd){
        Click.on(webDriver, HomePageTodo.signupBtn);
        //Click.on(webDriver, FormAutentication.username);
        Enter.text(webDriver, FormRegister.fullname, fullname);
        //Click.on(webDriver, FormAutentication.password);
        Enter.text(webDriver, FormRegister.email, email);
        Enter.text(webDriver, FormRegister.password, passowrd);
        Click.on(webDriver, FormRegister.acceptTermBtn);
        Click.on(webDriver, FormRegister.signupBtn);
        //ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Remove Elements");
    }
}
