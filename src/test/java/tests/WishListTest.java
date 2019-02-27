package tests;

import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.WishlistPage;

public class WishListTest extends TestBase {
    
	
	
	ProductDetailsPage  DetailsPage ;
	WishlistPage wishlistPage;
	SearchPage SearchPage;
	
	@Test
	public void testWishList() throws InterruptedException {
		DetailsPage=new ProductDetailsPage(driver);
		wishlistPage=new WishlistPage(driver);
		SearchPage=new SearchPage(driver);
		
		SearchPage.Product_Search_AutoSuggest("mac");
		assertTrue(DetailsPage.current_item.isDisplayed());
		
		DetailsPage.addTOwishlist();
		assertTrue(DetailsPage.wishlistBTN.isDisplayed());
		
		DetailsPage.wishlistShowenBTN_click();
		Thread.sleep(5000);
		wishlistPage.removeProductFromWishList();
		Thread.sleep(10000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
    
}   
