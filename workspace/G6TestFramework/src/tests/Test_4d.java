package tests;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import libs.ExcelDriver;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pagesByDriver.AlloByDriver;

public class Test_4d {
	public static WebDriver driver;
	static AlloByDriver allo;
	static Logger log;
	static Map<String,String> data = new HashMap<String,String>();
	
	@BeforeClass
	public static void setUp() throws Exception {
		driver = new FirefoxDriver();
		allo = new AlloByDriver(driver);
		log = Logger.getLogger(Test_1d.class);
		data = ExcelDriver.getData("src//testData.xls", "Test_4d");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		allo.webElements.openURL("http://allo.ua/");
		allo.homePage.pressLogInLink();
		allo.logPage.inputLogEmail(data.get("Email"));
		allo.logPage.inputLogPassword(data.get("Password"));
		allo.logPage.pressSubmitButton();
		
	}

	@AfterClass
	public static void stopTest() {
		driver.quit();
	}

}
