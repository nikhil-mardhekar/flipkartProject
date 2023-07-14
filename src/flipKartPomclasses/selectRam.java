package flipKartPomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectRam {
	@FindBy(xpath="//div[contains(text(),'1GB and Below')]")
	private WebElement RAM;
	@FindBy(xpath="//div[@data-id='MOBGHWFHECFVMDCX']//div[@class='col col-7-12']")
	private WebElement product;
	
	public selectRam(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	public void selectram() {
		RAM.click();
	}
	public void selectproduct() {
		product.click();
	}

}
