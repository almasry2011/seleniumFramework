package tests;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utillites.Helper;

public class TestBase {

	//System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	//driver=new ChromeDriver();

	//Page Object Model (POM) | Design Pattern 

	public static WebDriver driver;


	

	@BeforeSuite()
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome") String browserName)
	{
		if (browserName.equalsIgnoreCase(browserName="chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase(browserName="firefox"))  
		{
			System.setProperty("webdriver.gecko.driver", "~\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}


		//System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.nopcommerce.com/");

	}


	@AfterSuite
	public void closedriver() 
	{
	 	 driver.quit();

	}
	
	
	
	@AfterMethod
	public void test(ITestResult res) throws IOException
	{
		if (ITestResult.FAILURE==res.getStatus()) {
			
			System.out.println("Failed");
			System.out.println("Tacking ScreenShoot....");
			Helper.captureSShot0(driver, res.getName());
			
		}
		
		
	}
	
	
	
	public static void assertTrue(boolean x) {
		Assert.assertTrue(x);
	}
	
	


}
