package pagesByDriver;

import libs.WebElements;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import static libs.ConfigData.ui;

public class BlogPageByDriver {
	WebDriver driver;
	WebElements web;
	Logger log;
	WebDriverWait waitForCondition;

	
	public BlogPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		log = Logger.getLogger(BlogPageByDriver.class);
	}
	
	public void clickLinkSurvey() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//*[@id=\"menu-item-8\"]/a[contains(text(),\"Обзоры и сравнения\")]");
        web.clickLink("BlogPage.linkSurvey");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("BlogPage.linkPhones")));
        log.info("Blog page is opened");
    }

    public void clickLinkPhones() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//*[@id=\"menu-item-15\"]/a[contains(text(),'Телефоны и смартфоны')]");
        web.clickLink("BlogPage.linkPhones");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("BlogPage.titlePhones")));
    }

    public void clickLinkItemToSelect() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        //web.clickLink(".//li[4]/*[@class='info']/a");
        web.clickLink("BlogPage.linkItemToSelect");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("BlogPage.buttonGoToMarket")));
        log.info("Available product was found");
    }

    public void clickbuttonGoToMarket() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //web.clickButton(".//li[@class='product'][contains(.,'Товар есть в наличии')]/a[@class='button']");
        web.clickButton("BlogPage.buttonGoToMarket");
        waitForCondition.until(ExpectedConditions.presenceOfElementLocated(ui("ProductDescriptionPage.buttonBuy")));
        log.info("Product description page was opened");
    }




}



