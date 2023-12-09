package ui;

import org.openqa.selenium.By;

public class DashboardTodo {
    public static By newproyectBtn = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]");
    public static By newProyectInput = By.id("NewProjNameInput");
    public static By newProyectBtnAdd = By.id("NewProjNameButton");


    //public static By diplomadV5Btn = By.id("//*[@id=\"ItemId_4173952\"]/table/tbody/tr/td[3]");
    public static By newTaskInput = By.id("NewItemContentInput");
    public static By diplomadV5Btn = By.className("MainTableLeft");

    public static By addNewTaskBtn = By.id("NewItemAddButton");
}

