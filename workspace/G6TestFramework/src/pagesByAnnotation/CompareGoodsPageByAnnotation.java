package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareGoodsPageByAnnotation {
	WebDriver driver;
	Logger log;
	
	public CompareGoodsPageByAnnotation (WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(CompareGoodsPageByAnnotation.class);
		PageFactory.initElements (driver, this);

	}
	
	@FindBy(xpath=".//*[contains(@name,'buy-button_40922')]")
	WebElement buyButton;
	
	public void clickBuyButton(){
		buyButton.click();
	}

}
