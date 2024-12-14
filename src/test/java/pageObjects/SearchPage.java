package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//-----------------locators------------------------------
	@FindBy(xpath="//div[@id='content']/div[3]//img")
	private List<WebElement> searchproducts;
	
	//-------------------action methods-------------------------
	public boolean isProductDisplay(String productname) {
		boolean flag=false;
		for(WebElement searchProduct:searchproducts) {
			if(searchProduct.getAttribute("title").equalsIgnoreCase(productname)) {
				return true;
			}
		} return flag;
		
	}
}
