package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class HomePageByDriver {
	WebDriver driver;
	WebElements web;
	Logger log;
	
	
	public HomePageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(LoginPageByDriver.class);
	}
	
	
	public void pressAlloLogoButton() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickButton("HomePage.logoAlloButton");
		//web.clickButton(".//a[contains(@title,'Интернет-Магазин Allo')]");
	}
	
	public void pressFeedbackLink() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickLink("HomePage.feedbackLink");
		Assert.assertTrue(Boolean.TRUE);
		//web.clickLink(".//a[contains(@href,'http://allo.ua/offline_stores/index/feedback/')]");
	}
	
	public void pressTabletEBookButton() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickLink("HomePage.tabletEBookButton");
		
		//web.clickButton(".//span[contains(text(),'Планшеты и электронные книги')]");
	}
	
	public void pressCartButton() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickButton("HomePage.cartButton");
		//web.clickButton(".//span[(@id='cartHeader')]");
	}
	
	public void pressRegistrationLink() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickLink("HomePage.registrationLink");
		//web.clickLink(".//*[contains(text(),'Регистрация')]");

	}
	
	public void pressLogInLink() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickLink("HomePage.LogInLink");
		//web.clickLink(".//a[contains(@href,'http://allo.ua/offline_stores/index/feedback/')]");
	}
	

}
