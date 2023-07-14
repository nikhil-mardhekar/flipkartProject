package flipKartPomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class appleIphone {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']//*[name()='svg']")
	private WebElement AddtoCartbutton;
	
	public appleIphone(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	public void ClickonAddtoCartbutton() {
		AddtoCartbutton.click();
	}

}
