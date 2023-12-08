import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddElement;
import task.tasking.RemoveElement;
import task.validations.IsAddElement;
import task.validations.IsDeleteElement;

public class AddRemoveTest extends BaseTest {

    @Test
    public void addElementTest(){
        AddElement.as(webDriver);
        Assert.assertTrue(IsDeleteElement.visible(webDriver));
    }
    @Test
    public void removeElementTest(){
        RemoveElement.as(webDriver);
        Assert.assertFalse(IsDeleteElement.visible(webDriver));
    }
}
