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

public class Test_5d {
	public static WebDriver driver;
	static AlloByDriver allo;
	static Logger log;
	static Map<String,String> data = new HashMap<String,String>();
	
	@BeforeClass
	public static void setUp() throws Exception {
		driver = new FirefoxDriver();
		allo = new AlloByDriver(driver);
		log = Logger.getLogger(Test_1d.class);
		data = ExcelDriver.getData("src//testData.xls", "Test_3d");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		allo.webElements.openURL("http://allo.ua/");
		allo.homePage.pressFeedbackLink();
		allo.feedbackPage.inputName(data.get("Name"));
		allo.feedbackPage.inputEmail(data.get("Email"));
		allo.feedbackPage.inputSubjComment(data.get("Subject"));
		allo.feedbackPage.inputComment(data.get("Text"));
		allo.feedbackPage.pressSubmitButton();		
	}

	@AfterClass
	public static void stopTest() {
		driver.quit();
	}
}
	




