package tests.DDT;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;
import tests.TestBase;

public class UserRegistrationTestWithDDTAND_DataProvider extends TestBase  {
	HomePage homePage;
	UserRegistrationPage userRegistrationPage;

	String email="amr0111@gm.com";
	String pass="amr123";


	@DataProvider(name="testData")
	public static Object [][] data(){

		return new Object[][] {

			{"amr901041002@gm.com","amr123"},
			{"amr29191023@gm.com","amr123"}  ,
			{"amr22919022@gm.com","amr123"},
			{"amr291910223@gm.com","amr123"},
			
			
			{"amr010491002@gm.com","amr123"},
			{"amr21910923@gm.com","amr123"}  ,
			{"amr22190292@gm.com","amr123"},
			{"amr291102293@gm.com","amr123"},
			
			
			
			{"amr010410029@gm.com","amr123"},
			{"amr82191023@gm.com","amr123"}  ,
			{"amr28219022@gm.com","amr123"},
			{"amr298110223@gm.com","amr123"},
			
			{"amr081041002@gm.com","amr123"},
			{"amr21891023@gm.com","amr123"}  ,
			{"amr22189022@gm.com","amr123"},
			{"amr291180223@gm.com","amr123"}
			

		};

	}



	@Test(priority=1,dataProvider="testData")
	public void userCanRegisterSuccessfully(String mail,String pwd) {
		homePage=new HomePage(driver);
		userRegistrationPage=new UserRegistrationPage(driver);
		homePage.openRegistrationPage();
		userRegistrationPage.userRegistration("amr", "mohamed", mail, pwd, "amr123");
		email=mail;
		pass=pwd;
		System.out.println(userRegistrationPage.successMessagElement.getText());


		Assert.assertTrue(userRegistrationPage.successMessagElement.getText().contains("completed"));


		homePage.logout_me();

		Assert.assertTrue(homePage.loginElement.isDisplayed());




	}



	@Test(dependsOnMethods= {"userCanLogout"},enabled=false)
	public void registerdUserCanLogin() {
		homePage.oprnloginPage();
		loginPage loginPage=new loginPage(driver);
		loginPage.login(email, pass);
		Assert.assertTrue(homePage.Log_out_btn.isDisplayed());
	}





}
