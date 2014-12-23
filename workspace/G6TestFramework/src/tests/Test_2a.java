package tests;


import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pagesByAnnotation.AlloByAnnotation;


public class Test_2a {
	public static WebDriver driver;
	static AlloByAnnotation allo;
	static Logger log;
	
	@BeforeClass
	public static void setUp() throws Exception {
		driver = new FirefoxDriver();
		allo = new AlloByAnnotation(driver);
		log = Logger.getLogger(Test_1d.class);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		allo.homePage.openURL("http://allo.ua/");
		allo.homePage.clickTabletEbookButton();
		allo.tabletEBookPage.clickeBookLightLink();
		allo.ebookLightPage.focusOnElement1();
		allo.ebookLightPage.clickAddCompare1Link();
		allo.ebookLightPage.focusOnElement2();
		allo.ebookLightPage.clickAddCompare2Link();
		allo.ebookLightPage.focusOnElement3();
		allo.ebookLightPage.clickAddCompare3Link();
		allo.ebookLightPage.clickCompareButton();
		allo.compareGoodsPage.clickBuyButton();
			
	}

	@AfterClass
	public static void stopTest() {
		driver.quit();
	}
	

}
