package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class CompareGoodsPageByDriver {
	WebDriver driver;
	WebElements web;
	Logger log;
	
	
	public CompareGoodsPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(LoginPageByDriver.class);
	}
	
	public void pressBuyButton() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickButton("CompareGoodsPage.buyButton");
		//web.clickButton(".//*[contains(@name,'buy-button_40922')]");
	}
	

}
