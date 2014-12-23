package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogPageByDriver {
	WebDriver driver;
	WebElements web;
	WebDriverWait waitForCondition;
	Logger log;
	
	
	public LogPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(LoginPageByDriver.class);
	}
	
	public void inputLogEmail(String email) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		WebDriverWait waitForConditions = new WebDriverWait(driver, 10);
		waitForConditions.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(text(),'Вход')]")));
		web.inputText("LogInPage.emailTextField", email);
		log.info(email+" was inputed into emailTextField");
	}
	
	public void inputLogPassword(String password) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText("LogInPage.passwordTextField", password);
		log.info(password+" was inputed into emailTextField");
	}
	
	public void pressSubmitButton() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickButton("LogInPage.loginButton");
		//web.clickButton(".//span[(@id='cartHeader')]");
	}

}
