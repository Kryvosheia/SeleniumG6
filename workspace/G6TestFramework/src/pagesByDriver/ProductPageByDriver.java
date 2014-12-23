package pagesByDriver;


import libs.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static libs.ConfigData.ui;


public class ProductPageByDriver {
    WebDriver driver;
    WebElements web;
    Logger log;
    WebDriverWait waitForCondition;

    public ProductPageByDriver(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(ProductPageByDriver.class);
        waitForCondition = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    public void hoverOnSortByDropdown() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.hoverOnElement(".//*[@class='toolbar-top']/*/*/*/*/*/span[@class='line']");
        waitForCondition.until(ExpectedConditions.visibilityOfElementLocated(ui("ProductPage.itemFromHighToLow")));
        web.hoverOnElement("ProductPage.sortByDropdown");
    }

    public void clickItemFromHighToLow() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//*[@class='toolbar-top']/*/*/*/*/*/ul[@class='sort-list']/li[2]/a");
        web.clickLink("ProductPage.itemFromHighToLow");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("ProductPage.currentSortFromHighToLow")));
        log.info("Product list was sorted by price from high to low");
    }

    public void selectFilterPromo() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//span[contains(text(),'Акционные предложения')]");
        web.clickLink("ProductPage.filterDiscount");
        waitForCondition.until(ExpectedConditions.elementSelectionStateToBe(ui("ProductPage.checkboxDiscount"), true));
        log.info("Only discount products are displayed");
    }

    public void inputFieldrPriceTo(String priceTo) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.inputText(".//*[@class=\"from-wrapper\"]/label[span[contains(text(),\"до\")]]/input", priceTo);
        web.inputText("ProductPage.fieldPriceTo", priceTo);
    }

    public void clickButtonSubmitPriceFilter() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //web.clickButton(".//*[@id='price_slider_submit']");
        web.clickButton("ProductPage.buttonSubmitPriceFilter");
        waitForCondition.until(ExpectedConditions.invisibilityOfElementLocated(ui("ProductPage.buttonSubmitPriceFilter")));
        log.info("Products were filtered by price");
    }

    public void selectFilterManufacturer() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//*[@id='advancednavigation-filter-content-brand_foto']/ol/li[1]/a/span");
        web.clickLink("ProductPage.filterManufacturer");
        waitForCondition.until(ExpectedConditions.elementSelectionStateToBe(ui("ProductPage.checkboxManufacturer"), true));
        log.info("Products were filtered by manufacturer");
    }

    public void expandFilterSensorDisplay() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//span[@class='filter-name'][contains(text(),'Сенсорный дисплей')]");
        web.clickLink("ProductPage.filterSensorDisplay");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("ProductPage.filterSensorDisplayIsPresent")));
    }

    public void selectfilterSensorDisplayIsPresent() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//*[@id='advancednavigation-filter-content-sensornyj_displej_foto']/*/*/a/span[contains(text(),\"Есть\")]");
        web.clickLink("ProductPage.filterSensorDisplayIsPresent");
        log.info("Only products with sensor display are shown");
    }

    public void filterReset() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//li[1]/a[@title='Сбросить фильтр']/span");
        web.clickLink("ProductPage.filterReset");
        waitForCondition.until(ExpectedConditions.elementSelectionStateToBe(ui("ProductPage.checkboxDiscount"), false));
        log.info("Discount filter is reset");
    }

    public void filterButtonResetAll() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickButton(".//button[@class='btn-yellow button']");
        web.clickButton("ProductPage.buttonResetAllFilters");
        waitForCondition.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(ui("ProductPage.buttonResetAllFilters"))));
        log.info("All filters are reset");
    }

    public void clickButtonBuyAvailable() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //web.clickButton(".//li[contains(.,'Товар есть в наличии')][1]/*/*/*/button");
        web.clickButton("ProductPage.buttonBuyAvailable");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("ProductPage.cartLightbox")));
        log.info("Cart lightbox is opened");
    }

    public void clickButtonToCheckout() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //web.clickButton(".//*[@id='button-checkout-popup']/span");
        web.clickButton("ProductPage.buttonToCheckout");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("CheckoutPage.pageTitle")));
        log.info("Checkout page opened");
    }


}
