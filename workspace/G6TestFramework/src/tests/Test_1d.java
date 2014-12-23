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

public class Test_1d {
	public static WebDriver driver;
	static AlloByDriver allo;
	static Logger log;
	static Map<String,String> data = new HashMap<String,String>();
	

	@BeforeClass
	public static void setUp() throws Exception {
		driver = new FirefoxDriver();
		allo = new AlloByDriver(driver);
		log = Logger.getLogger(Test_1d.class);
		data = ExcelDriver.getData("src//testData.xls", "Test_1d");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		allo.webElements.openURL("http://allo.ua/customer/account/create/");
		//allo.registrationPage.inputName("ann2");
		allo.registrationPage.inputName(data.get("Name"));
		//allo.registrationPage.inputEmail("annkryvosheia707@gmail.com");
		allo.registrationPage.inputEmail(data.get("Email"));
		//allo.registrationPage.inputPasswor("123456789");
		allo.registrationPage.inputPasswor(data.get("Password"));
		//allo.registrationPage.selectUserAgreementCheckBox("RegistrationPage.userAgreementCheckBox");
		//allo.registrationPage.selectUserAgreementCheckBox(data.get("RemMeCheckbox"));
		allo.registrationPage.pressContinueRegistrationButton("RegistrationPage.continueRegistrationButton");

	}

	@AfterClass
	public static void stopTest() {
		driver.quit();
	}

}


