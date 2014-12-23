package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class OrderPageByDriver {
	WebDriver driver;
	WebElements web;
	Logger log;
	
	
	public OrderPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(LoginPageByDriver.class);
	}
	
	public void pressLogoAlloButton() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickButton("OrderPage.logoAlloButton");
		//web.clickButton(".//*[(@class='logo')]/*[contains(@src,'http://i.allo.ua/skin/frontend/enterprise/allo/images/logo.png')]");
	}

}
