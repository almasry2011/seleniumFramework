package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@FindBy(css=".current-item")
    public	WebElement  current_item;
	
	
	@FindBy(css=".email-a-friend-button")
    public WebElement  emailFriend_BTN;
	
	@FindBy(css=".product-review-links > a:nth-child(3)")
	 public WebElement  product_review;
	
	@FindBy(id="add-to-wishlist-button-4")
	WebElement addTOwishlistBTNElement;
	
	 
	
	////////////////////////
	
	@FindBy(css="input.add-to-compare-list-button:nth-child(1)")
	WebElement compare_list;
	
	
	@FindBy(linkText="product comparison")
	WebElement product_comparison_BTN;
	
 
	
	
	////////////////////
	
	
	@FindBy(css=".content > a:nth-child(1)")
	 public WebElement  wishlistBTN;
	
	
	public void open_emailFriend() {
		clickButton(emailFriend_BTN);
	}
	

	public void open_product_review() {
		clickButton(product_review);
	}
	
	
	public void addTOwishlist () {
		clickButton(addTOwishlistBTNElement);
	}
	

	public void wishlistShowenBTN_click () {
		clickButton(wishlistBTN);
	}
	
	public void AddTOcomparelist_click () {
		clickButton(compare_list);
		clickButton(product_comparison_BTN);
	
	}
	
	
	public void view_comparelist_click () {
		clickButton(product_comparison_BTN);
	
	}
	
	
	
	
	
	
	
	
}
