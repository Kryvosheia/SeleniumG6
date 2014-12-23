package pagesByDriver;

import java.io.IOException;

import libs.WebElements;

import org.openqa.selenium.WebDriver;

public class AlloByDriver{
	
	public WebElements webElements;
	
	public BlogPageByDriver blogPage;
	public CheckoutPageByDriver checkoutPage;
	public CompareGoodsPageByDriver compareGoodsPage;
	public EBookLightPageByDriver ebookLightPage;
	public FeedbackPageByDriver feedbackPage;
	public HomePageByDriver homePage;
	public OrderModalPageByDriver orderModalPage;
	public OrderPageByDriver orderPage;
	public ProductDescriptionPageByDriver productDescription;
	public ProductPageByDriver productPage;
	public RegistrationPageByDriver registrationPage;
	public TabletEBookPageByDriver tabletEBookPage;
	public LogPageByDriver logPage;
	
	
	
	public AlloByDriver(WebDriver driver) throws IOException{
		webElements = new WebElements(driver);
		blogPage = new BlogPageByDriver(driver);
		checkoutPage = new CheckoutPageByDriver(driver);
		compareGoodsPage = new CompareGoodsPageByDriver(driver);
		ebookLightPage = new EBookLightPageByDriver(driver);
		feedbackPage = new FeedbackPageByDriver(driver);
		homePage = new HomePageByDriver(driver);
		orderModalPage = new OrderModalPageByDriver(driver);
		orderPage = new OrderPageByDriver(driver);
		productDescription = new ProductDescriptionPageByDriver(driver);
		productPage = new ProductPageByDriver(driver);
		registrationPage = new RegistrationPageByDriver(driver);
		tabletEBookPage = new TabletEBookPageByDriver(driver);
		logPage = new LogPageByDriver(driver);
		
	}	

}
