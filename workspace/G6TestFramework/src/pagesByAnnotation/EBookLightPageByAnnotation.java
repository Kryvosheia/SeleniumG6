package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EBookLightPageByAnnotation {
	WebDriver driver;
	Logger log;
	
	public EBookLightPageByAnnotation(WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(EBookLightPageByAnnotation.class);
		PageFactory.initElements (driver, this);
	}
	
	@FindBy(xpath=".//*[contains(@alt,'Купить - электронную книгу  Amazon Kindle Paperwhite (2014)')]")
	WebElement hover1;
	
	@FindBy(xpath=".//*[contains(@alt,'Купить - электронную книгу  AirBook City Light HD')]")
	WebElement hover2;
	
	@FindBy(xpath=".//*[contains(@alt,'Купить - электронную книгу  TEXET TB-416FL')]")
	WebElement hover3;
	
	@FindBy(xpath=".//a[contains(@name,'compare-80325')]")
	WebElement addCompare1Link;
	
	@FindBy(xpath=".//a[contains(@name,'compare-40922')]")
	WebElement addCompare2Link;
	
	@FindBy(xpath=".//a[contains(@name,'compare-52550')]")
	WebElement addCompare3Link;
	
	@FindBy(xpath=".//a[contains(@title,'Сравнить')]/span[contains(text(),'Сравнить')]")
	WebElement compareButton;
	
	
	public void clickAddCompare1Link(){
		addCompare1Link.click();
	}
	
	public void clickAddCompare2Link(){
		addCompare2Link.click();
	}
	
	public void clickAddCompare3Link(){
		addCompare3Link.click();
	}
	
	public void clickCompareButton(){
		compareButton.click();
	}
	

	
	public void focusOnElement1() throws Exception {
		Actions actionforTest = new Actions(driver);
		//WebElement we = webdriver.findElement(By.xpath("//html/body/div[13]/ul/li[4]/a"));
        actionforTest.moveToElement(hover1).build().perform();
    }
	
	public void focusOnElement2() throws Exception {
		Actions actionforTest = new Actions(driver);
		//WebElement we = webdriver.findElement(By.xpath("//html/body/div[13]/ul/li[4]/a"));
        actionforTest.moveToElement(hover2).build().perform();
    }
	
	public void focusOnElement3() throws Exception {
		Actions actionforTest = new Actions(driver);
		//WebElement we = webdriver.findElement(By.xpath("//html/body/div[13]/ul/li[4]/a"));
        actionforTest.moveToElement(hover3).build().perform();
    }

}
