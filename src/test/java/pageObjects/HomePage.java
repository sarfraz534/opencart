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
		
	}


