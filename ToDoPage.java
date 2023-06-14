package com.techfios.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

@SuppressWarnings("unused")
public class ToDoPage {

    private WebDriver driver;

    // Locate elements
    private By toggleAllCheckbox = By.name("allbox");
    // ... other elements

    public ToDoPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to toggle all checkbox
    public void toggleAll() {
        driver.findElement(toggleAllCheckbox).click();
    }

    // ... other methods for actions
}