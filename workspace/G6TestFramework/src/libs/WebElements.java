package libs;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static libs.ConfigData.ui;


public class WebElements {
	WebDriver driver;
	WebDriverWait waitForCondition;//Timeout 5 sec
	Logger log = Logger.getLogger(WebElements.class);
	
	public WebElements(WebDriver driver){
		this.driver = driver;
		log = Logger.getLogger(WebElements.class);
		waitForCondition = new WebDriverWait(driver,5, 15000);
		
	}
	
	
	/*This method is used to click on some button*/
	public void clickButton(String buttonLocator)throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		log.debug("Button locator" + buttonLocator);
		WebElement button;
		//button = driver.findElement(By.xpath(buttonLocator));
		button = driver.findElement(ui(buttonLocator));
		button.click();
		log.debug("Button was clicked");
		waitForCondition = new WebDriverWait(driver, 10);	
	}
	
	/*This method is used to click on some link*/
	public void clickLink(String linkLocator) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		log.debug("Link locator" + linkLocator);
		WebElement link;
		link = driver.findElement(ui(linkLocator));
		//link = driver.findElement(By.linkText(linkLocator));
		link.click();
		log.debug("Link was clicked");
		waitForCondition = new WebDriverWait(driver, 10, 20000);
	}
	
	/*This method is used to select some radiobutton*/
	public void selectRadiobutton(String radioButtonLocator) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		log.debug("RadioButton locator" + radioButtonLocator);
		WebElement radioButton;
		//radioButton = driver.findElement(By.xpath(radioButtonLocator));
		radioButton = driver.findElement(ui(radioButtonLocator));
		radioButton.click();
		log.debug("RadioButton was choosen");
	}
	
	
	public void selectRadioButtonFromBlockByText(String blockLocator, String radioButtonName) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		//String radioButtonXpath=".//input[contains(text(), 'Wine')]";
		
	String radioBtnXpath = blockLocator+"[contains(text(), '"+radioButtonName+"')]";
		WebElement radioButton;
		//radioButton = driver.findElement(By.xpath(radioBtnXpath));
		radioButton = driver.findElement(ui(radioBtnXpath));
		radioButton.click();		
	}
	
	public void selectRadioButtonFromBlockByValue(String blockLocator, String radioButtonValue) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		
		String radioBtnXpath = blockLocator+"[@value='"+radioButtonValue+"']";
		WebElement radioButton;
		//radioButton = driver.findElement(By.xpath(radioBtnXpath));
		radioButton = driver.findElement(ui(radioBtnXpath));
		radioButton.click();
		
	}
	
	/*This method is used to input some text into some field*/
	public void inputText(String fieldLocator, String text) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		log.debug("Field locator" + fieldLocator);
		WebElement textField;
		//textField = driver.findElement(By.xpath(fieldLocator));
		textField = driver.findElement(ui(fieldLocator));
		textField.clear();
		textField.sendKeys(text);
		log.debug("Text was inputed");	
	}

	/*
	 * This method is used to select or deselect some checkBox
	 * checkBoxState should correspond to next format "YES/NO"
	 * */
	public void selectCheckBox(String checkBoxLocator, String checkBoxState) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		WebElement checkBox;
		//checkBox = driver.findElement(By.xpath(checkBoxLocator));
		checkBox = driver.findElement(ui(checkBoxLocator));

		if (checkBox.isSelected() && checkBoxState.equals("YES")){
			//waitForCondition.until(ExpectedConditions.elementToBeSelected(By.xpath(checkBoxLocator)));
			log.debug("CheckBox is already selected");
		}
		
		if (checkBox.isSelected() && checkBoxState.equals("NO")){
			checkBox.click();
			//waitForCondition.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(checkBoxLocator), false));
			waitForCondition.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(By.xpath(checkBoxLocator))));
			log.debug("CheckBox was clicked and selected");
			
		}
		
		if (!checkBox.isSelected() && checkBoxState.equals("YES")){
			checkBox.click();
			waitForCondition.until(ExpectedConditions.elementToBeSelected(By.xpath(checkBoxLocator)));
			log.debug("CheckBox was clicked and deselected");
		}
		
		if (!checkBox.isSelected() && checkBoxState.equals("NO")){
			log.debug("CheckBox is already deselected");
		}
	}
		/*
		 * This method is used to clear textFild
		 * */
	public void clearTextField(String textFieldLocator) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
		log.debug("TextField locator" + textFieldLocator);
		WebElement textField;
		//textField=driver.findElement(By.xpath(textFieldLocator));
		textField=driver.findElement(ui(textFieldLocator));
		textField.clear();
		log.debug("TextField is empty");
	
	}
	/*
	 * This method is used to input some text into some textField and click ENTER key
	 */
	
	public void inputSomeTextAndClickEnter(String textFieldLocator, String text) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		log.debug("TextField locator" + textFieldLocator);
		inputText(textFieldLocator, text);
		//driver.findElement(By.xpath(textFieldLocator)).sendKeys(Keys.ENTER);
		driver.findElement(ui(textFieldLocator)).sendKeys(Keys.ENTER);

		log.debug("TextField was inputed and enter was clicked");
	}
	
	/*
	 * This method is used to open site URL
	 */
	
	public void openURL(String url){
		
		driver.manage().window().maximize();
		driver.get(url);
		/*
		 * If element not found on some site - delete this
		 * If Exception - comment next line
		 */
		//driver.switchTo().frame(0);
	}
	
	public void openURLtwo(String url){
		
		driver.manage().window().maximize();
		driver.get(url);
		/*
		 * If element not found on some site - delete this
		 * If Exception - comment next line
		 */
		driver.switchTo().frame(0);
	}
	
	
	/*
	 * This method is used to refresh some page
	 */
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	/*
	 * This method is used to refresh some page and clear cookies
	 */
	public void deleteAllCookies(){
		driver.manage().deleteAllCookies();
	}
	
	/*
	 * This method is used to delete some named cookie
	 */
	public void deleteNamedCookie(String cookieName){
		driver.manage().deleteCookieNamed(cookieName);
	}
	
	
	/*
	 * This method is used to delete some named cookie
	 */
	public void deleteNamedCookie(Cookie cookie) {
		  driver.manage().deleteCookie(cookie);
	}	
	
	public void focusOnElement(String elementLocator) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		WebElement element;
		//element = driver.findElement(By.xpath(elementLocator));
		element = driver.findElement(ui(elementLocator));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	/*
	 * This method is used to select some item from drop down list
	 */
	public void selectItemFromDropDownList(String listLocator, String itemName) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		WebElement list;
		//list = driver.findElement(By.xpath(listLocator));
		list = driver.findElement(ui(listLocator));

		list.click();
		Select select = new Select(list);
		select.selectByVisibleText(itemName);			
	}
	
	/*
	 * This method is used to select some item from dropDown list
	 */
	public void selectItemFromDropDownListByFocus(String listLocator, String itemName) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		WebElement list;
		//list = driver.findElement(By.xpath(listLocator));
		list = driver.findElement(ui(listLocator));

		focusOnElement(listLocator);
		Select select = new Select(list);
		select.selectByVisibleText(itemName);	
	}
	
	/*
	  * Method is used to check that element is present on page.
	  */
	 public boolean isElementPresent(String elementLocator) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
	  try {
	  // driver.findElement(By.xpath(elementLocator));
	   driver.findElement(ui(elementLocator));

	  } catch (org.openqa.selenium.NoSuchElementException Ex) {
	  log.error("false");
	  return false;
	  }
	  return true;
	  
	 }
	 /*This method is used to hover on some element*/
		public void hoverOnElement(String elementLocator) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
			log.debug("Element locator: "+elementLocator);
			Actions action = new Actions(driver);
			WebElement element;
			//element = driver.findElement(By.xpath(elementLocator));
			element = driver.findElement(ui(elementLocator));
			action.moveToElement(element).perform();
			log.debug("Focus moved to element");
		}
		
		
		public void closeBrowser(String nameBrowser){
			driver.quit();
		}
		
		public boolean testResult(){
			return true;
		}
	 
		
}
	
	