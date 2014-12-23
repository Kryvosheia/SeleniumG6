package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pagesByDriver.LoginPageByDriver;

public class LoginPageByAnnotation {
	
	WebDriver driver;
	WebDriverWait waitForCondition;
	Logger log;
	
	public LoginPageByAnnotation (WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(LoginPageByDriver.class);
		PageFactory.initElements (driver, this);
		waitForCondition = new WebDriverWait(driver, 5);
	}
	
	@FindBy(xpath=".//*[@id='login_tab']/a")
	WebElement loginTextField;
	
	@FindBy(xpath=".//*[@id='pass']")
	WebElement passTextField;
	
	@FindBy(xpath=".//a[contains(@title]")
	WebElement rememberMeCheckBox;
	
	@FindBy(xpath=".//*[@id='send2']")
	WebElement loginButton;
	
	public void inputLogin (String login){
		loginTextField.clear();
		loginTextField.sendKeys(login);
		log.info(login+" was inputed into loginField");
	}
	
	public void inputPassword(String password){
		passTextField.clear();
		passTextField.sendKeys(password);
		log.info(password+" was inputed into passTextField");
	}
	
	public void selectRememberMeCheckBox(String checkBoxState){
		if (rememberMeCheckBox.isSelected() && checkBoxState.equals("YES")){
			System.out.println("CheckBox is already selected");
		}
		
		if (rememberMeCheckBox.isSelected() && checkBoxState.equals("NO")){
			rememberMeCheckBox.click();
		}
		
		if (!rememberMeCheckBox.isSelected() && checkBoxState.equals("YES")){
			rememberMeCheckBox.click();
		}
		
		if (!rememberMeCheckBox.isSelected() && checkBoxState.equals("NO")){
			System.out.println("CheckBox is already deselected");
		}		
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}
	
	public void loginUser(String login, String pass, String checkBoxState){
		inputLogin(login);
		inputPassword(pass);
		selectRememberMeCheckBox(checkBoxState);
		clickLoginButton();	
	}
	
	/*public void logMsgExamples(){
		 loginButton.click();
		 log.info("Login btn was clicked");
		 
		 if(!loginButton.isDisplayed()){
			 log.error("Login btn is not displayed");
		 }*/
	
	  //De-bug is on WebElements level
	 /* String fieldLocator = "";
	  String text = "";
	  WebElement textField;
	  textField = driver.findElement(By.xpath(fieldLocator));
	  textField.clear();
	  log.debug("Text field was cleaned up");
	  textField.sendKeys(text);
	  
	 }*/
	
	 

}
