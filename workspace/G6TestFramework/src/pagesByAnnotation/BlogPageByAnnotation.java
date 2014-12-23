package pagesByAnnotation;
	
	
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class BlogPageByAnnotation {
	    WebDriver driver;
	    Logger log;
	    WebDriverWait waitForCondition;

	    public BlogPageByAnnotation(WebDriver driver) throws IOException {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        log = org.apache.log4j.Logger.getLogger(BlogPageByAnnotation.class);
	        waitForCondition = new WebDriverWait(driver, 5);//explicitly waits
	    }

	    @FindBy(xpath = ".//*[@id=\"menu-item-8\"]/a[contains(text(),\"Обзоры и сравнения\")]")
	    WebElement linkSurvey;

	    @FindBy(xpath = ".//*[@id=\"menu-item-15\"]/a[contains(text(),'Телефоны и смартфоны')]")
	    WebElement linkPhones;

	    @FindBy(xpath = ".//li[4]/*[@class='info']/a")
	    WebElement linkItemToSelect;

	    @FindBy(xpath = ".//li[@class='product'][contains(.,'Товар есть в наличии')]/a[@class='button']")
	    WebElement buttonGoToMarket;

	    public void clickLinkSurvey() {
	        linkSurvey.click();
	    }

	    public void clickLinkPhones() {
	        linkPhones.click();
	    }

	    public void clickLinkItem() {
	        linkItemToSelect.click();
	    }

	    public void clickButtonGoToMarket() {
	        buttonGoToMarket.click();
	        log.info("Available product was found");
	    }
}


