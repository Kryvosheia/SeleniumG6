package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageByAnnotation {
	WebDriver driver;
	Logger log;
	
	public HomePageByAnnotation (WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(HomePageByAnnotation.class);
		PageFactory.initElements (driver, this);

	}
	
public void openURL(String url){
		
		driver.manage().window().maximize();
		driver.get(url);
		/*
		 * If element not found on some site - delete this
		 * If Exception - comment next line
		 */
		//driver.switchTo().frame(0);
	}
	
	@FindBy(xpath=".//a[contains(@title,'Интернет-Магазин Allo')]")
	WebElement logoAlloButton;
	
	@FindBy(xpath=".//a[contains(@href,'http://allo.ua/offline_stores/index/feedback/')]")
	WebElement feedbackLink;
	
	@FindBy(xpath=".//span[contains(text(),'Планшеты и электронные книги')]")
	WebElement tabletEBookButton;
	
	@FindBy(xpath=".//span[(@id='cartHeader')]")
	WebElement cartButton;
	
	@FindBy(xpath=".//*[contains(text(),'Регистрация')]")
	WebElement registrationLink;
	
	@FindBy(xpath=".//*[(@id='first')]")
	WebElement loginLink;
	
	
	public void clickLogoAlloButton(){
		logoAlloButton.click();
	}
	
	public void clickFeedbackLink(){
		feedbackLink.click();
	}
	
	public void clickTabletEbookButton(){
		tabletEBookButton.click();
	}
	
	public void clickCartButton(){
		cartButton.click();
	}
	
	public void clickRegistrationLink(){
		registrationLink.click();
	}
	
	public void clickLoginLink(){
		loginLink.click();
	}
	
}
