package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderModalPageByAnnotation {
	WebDriver driver;
	Logger log;
	WebDriverWait waitForCondition;

	
	public OrderModalPageByAnnotation (WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(OrderModalPageByAnnotation.class);
		PageFactory.initElements (driver, this);
		waitForCondition = new WebDriverWait(driver, 5);


	}
	
	@FindBy(xpath=".//a[contains(@class,'button red checkout-link')]/*[contains(text(),'Оформить заказ')]")
	WebElement orderButton;
	
	public void clickOrderButton(){
		orderButton.click();
	}
	

}
