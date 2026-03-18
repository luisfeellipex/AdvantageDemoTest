package com.advantage.elements;

import org.openqa.selenium.By;

public class CheckoutElements {
    protected By categoryCard = By.id("laptopsImg");
    protected By productCard = By.id("9");
    protected By addToCartButton = By.name("save_to_cart");
    protected By cartIcon = By.id("shoppingCartLink");
    protected By checkoutButton = By.id("checkOutButton");
    protected By nextButton = By.id("next_btn");
    protected By safepayUsernameInput = By.name("safepay_username");
    protected By safepayPasswordInput = By.name("safepay_password");
    protected By payNowButton = By.id("pay_now_btn_SAFEPAY");
    protected By orderSuccessLabel = By.cssSelector("[translate='Thank_you_for_buying_with_Advantage']");
}