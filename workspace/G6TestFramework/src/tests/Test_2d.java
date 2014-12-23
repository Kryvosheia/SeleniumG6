package tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pagesByDriver.AlloByDriver;

public class Test_2d {
	public static WebDriver driver;
	static AlloByDriver allo;
	static Logger log;
	

	@BeforeClass
	public static void setUp() throws Exception {
		driver = new FirefoxDriver();
		allo = new AlloByDriver(driver);
		log = Logger.getLogger(Test_1d.class);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		allo.webElements.openURL("http://allo.ua/");
		allo.homePage.pressTabletEBookButton();
		allo.tabletEBookPage.pressEBookLightLink();
		allo.ebookLightPage.hoverOn1();
		allo.ebookLightPage.pressAddCompare1Link();
		allo.ebookLightPage.hoverOn2();
		allo.ebookLightPage.pressAddCompare2Link();
		allo.ebookLightPage.hoverOn3();
		allo.ebookLightPage.pressAddCompare3Link();
		allo.ebookLightPage.pressCompareButton();
		allo.compareGoodsPage.pressBuyButton();
		allo.orderModalPage.pressOrderButton();
		
	}

	@AfterClass
	public static void stopTest() {
		driver.quit();
	}
}
