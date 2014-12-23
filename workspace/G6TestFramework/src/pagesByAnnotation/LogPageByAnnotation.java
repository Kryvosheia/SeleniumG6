package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LogPageByAnnotation {
	WebDriver driver;
	WebDriverWait waitForCondition;
	Logger log;
	

	public LogPageByAnnotation(WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(LogPageByAnnotation.class);
		PageFactory.initElements (driver, this);
		waitForCondition = new WebDriverWait(driver, 5);
	}
	
	@FindBy(xpath=".//*[(@id='email')]")
	WebElement emailTextField;
	
	@FindBy(xpath=".//*[(@id='pass')]")
	WebElement passTextField;
	
	@FindBy(xpath=".//*[(@id='send2')]")
	WebElement loginButton;
	
	public void inputLogin (String email){
		emailTextField.clear();
		emailTextField.sendKeys(email);
		log.info(emailTextField+" was inputed into emailTextField");
	}
	
	public void inputPassword (String password){
		passTextField.clear();
		passTextField.sendKeys(password);
		log.info(passTextField+" was inputed into emailTextField");
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}
	
}
