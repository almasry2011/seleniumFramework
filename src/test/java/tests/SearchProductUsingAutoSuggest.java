package tests;

import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductUsingAutoSuggest extends TestBase {

	
	
	
	
	
	
	
	
	
	

	@Test
	public void TestSearchSuggest() {
		SearchPage searchPage=new SearchPage(driver);
		ProductDetailsPage productDetailsPage=new ProductDetailsPage(driver);
		
		searchPage.Product_Search_AutoSuggest("mac");
		TestBase.assertTrue(productDetailsPage.current_item.isDisplayed());    
		
	}
	
	
 
	
	
	
	
	
}
