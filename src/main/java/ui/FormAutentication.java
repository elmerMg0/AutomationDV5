package ui;

import org.openqa.selenium.By;

public class FormAutentication {
    public static By username = By.id("ctl00_MainContent_LoginControl1_TextBoxEmail");
    public static By password = By.id("ctl00_MainContent_LoginControl1_TextBoxPassword");

    public static By loginButton = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]");
    public static By logoutButton = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");

    public static By alertSuccess = By.xpath("//*[@id=\"flash\"]");
    public static By alertError = By.xpath("//*[@id=\"flash\"]");
}
