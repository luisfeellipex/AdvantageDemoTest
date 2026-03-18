package com.advantage.elements;

import org.openqa.selenium.By;

public class ContactUsElements {
    protected By contactMenuLink = By.cssSelector("ul.desktop-handler a[translate='CONTACT_US']");
    protected By categoryDropdown = By.name("categoryListboxContactUs");
    protected By productDropdown = By.name("productListboxContactUs");
    protected By emailInput = By.name("emailContactUs");
    protected By subjectTextarea = By.name("subjectTextareaContactUs");
    protected By sendButton = By.id("send_btn");
    protected By successMessageLabel = By.cssSelector(".successMessage");
}