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
    static String str="t05";

	@DataProvider(name="testData")
	public static Object [][] data(){

		return new Object[][] {

			{"amr911"+str+"041002@gm.com","amr123"},
			{"amr2911"+str+"1023@gm.com","amr123"}  ,
			{"amr12"+str+"919022@gm.com","amr123"},
			{"amr211"+str+"910223@gm.com","amr123"},
			
			
			{"amr010"+str+"411012@gm.com","amr123"},
			{"amr2191012"+str+"3@gm.com","amr123"}  ,
			{"amr2219"+str+ "02912@gm.com","amr123"},
			{"amr2911"+str+ "102293@gm.com","amr123"},
			
			
			{"amr2295511"+str+ "102293@gm.com","amr123"},
			{"amr225911"+str+ "102293@gm.com","amr123"},
			{"amr252911"+str+ "102293@gm.com","amr123"},
			{"amr22911"+str+ "102293@gm.com","amr123"},
			{"amr229511"+str+ "102293@gm.com","amr123"},
			{"amr229115"+str+ "102293@gm.com","amr123"},
			{"amr22511"+str+ "102293@gm.com","amr123"} 
			 
			

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
