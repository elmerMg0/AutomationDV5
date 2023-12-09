package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.*;

public class AddNewTask {
    public static void as(WebDriver webDriver, String username, String password, String taskName){
        Click.on(webDriver, HomePageTodo.loginBtn);
        Enter.text(webDriver, FormAutentication.username, username);
        Enter.text(webDriver, FormAutentication.password, password);
        Click.on(webDriver, FormAutentication.loginButton);

        Click.on(webDriver, DashboardTodo.diplomadV5Btn);
        Enter.text(webDriver, DashboardTodo.newTaskInput, taskName);
        Click.on(webDriver, DashboardTodo.addNewTaskBtn);
    }
}
