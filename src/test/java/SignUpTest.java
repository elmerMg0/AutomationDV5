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
        //Assert.assertTrue(IsLoginSuccessMessage.visible(webDriver));
        //Assert.assertEquals(IsLoginSuccessMessage.getTextSuccess(webDriver), "You logged into a secure area!\n×");
        //Assert.assertEquals(IsLoginSuccessMessage.getTextColor(webDriver), "rgba(93, 164, 35, 1)");
    }
   // @Test
    public void authenticationFailedTest(){
        //Error
        Login.as(webDriver, "tomsmithError", "SuperSecretPassword!");
        Assert.assertTrue(IsLoginSuccessMessage.visible(webDriver));
        Assert.assertEquals(IsLoginErrorMessage.getTextErrorUsername(webDriver), "Your username is invalid!\n×");
        //Assert.assertEquals(IsLoginErrorMessage.getTextErrorUsername(webDriver), "Your password is invalid!\n×");
    }
}
