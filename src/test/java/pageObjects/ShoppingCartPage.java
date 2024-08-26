package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
	
	public ShoppingCartPage(WebDriver driver) {
		super (driver);
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-primary']") WebElement btnCheckout;
	
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	
	
	public void ClickCheckout() {
		
		js.executeScript("arguments[0].click();", btnCheckout);
		//btnCheckout.click();
	}

}
