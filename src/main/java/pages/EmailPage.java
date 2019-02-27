package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends PageBase {

	
	
 
	
	public EmailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    

	//amr0@amr.com
	@FindBy(id="FriendEmail")
	WebElement FriendEmail;
	
	
	@FindBy(id="YourEmailAddress")
	public WebElement YourEmailAddress;
	
	@FindBy(css=".result")
	public WebElement assertResult;
	
	@FindBy(id="PersonalMessage")
	WebElement PersonalMessage;
	
	
	@FindBy(name="send-email")
	WebElement send_email_btn;
	
	
	
	public void EmailFrind(String frindEmail,String message) {
		
		setText(FriendEmail, frindEmail);
		setText(PersonalMessage, message);
		clickButton(send_email_btn);
		
		
		
	}
	
}
