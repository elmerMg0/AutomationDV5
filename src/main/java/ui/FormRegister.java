package ui;

import org.openqa.selenium.By;

public class FormRegister {
    public static By fullname = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]");
    public static By email = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]");

    public static By password = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]");

    public static By acceptTermBtn = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]");

    public static By signupBtn = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]");
}
