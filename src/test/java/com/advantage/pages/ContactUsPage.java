package com.advantage.pages;

import com.advantage.elements.ContactUsElements;

public class ContactUsPage extends ContactUsElements {
    private CommonPage commonPage;

    public ContactUsPage() {
        this.commonPage = new CommonPage();
    }

    public void clickContactMenu() {
        commonPage.clickElement(contactMenuLink);
    }

    public void selectCategory(String category) {
        commonPage.selectComboBox(categoryDropdown, category);
    }

    public void selectProduct(String product) {
        commonPage.waitForTextToBePresent(productDropdown, product);
        commonPage.selectComboBox(productDropdown, product);
    }

    public void fillEmail() {
        commonPage.writeText(emailInput, "luisfelipe.ta@hotmail.com");
    }

    public void fillSubject() {
        commonPage.writeText(subjectTextarea, "Descrição de Assunto - Prova TA");
    }

    public void clickSend() {
        commonPage.clickElement(sendButton);
    }

    public boolean isMessageSent() {
        return commonPage.isElementVisible(successMessageLabel);
    }
}