package tests;

 


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.loginPage;
import utillites.Helper;

public class LoginTest extends TestBase {
	HomePage homePage;
	loginPage loginPage;
	
	
	@Test
	public void testLogin() throws IOException  {
		homePage=new HomePage(driver);
		loginPage=new loginPage(driver);
		
		homePage.oprnloginPage();
		loginPage.login("ammm@mm.com", "ammm@mm.com");
		assertTrue(homePage.Log_out_btn.isDisplayed());
       
 //  Helper.captureSShot0(driver, "001");

	//	WebElement webElement= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input"));   
	//	webElement.click();
	}
	
	

}
