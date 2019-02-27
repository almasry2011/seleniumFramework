package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProduct_Test extends TestBase {
	
	@Test(enabled=false)
	public void testProduct() {
		SearchPage x=new SearchPage(driver);
		ProductDetailsPage productDetailsPage=new ProductDetailsPage(driver);
		x.Product_Search("Apple MacBook Pro 13-inch");
		
		
		
		assertTrue(x.product_title .getText().contains("Apple"));
		
         x.openProductDetailsPage();
		
		Assert.assertTrue(productDetailsPage.current_item.getText().contains("Apple"));
	}
 

	
	
}
