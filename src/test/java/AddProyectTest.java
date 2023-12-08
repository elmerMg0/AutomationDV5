import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.AddProyect;
import task.tasking.Login;

public class AddProyectTest extends BaseTest {
    @Test
    public void authenticationSuccessTest() {
        AddProyect.as(webDriver, "elmermendoza@gmail.com", "password", "Diplomado V5");
    }
}
