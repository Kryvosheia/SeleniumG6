package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class TabletEBookPageByDriver {
	WebDriver driver;
	WebElements web;
	Logger log;
	
	
	public TabletEBookPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(LoginPageByDriver.class);
	}
	
	public void pressEBookLightLink() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickLink("TabletEBookPage.eBookLightLink");
		//web.clickLink(".//a[contains(text(),'Электронные книги с подсветкой')]");
	}

}
