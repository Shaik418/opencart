package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
	
	public ShoppingCartPage(WebDriver driver) {
		super (driver);
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-primary']") WebElement btnCheckout;
	
	
	
	
	public void ClickCheckout() {
		btnCheckout.click();
	}

}
