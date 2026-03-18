package com.advantage.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = DriverManager.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = DriverManager.getExistingDriver();
        try {
            if (driver != null) {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                String status = scenario.isFailed() ? "Failed" : "Passed";
                scenario.attach(screenshot, "image/png", "Evidence_" + status);
            }
        } finally {
            DriverManager.quitDriver();
        }
    }
}