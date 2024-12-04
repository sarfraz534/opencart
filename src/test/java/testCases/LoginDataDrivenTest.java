package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class LoginDataDrivenTest extends BaseClass {
	
	
  @Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
  public void verifyLoginDTT(String email,String password,String exp)
  {
	  logger.info("***Started LoginDataDrivenTest test**");
	  //home page
	  try {
	  HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin(); //Login link under MyAccount
		logger.info("clicked login buttom from myAccount dropdown in Home page ");
	  //login page
		logger.info("entering user credential");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickLogin(); //Login button
		logger.info("clicked on login button from login page");
	  //my account page
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExit();
		if(exp.equalsIgnoreCase("valid"))
		{
			if(targetPage==true) {
				logger.info("nevidated to my account page after login");
			macc.clickLogout();
			Assert.assertTrue(true);
			logger.info("logout from the my account page ");
			}else{
		
			Assert.assertTrue(false);
			}
		}
		//else
		if(exp.equalsIgnoreCase("invalid"))
		{
			if(targetPage==true)
			{
			macc.clickLogout();
			Assert.assertTrue(false);
		}else
		{
			Assert.assertTrue(true);
		}
		}
  
  } catch(Exception e)
  {
	 Assert.fail("validation test fail "+ e.getMessage()); 
  }
	  finally
	  {
		  
	  logger.info("***ended LoginDataDrivenTest test**");
  }
  }
  }
