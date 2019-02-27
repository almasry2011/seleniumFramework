package pages;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;




public class PageBase {
	
	protected WebDriver driver;
	protected static JavascriptExecutor jsExecutor ;
	
	public PageBase (WebDriver driver) {
		
		 PageFactory.initElements(driver, this);//initialize page element Model (POM)
		
	}
	
    protected static void clickButton(WebElement element) {
    	
    	element.click();
    	 
    }
    
    protected static void setText(WebElement element,String value) {
    	
    	element.sendKeys(value);

    }
    
    
    public static void scroll() {
		 
			
			jsExecutor.executeScript("scrollBy(0,2500)"); 
			
			
			 
	}
    
	
}
 