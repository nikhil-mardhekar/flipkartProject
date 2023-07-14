package flipKartPomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class onlineshoppingpage1 {
	@FindBy(name="q")
	private WebElement searchField;
	@FindBy(xpath=".//button[@type=\"submit\"]")
	private WebElement searchIcon;
	@FindBy(xpath=".//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeWindow;
	
	public onlineshoppingpage1(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	public void closeWindow() {
		closeWindow.click();
	}
	public void setShoppingProduct(String product) {
		searchField.sendKeys(product);
	}
	public void clickonsearchIcon() {
		searchIcon.click();
	}

}