package tests;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_1 {
	static public WebDriver driver = new FirefoxDriver();

	@BeforeClass
	public static void setUp() throws Exception {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		
		//testResult = testResult&&allo.loginPage.isUserLoggedin();
		
	//testResulr&testResult&&allo.loginPage.isUserLoggedin();

	}

	@AfterClass
	public static void stopTest() {
		
		driver.quit();
	}

}
