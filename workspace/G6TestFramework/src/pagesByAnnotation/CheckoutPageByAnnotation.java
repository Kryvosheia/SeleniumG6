package pagesByAnnotation;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;




public class CheckoutPageByAnnotation {
    WebDriver driver;
    Logger log;
    WebDriverWait waitForCondition;


    public CheckoutPageByAnnotation(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        log = Logger.getLogger(CheckoutPageByAnnotation.class);
        waitForCondition = new WebDriverWait(driver, 5);//explicitly waits
    }

    @FindBy(xpath = ".//a[contains(@title,\"Интернет-Магазин Allo\")]")
    WebElement logoAllo;

    @FindBy(xpath = ".//*[@id='login_tab']/a")
    WebElement tabLogin;

    @FindBy(xpath = ".//*[@id='email']")
    WebElement fieldEmail;

    @FindBy(xpath = ".//*[@id='pass']")
    WebElement fieldPassword;

    @FindBy(xpath = ".//*[@id='send2']")
    WebElement buttonSend;

    @FindBy(xpath = ".//*[@id='address_telephone_number']")
    WebElement fieldPhone;

    @FindBy(xpath = ".//*[@id='address_city']")
    WebElement fieldCity;

    @FindBy(xpath = ".//li[contains(text(),'Курьерская доставка')]")
    WebElement chooseDelivery;

    @FindBy(xpath = ".//a[contains(text(),'Remove')]")
    WebElement removeProduct;


    public void clickLogoAllo(){
        logoAllo.click();
        log.info("Home page is displayed");
    }

    public void clickTabLogin(){
        tabLogin.click();
    }

    public void inputEmail(String email){
        fieldEmail.clear();
        fieldEmail.sendKeys(email);
    }

    public void inputPassword(String password){
        fieldPassword.clear();
        fieldPassword.sendKeys(password);
    }

    public void clickButtonSend(){
        buttonSend.click();
        log.info("You are logged in");
    }

    public void inputPhone(String phoneNumber){
        fieldPhone.clear();
        fieldPhone.sendKeys(phoneNumber);
    }

    public void inputCity(String city){
        fieldCity.clear();
        fieldCity.sendKeys(city);
    }

    public void clickChooseDelivery(){
        chooseDelivery.click();
    }

    public void clickRemoveProduct(){
        removeProduct.click();
        log.info("Selected product was removed");
    }
}
