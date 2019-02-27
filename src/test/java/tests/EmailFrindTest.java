package tests;

 
import org.testng.annotations.Test;

import pages.EmailPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class EmailFrindTest extends TestBase {
	String emailString="amrTest80@tey.live";

	//userReg
	//search
	//Email

	HomePage homePage;
	UserRegistrationPage userRegistrationPage;
	SearchPage searchPage;
	loginPage loginPage;
	EmailPage emailPage;
	ProductDetailsPage ProductDetailZe;


	@Test(priority=0)
	public void init() {
		homePage=new HomePage(driver);
		userRegistrationPage=new UserRegistrationPage(driver);
		searchPage=new SearchPage(driver);
		emailPage=new EmailPage(driver);
		 ProductDetailZe=new ProductDetailsPage(driver);

/*
		homePage.openRegistrationPage();
		userRegistrationPage.userRegistration("amr", "mohamed", emailString, "123456", "123456");
		System.out.println( 	userRegistrationPage.successMessagElement.getText());


		//userRegistrationPage.successMessagElement.isDisplayed();
		//homePage.oprnloginPage();
		//loginPage.login(emailString, "123456");

		searchPage.Product_Search_AutoSuggest("mac");
		ProductDetailsPage.open_emailFriend();
		emailPage.EmailFrind("almasry201174@gmail.com", "Test From Automation Framework");

		assertTrue(emailPage.assertResult.getText().contains("Your message has been sent.") );

*/

	}




	@Test(dependsOnMethods= {"init"})
	public void userCanRegister() {

		homePage.openRegistrationPage();
		userRegistrationPage.userRegistration("amr", "mohamed", emailString, "123456", "123456");
		System.out.println( 	userRegistrationPage.successMessagElement.getText());



	}



	@Test(dependsOnMethods= {"userCanRegister"})
	public void Search() {

		searchPage.Product_Search_AutoSuggest("mac");


	}




	@Test(dependsOnMethods= {"Search"})
	public void EmailFrind() {
		ProductDetailZe.open_emailFriend();
		 
		emailPage.EmailFrind("almasry201174@gmail.com", "Test From Automation Framework");

		assertTrue(emailPage.assertResult.getText().contains("Your message has been sent.") );



	}












}
