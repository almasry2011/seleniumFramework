package pages;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(id="small-searchterms")
	WebElement searchterms;
	@FindBy(css=".search-box-button")
    WebElement searchBTNElement;
	
	@FindBy(id="ui-id-1")
	      java.util.List<WebElement> productlist;
	
	
	@FindBy(linkText="Apple MacBook Pro 13-inch")
   public	WebElement product_title;
	
	
	public void Product_Search(String product) {
		setText(searchterms, product);
		clickButton(searchBTNElement);
		
	}
	
	public void openProductDetailsPage() {
		clickButton(product_title);
		
		
	}
	
	public void Product_Search_AutoSuggest(String product) {
		setText(searchterms, product);
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(productlist.size());
	
		clickButton(productlist.get(0));
		
	}
	
	
}


