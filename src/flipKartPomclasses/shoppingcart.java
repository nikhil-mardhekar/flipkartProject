package flipKartPomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingcart {
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement placeorderButton;
	
	public shoppingcart(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
		
	}
	public void ClickonplaceorderButton() {
		placeorderButton.click();
	}

}
