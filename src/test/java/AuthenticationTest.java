import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddElement;
import task.tasking.Login;
import task.validations.IsDeleteElement;
import task.validations.IsLoginErrorMessage;
import task.validations.IsLoginSuccessMessage;

public class AuthenticationTest extends BaseTest {
    @Test
    public void authenticationSuccessTest() {
        Login.as(webDriver, "elmermendoza@gmail.com", "password");
    }
}
