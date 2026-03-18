package com.advantage.steps;

import static org.junit.Assert.assertTrue;
import com.advantage.pages.CommonPage;
import com.advantage.pages.ContactUsPage;
import com.advantage.pages.LoginPage;
import com.advantage.pages.CheckoutPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AdvantageDemoSteps {

    private CommonPage commonPage = new CommonPage();
    private LoginPage loginPage = new LoginPage();
    private ContactUsPage contactUsPage = new ContactUsPage();
    private CheckoutPage checkoutPage = new CheckoutPage();

    @Dado("que navego ate a home page do sistema")
    public void navigateToHome() {
        commonPage.goToHomePage();
    }

    @E("clico no icone de acesso ao perfil")
    public void clickProfileIcon() {
        commonPage.clickUserMenu();
    }

    @E("informo o usuario {string}")
    public void enterUsername(String username) {
        loginPage.fillUsername(username);
    }

    @E("informo a senha {string}")
    public void enterPassword(String password) {
        loginPage.fillPassword(password);
    }

    @Quando("confirmo o login")
    public void confirmLogin() {
        loginPage.clickLogin();
    }

    @Entao("verifico se a sessao foi iniciada com o nome do usuario")
    public void verifySession() {
        assertTrue(commonPage.isUserLogged());
    }

    @E("acesso a secao de fale conosco")
    public void accessContactUs() {
        contactUsPage.clickContactMenu();
    }

    @E("seleciono a categoria no fale conosco {string}")
    public void selectContactCategory(String category) {
        contactUsPage.selectCategory(category);
    }

    @E("seleciono o produto no fale conosco {string}")
    public void selectContactProduct(String product) {
        contactUsPage.selectProduct(product);
    }

    @E("informo o email de contato")
    public void enterContactEmail() {
        contactUsPage.fillEmail();
    }

    @E("informo o assunto da mensagem")
    public void enterContactSubject() {
        contactUsPage.fillSubject();
    }

    @Quando("envio a mensagem")
    public void sendContactMessage() {
        contactUsPage.clickSend();
    }

    @Entao("valido o recebimento do contato")
    public void verifyContactSent() {
        assertTrue(contactUsPage.isMessageSent());
    }

    @E("seleciono a categoria de produto {string}")
    public void selectProductCategory(String category) {
        checkoutPage.clickCategory();
    }

    @E("seleciono o produto de compra {string}")
    public void selectProductToBuy(String product) {
        checkoutPage.clickProduct();
    }

    @E("adiciono o item ao carrinho de compras")
    public void addToCart() {
        checkoutPage.clickAddToCart();
    }

    @E("acesso o checkout")
    public void accessCheckout() {
        checkoutPage.clickCart();
        checkoutPage.clickCheckout();
    }

    @Quando("realizo o pagamento com {string} e {string}")
    public void performPayment(String usernameSP, String passwordSP) {
        checkoutPage.clickNext();
        checkoutPage.fillSafepayDetails(usernameSP, passwordSP);
        checkoutPage.clickPayNow();
    }

    @Entao("o sistema deve exibir a confirmaçao da compra")
    public void verifyOrderConfirmation() {
        assertTrue(checkoutPage.isOrderConfirmed());
    }
}