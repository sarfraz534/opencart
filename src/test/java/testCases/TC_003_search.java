package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_003_search extends BaseClass {
	
	@Test(groups= {"Master","Sanity"})
	public void search() {
		try {
		HomePage hp= new HomePage(driver);
		hp.set_search("iphone");
		hp.click_search();
		
		SearchPage sp= new SearchPage(driver);     // search page for check product.
		boolean flag=sp.isProductDisplay("iphone");
		Assert.assertEquals(flag, true);
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
