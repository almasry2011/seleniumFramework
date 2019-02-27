package tests;









import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class UserRegistrationTest extends TestBase  {
	HomePage homePage;
	UserRegistrationPage userRegistrationPage;
	
	String email="amr0111@gm.com";
	String pass="amr123";

	@Test(priority=1)
	public void userCanRegisterSuccessfully() {
		homePage=new HomePage(driver);
		userRegistrationPage=new UserRegistrationPage(driver);
		homePage.openRegistrationPage();
		userRegistrationPage.userRegistration("amr", "mohamed", email, pass, "amr123");

		System.out.println(userRegistrationPage.successMessagElement.getText());


		Assert.assertTrue(userRegistrationPage.successMessagElement.getText().contains("completed"));
	}

	@Test(dependsOnMethods = {"userCanRegisterSuccessfully"})
	public void userCanLogout() 
	{
		homePage.logout_me();
   
		 Assert.assertTrue(homePage.loginElement.isDisplayed());
		
	}

	@Test(dependsOnMethods= {"userCanLogout"})
	public void registerdUserCanLogin() {
        homePage.oprnloginPage();
		loginPage loginPage=new loginPage(driver);
		loginPage.login(email, pass);
		 Assert.assertTrue(homePage.Log_out_btn.isDisplayed());
	}





}
