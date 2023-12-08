package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUnitElement {
    public static boolean isPresent(WebDriver webDriver, By locator){
        try{
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, 3);
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        }catch (Exception e ){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isVisible(WebDriver webDriver, By locator){
        try{
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, 3);
            webDriverWait.until(ExpectedConditions.visibilityOf(webDriver.findElement(locator)));
            return true;
        }catch (Exception e ){
            e.printStackTrace();
            return false;
        }
    }

//    public static boolean isButtonLogout(WebDriver webDriver, By locator){
//        try{
//            WebDriverWait webDriverWait = new WebDriverWait(webDriver, 3);
//            webDriverWait.until(E)
//            return true;
//        }catch (Exception e){
//            return false;
//        }
//    }
}
