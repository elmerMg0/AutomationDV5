import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.AddNewTask;
import task.tasking.AddProyect;

public class AddNewTaskTest extends BaseTest {
    @Test
    public void authenticationSuccessTest() {
        AddNewTask.as(webDriver, "elmermendoza@gmail.com", "password", "Task to do");
    }
}
