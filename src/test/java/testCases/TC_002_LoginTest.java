package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
  
	@Test(groups= {"Sanity","Master"})
  public void loginAccount() {
		logger.info("*****Starting login page *******");
		try {
			//home page
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		
		logger.info("clicked on myaccount link on the home page..");
		hp.clickLogin(); // login link
		logger.info("clicked on login link on the home page..");
		
		//login page
		logger.info("entering valid user name and password");
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin(); //login button
		logger.info("clicked on login button on login page");
		
		//My Account page
		MyAccountPage map=new MyAccountPage(driver);
		boolean targetPage=map.isMyAccountPageExit();
		
		Assert.assertEquals(targetPage, true);
		logger.info("login successful");
		
		map.clickLogout();
		logger.info("successful logout from account");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			Assert.fail("test is filed");
			logger.info("login fail");
		} 
		finally
		{
			logger.info("*****ending login page testing*****");
		}
  }
}
