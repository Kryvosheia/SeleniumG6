package pagesByAnnotation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedbackPageByAnnotation {
	WebDriver driver;
	Logger log;
	
	public FeedbackPageByAnnotation (WebDriver driver) throws IOException {
		this.driver = driver;
		log = Logger.getLogger(FeedbackPageByAnnotation.class);
		PageFactory.initElements (driver, this);

	}
	
	@FindBy(xpath=".//*[contains(@name,'name')]")
	WebElement nameTextField;
	
	@FindBy(xpath=".//*[contains(@name,'email')]")
	WebElement emailTextField;
	
	@FindBy(xpath=".//*[contains(@name,'subj')]")
	WebElement subjCommentTextField;
	
	@FindBy(xpath=".//*[contains(@name,'feedback')]")
	WebElement commentTextField;
	
	@FindBy(xpath=".//*[contains(@class,'submit-container')]/*[contains(@class,'button btn-black')]")
	WebElement submitLink;
	
	
	public void inputName(String name){
		nameTextField.clear();
		nameTextField.sendKeys(name);
	}

	public void inputEmail(String email){
		emailTextField.clear();
		emailTextField.sendKeys(email);
	}
	
	public void inputSubjComment(String subjComment){
		subjCommentTextField.clear();
		subjCommentTextField.sendKeys(subjComment);
	}
	
	public void inputComment(String comment){
		commentTextField.clear();
		commentTextField.sendKeys(comment);
	}
	
	public void clickSubmitLink(){
		submitLink.click();
	}
	
	/*public void feedbackUser(String name, String email, String subjComment, String comment){
		inputName(name);
		inputEmail(email);
		inputSubjComment(subjComment);
		inputComment(comment);	
		clickSubmitLink();	
	}*/
		
}
