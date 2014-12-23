package pagesByAnnotation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;



public class AlloByAnnotation {
	//public WebElements webElements;
	public BlogPageByAnnotation blogPage;
	public CheckoutPageByAnnotation checkoutPage;
	public CompareGoodsPageByAnnotation compareGoodsPage;
	public EBookLightPageByAnnotation ebookLightPage;
	public FeedbackPageByAnnotation feedbackPage;
	public HomePageByAnnotation homePage;
	public OrderModalPageByAnnotation orderModalPage;
	public OrderPageByAnnotation orderPage;
	public ProductDescriptionPageByAnnotation productDescription;
	public ProductPageByAnnotation productPage;
	public RegistrationPageByAnnotation registrationPage;
	public TabletEBookPageByAnnotation tabletEBookPage;
	public LogPageByAnnotation logPage;
	
	
	
	public AlloByAnnotation(WebDriver driver) throws IOException{
		//webElements = new WebElements(driver);
		blogPage = new BlogPageByAnnotation(driver);
		checkoutPage = new CheckoutPageByAnnotation(driver);
		compareGoodsPage = new CompareGoodsPageByAnnotation(driver);
		ebookLightPage = new EBookLightPageByAnnotation(driver);
		feedbackPage = new FeedbackPageByAnnotation(driver);
		homePage = new HomePageByAnnotation(driver);
		orderModalPage = new OrderModalPageByAnnotation(driver);
		orderPage = new OrderPageByAnnotation(driver);
		productDescription = new ProductDescriptionPageByAnnotation(driver);
		productPage = new ProductPageByAnnotation(driver);
		registrationPage = new RegistrationPageByAnnotation(driver);
		tabletEBookPage = new TabletEBookPageByAnnotation(driver);
		logPage = new LogPageByAnnotation(driver);
	}	

}

