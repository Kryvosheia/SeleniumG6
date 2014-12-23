package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class OrderModalPageByDriver {
	WebDriver driver;
	WebElements web;
	Logger log;
	
	
	public OrderModalPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(LoginPageByDriver.class);
	}
	
	public void pressOrderButton() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickButton("OrderModal.orderButton");
		//web.clickButton(".//a[contains(@class,'button red checkout-link')]/*[contains(text(),'Оформить заказ')]");
	}

}
