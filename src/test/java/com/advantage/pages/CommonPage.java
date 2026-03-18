package com.advantage.pages;

import com.advantage.elements.CommonElements;
import com.advantage.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends CommonElements {
    private WebDriver driver;
    private WebDriverWait wait;

    public CommonPage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    public void goToHomePage() {
        driver.get("https://advantageonlineshopping.com/");
    }

    public void clickUserMenu() {
        clickElement(userMenuIcon);
    }

    public boolean isUserLogged() {
        return isElementVisible(loggedUserLabel);
    }
    
    public void waitForLoader() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
    }

    public void waitForPopUp() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(popUp));
    }

    public void clickElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        waitForLoader();
        element.click(); 
    }

    public void writeText(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.clear();
        element.sendKeys(text);
    }

    public void selectComboBox(By locator, String text) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
        new Select(dropdown).selectByVisibleText(text);
    }

    public void waitForTextToBePresent(By locator, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public boolean isElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).isDisplayed();
    }
}