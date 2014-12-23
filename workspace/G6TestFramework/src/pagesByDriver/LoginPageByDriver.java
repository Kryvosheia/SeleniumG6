package pagesByDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import libs.WebElements;
//import static libs.ConfigData.ui;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageByDriver {
	WebDriver driver;
	WebDriverWait waitForConditions;

	WebElements web;
	Logger log;
	
	
	public LoginPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(LoginPageByDriver.class);
		//Timeout 5 sec  - explicitly wait
		waitForConditions = new WebDriverWait(driver, 5);
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void inputLogin(String login) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText("LoginPage.LoginField", login);
		//web.inputText(".//vmrvg", login);
		log.info(login+" was inputed into loginField");
	}
	
	public void inputPassword(String password) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText(".//*[@id='email']", password);
		log.info(password+" was inputed into passwordField");
		//waitForCondition.until(ExpectedConditions.elementToBeClickable(By.xpath, "./xpathOfLoginButton"));
	}
	
	public void pressButtonSubmit(String buttonLocator) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickButton(".//*[@id='send2']");
		waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//")));

		//waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui(".//")));
		//Assert.assertEquals(Boolean.TRUE);
		
	}
	
	public void selectRememberMeCheckBox (String checkBoxState) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.selectCheckBox(".//xpath", checkBoxState);
		log.info("");
		
	}
	
	public void closeWindow(String closeLocator) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.focusOnElement(closeLocator);
	}
	
	// check if user already entered as authorized user - looking for user's
	 // Nickname
	 public boolean isUserLoggedIn(String nickname) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
	  if (web.isElementPresent(".//kjkjjo")) {
	   log.info("User is succesfully logged in");
	   return true;
	  } else {
	   log.error("User isn't logged in");
	   return false;
	  }
	 }

	 // check if user already entered as authorized user - looking for logOut
	 // link
	 public boolean isUserLoggedIn() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
	  if (web.isElementPresent(".//lmpjmoijo")) {
	   log.info("User is logged in");
	   return true;
	  } else {
	   log.error("User isn't logged in");
	   return false;
	  }
	 }
	
	
}
