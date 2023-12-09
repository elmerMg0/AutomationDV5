import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.Login;

public class AuthenticationTest extends BaseTest {
    @Test
    public void authenticationSuccessTest() {
        Login.as(webDriver, "elmermendoza@gmail.com", "password");
    }
}
