package flipKarttestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import flipKartPomclasses.appleIphone;
import flipKartPomclasses.onlineshoppingpage1;
import flipKartPomclasses.selectRam;
import flipKartPomclasses.shoppingcart;

public class testScript_01 {
	@Test
	public void purchaseproduct() throws InterruptedException {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.flipkart.com");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		onlineshoppingpage1 rv=new onlineshoppingpage1(Driver);
		rv.closeWindow();
		rv.setShoppingProduct("iphone14");
		rv.clickonsearchIcon();
		selectRam rv2=new selectRam(Driver);
		rv2.selectram();
		Thread.sleep(3000);
		rv2.selectproduct();
		String ref = Driver.getWindowHandle();
		for(String win : Driver.getWindowHandles()) {
			Driver.switchTo().window(win);
		}
		appleIphone rv3=new appleIphone(Driver);
		Thread.sleep(8000);
		rv3.ClickonAddtoCartbutton();
		shoppingcart rv4=new shoppingcart(Driver);
		rv4.ClickonplaceorderButton();
		
		
	}

	
}
