package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductDescriptionPageByAnnotation {
	WebDriver driver;
    Logger log;
	WebDriverWait waitForCondition;

    public ProductDescriptionPageByAnnotation(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        log = Logger.getLogger(ProductDescriptionPageByAnnotation.class);
		waitForCondition = new WebDriverWait(driver, 5);

    }

    @FindBy(xpath = ".//button[contains(@id,'buy-button-big')]")
    WebElement buttonBuy;

    @FindBy(xpath = ".//ul[@class='crosssales']/li[@class='item'][1]/input")
    WebElement checkboxCrossales;

    @FindBy(xpath = ".//*[@id='button-checkout-popup']/span")
    WebElement buttonCheckout;


    public void clickButtonBuy() {
        buttonBuy.click();
    }

    public void selectCheckboxCrossales(String checkBoxState) {
        if (checkboxCrossales.isSelected() && checkBoxState.equals("YES")) {
            System.out.println("CheckBox is already selected");
        }

        if (checkboxCrossales.isSelected() && checkBoxState.equals("NO")) {
            checkboxCrossales.click();
        }
    }

    public void clickCheckoutButton(){
        buttonCheckout.click();
        log.info("Checkout page opened");
    }


}
