package com.advantage.pages;

import com.advantage.elements.CheckoutElements;

public class CheckoutPage extends CheckoutElements {
    private CommonPage commonPage;

    public CheckoutPage() {
        this.commonPage = new CommonPage();
    }

    public void clickCategory() {
        commonPage.clickElement(categoryCard);
    }

    public void clickProduct() {
        commonPage.clickElement(productCard);
    }

    public void clickAddToCart() {
        commonPage.clickElement(addToCartButton);
    }

    public void clickCart() {
        commonPage.clickElement(cartIcon);
    }

    public void clickCheckout() {
        commonPage.clickElement(checkoutButton);
    }

    public void clickNext() {
        commonPage.clickElement(nextButton);
    }

    public void fillSafepayDetails(String username, String password) {
        commonPage.writeText(safepayUsernameInput, username);
        commonPage.writeText(safepayPasswordInput, password);
    }

    public void clickPayNow() {
        commonPage.clickElement(payNowButton);
    }

    public boolean isOrderConfirmed() {
        return commonPage.isElementVisible(orderSuccessLabel);
    }
}