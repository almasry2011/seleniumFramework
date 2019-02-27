package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompareProductPage extends PageBase {

	public CompareProductPage(WebDriver driver) {
		super(driver);
		 
	}
	
	@FindBy(css=".clear-list")
	WebElement clearList;
	
	@FindBy(css=".compare-products-table")
	WebElement compareProductsTBL;
	
	@FindBy(tagName="tr")
	List<WebElement> all_Rows;  
	
	 
	
	@FindBy(tagName="td")
	List<WebElement>  all_columns;
	
	
	 
	public void clearAllList() {
		clickButton(clearList);
		
	}
	
	
	public void compareProducts() {
		 System.out.println(all_Rows.size());
		
	}
	
	
	
	
	

}
