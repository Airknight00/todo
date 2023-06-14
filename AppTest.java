package com.techfios.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
public class AppTest {

    private WebDriver driver;
    private ToDoPage toDoPage;

    @BeforeEach
    public void setUp() {
        // Set the location of the chromedriver executable
    	System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        // Open Chrome Browser
        driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://techfios.com/test/101/");

        // Initialize ToDoPage
        toDoPage = new ToDoPage(driver);
    }

    @Test
    public void testToggleAllCheckbox() {
        // Use the ToDoPage to perform actions
        toDoPage.toggleAll();

        // Assertions to validate that the toggle all checkbox worked
        // ...
    }

    // ... other tests

   // @AfterEach
  //  public void tearDown() {
        // Close the browser
        //driver.quit();
    }
