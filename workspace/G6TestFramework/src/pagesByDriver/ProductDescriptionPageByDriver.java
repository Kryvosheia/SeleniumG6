package pagesByDriver;

/**
 * Created by 12qcp on 20.11.14.
 */
import libs.WebElements;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static libs.ConfigData.ui;


public class ProductDescriptionPageByDriver {
    WebDriver driver;
    WebElements web;
    Logger log;
    WebDriverWait waitForCondition;

    public ProductDescriptionPageByDriver(WebDriver driver) {
        this.driver = driver;
        web = new WebElements(driver);
        log = Logger.getLogger(ProductDescriptionPageByDriver.class);
        waitForCondition = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickbuttonBuy() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //web.clickButton(".//button[contains(@id,'buy-button-big')]");
        web.clickButton("ProductDescriptionPage.buttonBuy");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("ProductPage.cartLightbox")));
        log.info("Cart lightbox is opened");
    }

    public void selectCheckboxCrossales(String checkBoxState) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.selectCheckBox(".//ul[@class='crosssales']/li[@class='item'][1]/input", checkBoxState);
        web.selectCheckBox("ProductDescriptionPage.checkboxCrossales", checkBoxState);
        waitForCondition.until(ExpectedConditions.elementSelectionStateToBe(ui("ProductDescriptionPage.checkboxCrossales"), true));
    }

    public void clickButtonCheckout() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
       //web.clickButton(".//*[@id='button-checkout-popup']/span");
        web.clickButton("ProductDescriptionPage.buttonCheckout");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("CheckoutPage.pageTitle")));
        log.info("Checkout page opened");
    }
}