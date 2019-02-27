package tests;

import org.testng.annotations.Test;

import pages.CompareProductPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.WishlistPage;

public class AddTOcomparelist_Test extends TestBase {

	ProductDetailsPage  DetailsPage ;
	WishlistPage wishlistPage;
	SearchPage SearchPage;
	CompareProductPage comp;
	@Test
	public void testWishList() throws InterruptedException {
		DetailsPage=new ProductDetailsPage(driver);
		wishlistPage=new WishlistPage(driver);
		SearchPage=new SearchPage(driver);
		comp=new CompareProductPage(driver);
		
		
		SearchPage.Product_Search_AutoSuggest("mac");
		assertTrue(DetailsPage.current_item.isDisplayed());
		
		DetailsPage.AddTOcomparelist_click();
		SearchPage.Product_Search_AutoSuggest("asu");
		assertTrue(DetailsPage.current_item.isDisplayed());
		
		
		DetailsPage.AddTOcomparelist_click();
		//assertTrue(DetailsPage.wishlistBTN.isDisplayed());
		
	//	DetailsPage.view_TOcomparelist_click();
		Thread.sleep(5000);
	//wishlistPage.removeProductFromWishList();
		Thread.sleep(10000);
		
	}
	
	
	@Test(dependsOnMethods= {"testWishList"})
	public void TestCompare() {
		DetailsPage=new ProductDetailsPage(driver);
		wishlistPage=new WishlistPage(driver);
		SearchPage=new SearchPage(driver);
		comp=new CompareProductPage(driver);
		comp.compareProducts();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
