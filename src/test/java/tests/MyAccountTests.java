package tests;

 

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.loginPage;

public class MyAccountTests extends TestBase {

	HomePage homePage;
	loginPage loginPage;
	MyAccountPage mAccountPage;
	String cPWString="Amr@1231110A00";
	String newPWString="Amr@1231110A00";
	
	@Test(enabled=true)
	public void userCanLOGIN() {
		homePage=new HomePage(driver);
		loginPage=new loginPage(driver);
		homePage.oprnloginPage();
		loginPage.login("ammm@mm.com", cPWString);
		Assert.assertTrue(homePage.Log_out_btn.isDisplayed());	
	}
	
	
	
	@Test(enabled=true,dependsOnMethods= {"userCanLOGIN"})
	public void TestChangePassword() 
	{
		homePage=new HomePage(driver);
		loginPage=new loginPage(driver);
		mAccountPage=new MyAccountPage(driver);
	    homePage.opem_MyAccount();
	    mAccountPage.ChangePW(cPWString, newPWString,newPWString);
	    homePage.logout_me();
	}
	
	

	@Test(enabled=true,dependsOnMethods= {"TestChangePassword"})
	public void TestAfter_ChangingPassword() 
	{
	    homePage.oprnloginPage();
	    loginPage.login("ammm@mm.com", newPWString);
		Assert.assertTrue(homePage.Log_out_btn.getText().contains("Log out"));
		System.out.println(homePage.Log_out_btn.getText());
	}
	
	
	
	
}
