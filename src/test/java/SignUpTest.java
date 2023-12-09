import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.SignUp;
import task.validations.IsLoginErrorMessage;
import task.validations.IsLoginSuccessMessage;

public class SignUpTest extends BaseTest {

    @Test
    public void signUpSuccessTest() {
        SignUp.as(webDriver, "Elmer Mendoza", "elmermendoza@gmail.com", "password");
    }
}
