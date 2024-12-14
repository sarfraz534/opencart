package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	// constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
		// locators
		@FindBy(xpath="//span[normalize-space()='My Account']") 
		private WebElement lnkMyaccount;

		@FindBy(xpath="//a[normalize-space()='Register']") 
		WebElement lnkRegister;
		@FindBy(linkText = "Login")   // Login link added in step5
		WebElement lnkLogin;

		@FindBy(xpath="//div[@id='search']/input") //input search locator
		 WebElement search_input;
		@FindBy(xpath="//div[@id='search']//button") // search button
		 WebElement search_button;

		// action methods
		public void clickMyAccount()
		{
			lnkMyaccount.click();
		}

		public void clickRegister()
		{
			lnkRegister.click();
		}
		public void clickLogin()
		{
			lnkLogin.click();
		}
		public void set_search(String product_name) { //for search product 
			search_input.sendKeys(product_name);
			}
		public void click_search() { // for search product
				search_button.click();
			}
		
	}


