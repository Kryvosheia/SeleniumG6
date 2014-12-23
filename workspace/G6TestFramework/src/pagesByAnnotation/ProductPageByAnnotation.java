package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPageByAnnotation {
	WebDriver driver;
    Logger log;
	WebDriverWait waitForCondition;

    
    public ProductPageByAnnotation(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        log = Logger.getLogger(ProductPageByAnnotation.class);
		waitForCondition = new WebDriverWait(driver, 5);

    }

    @FindBy(xpath = ".//*[@class='toolbar-top']/*/*/*/*/*/span[@class='line']")
    WebElement sortByDropdown;

    @FindBy(xpath = ".//*[@class='toolbar-top']/*/*/*/*/*/ul[@class='sort-list']/li[2]/a")
    WebElement itemFromHighToLow;

    @FindBy(xpath = ".//span[contains(text(),'Акционные предложения')]")
    WebElement filterPromo;

    @FindBy(xpath = ".//*[@class=\"from-wrapper\"]/label[span[contains(text(),\"до\")]]/input")
    WebElement fieldPriceTo;

    @FindBy(xpath = ".//*[@id='price_slider_submit']")
    WebElement buttonSubmitPriceFilter;

    @FindBy(xpath = ".//*[@id='advancednavigation-filter-content-brand_foto']/ol/li[1]/a/span")
    WebElement filterManufacturer;

    @FindBy(xpath = ".//span[@class='filter-name'][contains(text(),'Сенсорный дисплей')]")
    WebElement filterSensorDisplay;

    @FindBy(xpath = ".//*[@id='advancednavigation-filter-content-sensornyj_displej_foto']/*/*/a/span[contains(text(),\"Есть\")]")
    WebElement filterSensorDisplayIsPresent;

    @FindBy(xpath = ".//li[1]/a[@title='Сбросить фильтр']/span")
    WebElement filterReset;

    @FindBy(xpath = ".//button[@class='btn-yellow button']")
    WebElement filterResetAll;

    @FindBy(xpath = ".//li[contains(.,'Товар есть в наличии')][1]/*/*/*/button")
    WebElement buttonBuyAvailable;

    @FindBy(xpath = ".//*[@id='button-checkout-popup']/span")
    WebElement buttonToCheckout;


    public void hoverOnSortByDropdown() {
        Actions action = new Actions(driver);
        action.moveToElement(sortByDropdown);
    }

    public void clickItemFromHighToLow() {
        itemFromHighToLow.click();
    }

    public void selectFilterPromo() {
        filterPromo.click();
    }

    public void inputFieldrPriceTo(String priceTo) {
        fieldPriceTo.clear();
        fieldPriceTo.sendKeys(priceTo);
    }

    public void clickButtonSubmitPriceFilter() {
        buttonSubmitPriceFilter.click();
    }

    public void selectFilterManufacturer() {
        filterManufacturer.click();
    }

    public void expandFilterSensorDisplay() {
        filterSensorDisplay.click();
    }

    public void selectFilterSensorDisplay() {
        filterSensorDisplayIsPresent.click();
    }

    public void filterReset() {
        filterReset.click();
        log.info("Filter is reset");
    }

    public void setFilterResetAll(){
        filterResetAll.click();
        log.info("All filters are reset");
    }

    public void clickButtonBuyAvailable() {
        buttonBuyAvailable.click();
    }

    public void clickButtonToCheckout() {
        buttonToCheckout.click();
        log.info("Checkout page opened");

    }
}


