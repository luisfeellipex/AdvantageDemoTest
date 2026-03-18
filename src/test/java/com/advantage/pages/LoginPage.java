package com.advantage.pages;

import com.advantage.elements.LoginElements;

public class LoginPage extends LoginElements {
    private CommonPage commonPage;

    public LoginPage() {
        this.commonPage = new CommonPage();
    }

    public void fillUsername(String username) {
        commonPage.writeText(usernameInput, username);
    }

    public void fillPassword(String password) {
        commonPage.writeText(passwordInput, password);
    }

    public void clickLogin() {
        commonPage.clickElement(loginButton);
        commonPage.waitForPopUp();
    }
}