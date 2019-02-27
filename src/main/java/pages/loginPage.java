package pages;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageBase {

	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="Email")
	WebElement emailElement;
	
	@FindBy(id="Password")
	WebElement passwordElement;

	
	
	@FindBy(id="RememberMe")
	WebElement RememberMe;
	
   // @FindBy(linkText="Log out")
	//WebElement logoutSH
	
	 @FindBy(css="input.login-button")
	 WebElement login_button;
 
	public void login(String user,String pwd)  {
		
		setText(emailElement, user);
		setText(passwordElement, pwd);
		
	    clickButton(login_button);
	    
	    
	    
	//	clickButton(login_button);
		//System.out.println(login_button.getText());
	}
	
	 
}
