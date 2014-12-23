package pagesByDriver;


import libs.WebElements;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static libs.ConfigData.ui;


public class CheckoutPageByDriver {
    WebDriver driver;
    WebElements web;
    Logger log;
    WebDriverWait waitForCondition;

    public CheckoutPageByDriver(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(CheckoutPageByDriver.class);
        waitForCondition = new WebDriverWait(driver, 5);//explicitly waits
    }

    public void clickLogoAllo() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//a[contains(@title,\"Интернет-Магазин Allo\")]");
        web.clickLink("HomePage.logoAllo");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("HomePage.titleMarket")));
        log.info("Home page is displayed");
    }

    public void clickTabLogin() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//*[@id='login_tab']/a");
        web.clickLink("CheckoutPage.loginTab");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("CheckoutPage.fieldEmail")));
    }

    public void inputEmail(String email) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.inputText(".//*[@id='email']", email);
        web.inputText("CheckoutPage.fieldEmail", email);
    }

    public void inputPassword(String password) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.inputText(".//*[@id='pass']", password);
        web.inputText("CheckoutPage.fieldPassword", password);
    }

    public void clikButtonSend() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //web.clickButton(".//*[@id='send2']");
        web.clickButton("CheckoutPage.sendButton");
        waitForCondition.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(ui("CheckoutPage.loginTab"))));
        log.info("You are logged in");
    }

    public void inputPhone(String phoneNumber) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.inputText(".//*[@id='address_telephone_number']", phoneNumber);
        web.inputText("CheckoutPage.fieldPhone", phoneNumber);
    }

    public void inputCity(String city) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.inputText(".//*[@id='address_city']", city);
        web.inputText("CheckoutPage.fieldCity", city);
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("CheckoutPage.containerDelivery")));
    }

    public void clickLabelDelivery() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//*[@id='shipping_methods_container']/*/*/a/span[@class="label"]");
        web.clickLink("CheckoutPage.labelDelivery");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("CheckoutPage.fieldDelivery")));
    }

    public void clickChooseDelivery() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//li[contains(text(),'Курьерская доставка')]");
        web.clickLink("CheckoutPage.fieldDelivery");
        log.info("Delivery was selected");
    }

    public void clickRemoveProduct() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //web.clickButton(".//a[contains(text(),'Remove')]");
        web.clickButton("CheckoutPage.removeProduct");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("CheckoutPage.emptyCartLabel")));
        log.info("Selected product was removed");
    }

    public boolean ifLoggedIn() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
        //if (web.isElementPresent(".//*[@id='first'][contains(text(),'Войти')]")){
            if (web.isElementPresent("HomePage.loginLink")){
            log.info("User is logged in");
            return false;
        } else
        log.info("User is not logged in");
            return true;
    }

    public boolean ifSignedUp() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
        //if(web.isElementPresent(".//*[@id='list-of-messages']/li/span[contains(text(),'Пользователь с таким email уже зарегистрирован.')]")){
            if(web.isElementPresent("HomePage.signedUpMessage")){
            log.info("User is already signed up");
            return true;
        }
        else log.info("User is not signed up");
            return false;
    }
}