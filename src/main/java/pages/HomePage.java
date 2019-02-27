package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);




	}

	@FindBy(linkText="Register")
	WebElement registerLinkBTN;


	@FindBy(linkText="Log in")
	public WebElement loginElement;

	@FindBy(css="a.ico-logout")
	public WebElement Log_out_btn;

	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	public WebElement myaccountElement;

	@FindBy(linkText="Contact us")
	WebElement ContactUS_BTN;



	@FindBy(id="customerCurrency")
	WebElement customerCurrency;



	//////////Hover//////////////
	@FindBy(css="ul.top-menu:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
	WebElement computers;

	@FindBy(linkText="Notebooks")
	WebElement Notebooks;

	//////////////////////////


	public void openRegistrationPage() 
	{
		registerLinkBTN.click();


	}

	public void oprnloginPage() {
		loginElement.click();
	}

	public void logout_me() {

		clickButton(Log_out_btn);
	}


	public void opem_MyAccount() {

		clickButton(myaccountElement);
		//	driver.navigate().to("http://demo.nopcommerce.com/customer/info");

	}

	public void open_ContactUSPage() {
		clickButton(ContactUS_BTN);
	}

	public void ChangeCurrency(int index) {

		Select chsngeAction=new Select(customerCurrency)  ;

		chsngeAction.selectByIndex(index);


	}


	public void selectNootbooksMenue() {
 

		Actions actionscActions=new Actions(driver);
		
		actionscActions.moveToElement(computers)
		             // .moveToElement(Notebooks)
		              .click()
		              .build()
		              .perform();




	}
}