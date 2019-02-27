package tests;

import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase{

	HomePage homePage;
	ContactUsPage contactUsPage;
	
	@Test
	public void userCanUseContactUS() {
		
		homePage=new HomePage(driver);
		contactUsPage=new ContactUsPage(driver);
		
		homePage.open_ContactUSPage();
		contactUsPage.contactUs("Amr Mohamed", "AMR@Test.com", "NO Product Description");
		
		assertTrue(contactUsPage.enquiry_successfully.isDisplayed());
		
	}
	
	
	
}
