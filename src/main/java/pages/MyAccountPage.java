package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a")
	WebElement change_password_btnElement;
	
	
	@FindBy(id="OldPassword")
	WebElement OldPassword;
	
	@FindBy(id="NewPassword")
	WebElement NewPassword;
	
	@FindBy(id="ConfirmNewPassword")                                    
	WebElement ConfirmNewPassword;
	
	//input.button-1:nth-child(1)
	@FindBy(css="input.button-1:nth-child(1)")
	WebElement Change_password_BTN;
	
	
 
	
 
	public void ChangePW(String old,String newp,String confNew) {
		clickButton(change_password_btnElement);
		setText(OldPassword, old);
		setText(NewPassword, newp);
		setText(ConfirmNewPassword, confNew);
		clickButton(Change_password_BTN);
		
	}
	
	
	
}
