package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pagesByDriver.LoginPageByDriver;

public class RegistrationPageByAnnotation {
	WebDriver driver;
	Logger log;
	WebDriverWait waitForCondition;

	
	public RegistrationPageByAnnotation (WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(LoginPageByDriver.class);
		PageFactory.initElements (driver, this);
		waitForCondition = new WebDriverWait(driver, 5);
	}
	
	@FindBy(xpath=".//*[(@id='firstname')]")
	WebElement nameTextField;
	
	@FindBy(xpath=".//*[(@id='email_address')]")
	WebElement emailTextField;
	
	@FindBy(xpath=".//*[(@id='password')]")
	WebElement passwordTextField;
	
	@FindBy(xpath=".//*[(@id='tosCheckbox')]")
	WebElement userAgreementCheckBox;
	
	@FindBy(xpath=".//*[(@class='button btn-yellow next')]")
	WebElement continueRegistrationButton;
	
	public void inputName(String name){
		nameTextField.clear();
		nameTextField.sendKeys(name);
		log.info(name+" was inputed into nameTextField");
	}
	
	public void inputEmail(String email){
		emailTextField.clear();
		emailTextField.sendKeys(email);
		log.info(email+" was inputed into emailTextField");
	}
	
	public void inputPassword(String password){
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		log.info(password+" was inputed into passTextField");
	}
	
	public void selectUserAgreementCheckBox(String checkBoxState){
		if (userAgreementCheckBox.isSelected() && checkBoxState.equals("YES")){
			log.info("CheckBox is already selected");
		}
		
		if (userAgreementCheckBox.isSelected() && checkBoxState.equals("NO")){
			userAgreementCheckBox.click();
		}
		
		if (!userAgreementCheckBox.isSelected() && checkBoxState.equals("YES")){
			userAgreementCheckBox.click();
		}
		
		if (!userAgreementCheckBox.isSelected() && checkBoxState.equals("NO")){
			log.info("CheckBox is already deselected");
		}		
	}
	
	public void clickContinueRegistrationButton(){
		continueRegistrationButton.click();
		log.info("Continue registration btn was clicked");
	}

}
