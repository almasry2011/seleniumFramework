package tests;

import org.testng.annotations.Test;

import pages.AddProductReviewPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.loginPage;

public class AddProductReviewTest extends TestBase {
	
	@Test
	public void testProduct() {
		loginPage loginPage=new loginPage(driver);
		HomePage homePage=new HomePage(driver);
		SearchPage searchPage=new SearchPage(driver);
		homePage.oprnloginPage();
		
		ProductDetailsPage detailsPage =new ProductDetailsPage(driver);
		loginPage.login("amr0@amr.com", "amr0@amr.com");
		
		
		
		
		
		
		searchPage.Product_Search_AutoSuggest("mac");
		detailsPage.open_product_review();
		
		
		
		AddProductReviewPage addProductReview=new AddProductReviewPage(driver);
		
		addProductReview.change_Rating(5, "AMR", "Testing");
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	
	
	
	

}
