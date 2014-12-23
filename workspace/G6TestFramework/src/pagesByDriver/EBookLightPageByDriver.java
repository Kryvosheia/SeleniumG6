package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBookLightPageByDriver {
	
	WebDriver driver;
	WebDriverWait waitForCondition;
	WebElements web;
	Logger log;
	
	
	public EBookLightPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(LoginPageByDriver.class);
	}
	
	public void hoverOn1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException{
		WebDriverWait waitForConditions = new WebDriverWait(driver, 20);
		waitForConditions.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@id,'category-title')]")));
		web.hoverOnElement("EBookLightPage.hover1");		
	}
	
	public void pressAddCompare1Link() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		WebDriverWait waitForConditions = new WebDriverWait(driver, 10);
		waitForConditions.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@name,'compare-80325')]")));
		web.clickLink("EBookLightPage.addCompare1Link");
		log.info("eBook1 was selected");
		//web.clickLink(".//a[contains(@name,'compare-80325')]");
	}
	
	public void hoverOn2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException{
		WebDriverWait waitForConditions = new WebDriverWait(driver, 20);
		waitForConditions.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@id,'category-title')]")));
		web.hoverOnElement("EBookLightPage.hover2");		
	}
	
	public void pressAddCompare2Link() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{

		WebDriverWait waitForConditions = new WebDriverWait(driver, 10);
		waitForConditions.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@alt,'Купить - электронную книгу  AirBook City Light HD')]")));
		//Assert.assertEquals(Boolean.TRUE);
		
		web.clickLink("EBookLightPage.addCompare2Link");
		log.info("eBook2 was selected");
		//web.clickLink(".//a[contains(@name,'compare-52550')]");
	}
	
	public void hoverOn3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException{
		WebDriverWait waitForConditions = new WebDriverWait(driver, 20);
		waitForConditions.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@id,'category-title')]")));
		web.hoverOnElement("EBookLightPage.hover3");		
	}
	
	public void pressAddCompare3Link() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		WebDriverWait waitForConditions = new WebDriverWait(driver, 10);
		waitForConditions.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@alt,'Купить - электронную книгу  TEXET TB-416FL')]")));
		web.clickLink("EBookLightPage.addCompare3Link");
		log.info("eBook3 was selected");
		//web.clickLink(".//a[contains(@name,'compare-40922')]");
	}
	
	public void pressCompareButton() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		WebDriverWait waitForConditions = new WebDriverWait(driver, 10);
		waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(@class,'product-name product-name-strip')]/a[contains(@href,'http://allo.ua/elektronnye-knigi/amazon-kindle-paperwhite-2014.html')]")));
		web.clickButton("EBookLightPage.compareButton");
		log.info("CompareButton was pressed");
		//web.clickButton(".//a[contains(@title,'Сравнить')]/span[contains(text(),'Сравнить')]");
	}
	
	

}
