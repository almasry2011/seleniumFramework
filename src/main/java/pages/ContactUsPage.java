package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="FullName") 
	WebElement FullName;
	
	@FindBy(id="Email") 
	WebElement Email;
	
	@FindBy(id="Enquiry") 
	WebElement Enquiry;
	
	@FindBy(name="send-email") 
	WebElement Submit_BTN;
	
	
	@FindBy(css=".result") 
	public WebElement enquiry_successfully;
	
	public void contactUs(String FullName,String Email,String Enquiry) {
		setText(this.FullName, FullName);  
		setText(this.Email, Email);
		setText(this.Enquiry, Enquiry);
		clickButton(Submit_BTN);
		
	}
	
	
	
}
