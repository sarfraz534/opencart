package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	@FindBy(xpath="//input[@id='input-email']")
	WebElement input_username;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement input_password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement click_login;
	
	//action method
	public void setUserName(String uname)
	{
		input_username.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		input_password.sendKeys(pwd);
	}
	public void clickLogin()
	{
		click_login.click();
	}
}
