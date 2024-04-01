package pageObjects;

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

}
