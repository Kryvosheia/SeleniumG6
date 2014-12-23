package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class FeedbackPageByDriver {
	
	WebDriver driver;
	WebElements web;
	Logger log;
	
	
	public FeedbackPageByDriver(WebDriver driver) throws IOException{
		this.driver = driver;
		web = new WebElements(driver);
		log = Logger.getLogger(LoginPageByDriver.class);
	}
	
	public void inputName(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText("FeedbackPage.nameTextField", name);
		//web.inputText(".//*[contains(@name,'name')])", name);
		log.info(name+" was inputed into nameField");
	}
	
	public void inputEmail(String email) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText("FeedbackPage.emailTextField", email);
		//web.inputText(".//*[contains(@name,'email')]", email);
		log.info(email+" was inputed into emailField");
	}
	
	public void inputSubjComment(String subjComment) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText("FeedbackPage.subjCommentTextField", subjComment);
		//web.inputText(".//*[contains(@name,'subj')]", subjComment);
		log.info(subjComment+" was inputed into SubjCommentField");
	}	
	
	public void inputComment(String comment) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.inputText("FeedbackPage.commentTextField", comment);
		//web.inputText(".//*[contains(@name,'feedback')]", comment);
		log.info(comment+" was inputed into CommentField");
	}
	
	public void pressSubmitButton() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
		web.clickButton("FeedbackPage.submitButton");
		//web.clickButton("(.//*[contains(@class,'submit-container')]/*[contains(@class,'button btn-black')]");
	}
	

}
