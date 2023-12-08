package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
//aciones que se puedan utlilizar
public class Click {



    public static void on(WebDriver webDriver, By locator){
        webDriver.findElement(locator).click();
    }
}
