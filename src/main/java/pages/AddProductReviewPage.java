package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductReviewPage extends PageBase {

	public AddProductReviewPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id="AddProductReview_Title")
	WebElement Review_Title;

	@FindBy(id="AddProductReview_ReviewText")
	WebElement Review_ReviewText;



	@FindBy(id="addproductrating_1")
	WebElement  rating_1;

	@FindBy(id="addproductrating_2")
	WebElement  rating_2;

	@FindBy(id="addproductrating_3")
	WebElement  rating_3;
	@FindBy(id="addproductrating_4")
	WebElement  rating_4;
	@FindBy(id="addproductrating_5")
	WebElement  rating_5;



	@FindBy(css="input.button-1:nth-child(1)")
	WebElement add_review_BTN;


	public void change_Rating(int rating,String title,String message ) {

		switch (rating) {
		case 1:
			 clickButton(rating_1);
			break;

		case 2:
			 clickButton(rating_2);
			break;	

		case 3:
			 clickButton(rating_3);

			break;	
			
			
		case 4:
			 clickButton(rating_4);
			
			
			break;	


		case 5:
			 clickButton(rating_5);
			break;
		default:
			break;
		}
		
		setText(Review_Title,   title);
		setText(Review_ReviewText, message);
        clickButton(add_review_BTN);
		
		
	}   

}
