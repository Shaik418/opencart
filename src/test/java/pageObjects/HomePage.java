package pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']") WebElement linkMyaccount;
	@FindBy(xpath="//a[text()='Register']") WebElement linkRegister;
	
	@FindBy(xpath="//a[text()='Login']") WebElement linkLogin;
	
	@FindBy(name="search") WebElement searchbox;
	
	@FindBy(xpath="//div[@id='search']//button") WebElement btnSearch;
	
	//@FindBy(xpath="//div[@class='description']//a") WebElement resultText;
	
	//@FindBy(xpath="//div[@id='product-list']") WebElement resultListMac;
	
	@FindBy(xpath="//div[@class=\"description\"]//a") List<WebElement> searchList;
	
	@FindBy(id="button-cart") WebElement btnAddtoCart;
	
	@FindBy(xpath="//nav[@id=\\\"top\\\"]//div//a[@title=\\\"Shopping Cart\\\"]") WebElement btnShoppingCart;
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	public void ClickMyaccount()
	{
		js.executeScript("arguments[0].click();", linkMyaccount);
	}
	
	public void ClickRegister()
	{
		js.executeScript("arguments[0].click();", linkRegister);
	}
	
	public void ClickLogin() {
		js.executeScript("arguments[0].click();", linkLogin);
	}
	
	public void EnterText() {
		//js.executeScript("arguments[0].value = rb.getString(\"text\");", searchbox);
		searchbox.sendKeys(rb.getString("text"));
	}
	
	public void ClickSearch() {
		js.executeScript("arguments[0].click();", btnSearch);
		//btnSearch.click();
	}
	
	
	public void ClickSelectedProduct(){
		
		for(WebElement ele:searchList) {
			if(ele.getText().equalsIgnoreCase(rb.getString("outputtext"))) {
				js.executeScript("arguments[0].click();", ele);
				//ele.click();
				break;
			}
		}
		
		
		
	}
	
	public void ClickAddtoCart() {
		js.executeScript("arguments[0].click();", btnAddtoCart);
		//btnAddtoCart.click();
	}
	
	public void ClickShoppingCart() {
		js.executeScript("arguments[0].click();", btnShoppingCart);
		//btnShoppingCart.click();
	}

}
