package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPageByAnnotation {
	WebDriver driver;
	Logger log;
	WebDriverWait waitForCondition;

	
	public OrderPageByAnnotation (WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(OrderPageByAnnotation.class);
		PageFactory.initElements (driver, this);
		waitForCondition = new WebDriverWait(driver, 5);
	}
	
	@FindBy(xpath=".//*[(@class='logo')]/*[contains(@src,'http://i.allo.ua/skin/frontend/enterprise/allo/images/logo.png')]")
	WebElement logoAlloButton;
	
	public void clicklogoAlloButton(){
		logoAlloButton.click();
	}

}
