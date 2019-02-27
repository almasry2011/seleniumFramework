package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class Chane_CurrencyTest extends TestBase {
	HomePage homePage;
	
	
	
	@Test
	public void TestChangeCurrency() {
	homePage=new HomePage(driver);
		homePage.ChangeCurrency(1);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	 
		
		
		
		
		
	
	
	
	 
	

}
