package tests.DDT;









import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;
import tests.TestBase;

public class UserRegistrationTestWithDDTandFaker extends TestBase  {
	HomePage homePage;
	UserRegistrationPage userRegistrationPage;
	Faker faker= new Faker();
	String emailString=faker.internet().emailAddress(); 
	 String paswwString=faker.number().digits(8).toString();
	
	//String email="amr0111@gm.com";
	//String pass="amr123";

	@Test(priority=1)
	public void userCanRegisterSuccessfully() {
		homePage=new HomePage(driver);
		userRegistrationPage=new UserRegistrationPage(driver);
		homePage.openRegistrationPage();
		userRegistrationPage.userRegistration("amr", "mohamed", emailString, paswwString, "paswwString");

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
		loginPage.login(emailString, paswwString);
		 Assert.assertTrue(homePage.Log_out_btn.isDisplayed());
	}





}
