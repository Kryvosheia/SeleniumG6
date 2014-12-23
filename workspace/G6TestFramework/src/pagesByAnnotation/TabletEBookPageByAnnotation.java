package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TabletEBookPageByAnnotation {
	WebDriver driver;
	WebDriverWait waitForCondition;
	Logger log;
	

	public TabletEBookPageByAnnotation(WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(TabletEBookPageByAnnotation.class);
		PageFactory.initElements (driver, this);
		waitForCondition = new WebDriverWait(driver, 5);
	}
	
	@FindBy(xpath=".//a[contains(text(),'Электронные книги с подсветкой')]")
	WebElement eBookLightLink;
	
	public void clickeBookLightLink(){
		eBookLightLink.click();
	}

}
