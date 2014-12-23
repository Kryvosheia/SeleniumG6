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

import pagesByAnnotation.AlloByAnnotation;
import pagesByDriver.AlloByDriver;

public class Test_1a {
	public static WebDriver driver;
	static AlloByAnnotation allo;
	static Logger log;
	static Map<String,String> data = new HashMap<String,String>();
	
	@BeforeClass
	public static void setUp() throws Exception {
		driver = new FirefoxDriver();
		allo = new AlloByAnnotation(driver);
		log = Logger.getLogger(Test_1d.class);
		data = ExcelDriver.getData("src//testData.xls", "Test_1a");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws Exception {
		allo.homePage.openURL("http://allo.ua/customer/account/create/");
		allo.registrationPage.inputName(data.get("Name"));
		allo.registrationPage.inputEmail(data.get("Email"));		
		allo.registrationPage.inputPassword(data.get("Password"));
		allo.registrationPage.clickContinueRegistrationButton();

	}

	@AfterClass
	public static void stopTest() {
		driver.quit();
	}

}
