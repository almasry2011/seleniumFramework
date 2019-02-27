package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	 

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="gender-male")
	WebElement gender;

	@FindBy(id="FirstName")
	WebElement FirstName;

	@FindBy(id="LastName")
	WebElement LastName;

	@FindBy(id="Email")
	WebElement Email;

	@FindBy(id="Password")
	WebElement Password;

	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;

	@FindBy(id="register-button")
	WebElement register_button;
	
	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")
	public  WebElement successMessagElement;

	public void userRegistration(String firstname, String secondname,
			String email,String pw,String cPW)

	{

		clickButton(gender);
		setText(FirstName, firstname);
		setText(LastName, secondname);
		setText(Email, email);
		setText(Password, pw);
		setText(ConfirmPassword, cPW);
		clickButton(register_button);

	}





}
