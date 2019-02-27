package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class ProductHoverMenuTest extends TestBase {
	
	
	HomePage homePage;
	
	
	@Test
	public void TestHover() {
		homePage=new HomePage(driver);
		homePage.selectNootbooksMenue();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
