package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.DashboardTodo;
import ui.FormAutentication;
import ui.HomePageTodo;

public class AddProyect {
    public static void as (WebDriver webDriver, String username, String password, String proyectName){
        Click.on(webDriver, HomePageTodo.loginBtn);
        Enter.text(webDriver, FormAutentication.username, username);
        Enter.text(webDriver, FormAutentication.password, password);
        Click.on(webDriver, FormAutentication.loginButton);

        Click.on(webDriver, DashboardTodo.newproyectBtn);
        Enter.text(webDriver, DashboardTodo.newProyectInput, proyectName);
        Click.on(webDriver, DashboardTodo.newProyectBtnAdd);
    }
}
