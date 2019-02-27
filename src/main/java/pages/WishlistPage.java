package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends PageBase {

	public WishlistPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(name="removefromcart")
	WebElement selectremovefromcart;
	
	@FindBy(name="addtocart")
	WebElement selectaddtocart;

	@FindBy(css=".product-name")
	WebElement product_name;

	@FindBy(css=".product-unit-price")
	WebElement  product_unit_price;
	
	@FindBy(css="input.button-2:nth-child(1)")
	WebElement  UpdateWishlist_BTN;
	
	@FindBy(css="input.button-2:nth-child(2)")
	WebElement  AddTOcart_BTN;
	
	
	
	
	public void removeProductFromWishList() {
	
		clickButton(selectremovefromcart);
		clickButton(UpdateWishlist_BTN);
	}
	
    public void addProductTOcart() {
	   clickButton(selectaddtocart);
	   clickButton(UpdateWishlist_BTN);
	}
	
	
    
	
	
	
	

}
