package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPageByDriver {
	WebDriver driver;
	WebDriverWait waitForConditions;

	WebElements web;
	Logger log;
	
	
	public RegistrationPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(RegistrationPageByDriver.class);
		//Timeout 5 sec  - explicitly wait
		waitForConditions = new WebDriverWait(driver, 5);
		//implicitly wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void inputName(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText("RegistrationPage.nameTextField", name);
		
		//web.inputText(".//*[(@id='firstname')]", name);
		log.info(name+" was inputed into nameTextField");
	}
	
	public void inputEmail(String email) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText("RegistrationPage.emailTextField", email);
		//web.inputText(".//*[(@id='email_address')]", email);
		log.info(email+" was inputed into emailTextField");
	}
	
	public void inputPasswor(String password) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText("RegistrationPage.passwordTextField", password);
		//web.inputText(".//*[(@id='password')]", password);
		log.info(password+" was inputed into passwordTextField");
	}
	
	public void selectUserAgreementCheckBox (String checkBoxState) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.selectCheckBox("RegistrationPage.userAgreementCheckBox",checkBoxState);
		//web.selectCheckBox(".//*[(@id='tosCheckbox')]", checkBoxState);
		log.info("userAgreementCheckBox was selected");	
	}
	
	public void pressContinueRegistrationButton(String buttonLocator) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickButton("RegistrationPage.continueRegistrationButton");
		//web.clickButton(".//*[(@class='btn btn-orange')]");
		waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[(@title='В личный кабинет')]")));

		//waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("CabinetPage.personalCabinetLink")));
		
	}
	

}
