package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	@FindBy(xpath=("//h2[contains(text(),'My Account')]"))
	WebElement text_MyAccount;
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement btn_logout;
	//action methods
	
	public boolean isMyAccountPageExit()
	{
		try {
		return(text_MyAccount.isDisplayed());
		}catch(Exception e)
		{
			return(false);
		}
	}
	public void clickLogout()
	{
		btn_logout.click();
	}
	

}
