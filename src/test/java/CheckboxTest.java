import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Checkbox;
import task.validations.*;

public class CheckboxTest extends BaseTest {
    @Test
    public void enableCheck1andDisableCheck2() {
        Checkbox.as(webDriver);
        Assert.assertTrue(IsEnableCheck1AndDisableCheck2.checkbox1EnableCheckbox2Disable(webDriver));
    }

    @Test
    public void checkboxesVisible(){
        Checkbox.as(webDriver);
        Assert.assertTrue(AreCheckboxes.visible(webDriver));
    }
}
