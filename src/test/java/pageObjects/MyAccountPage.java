package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
		@FindBy(xpath="//div[@class='list-group mb-3']//a[text()='Logout']") WebElement btnLogout;
		
		@FindBy(xpath = "//div[@id='content']//h2[text()='My Account']") WebElement msgHeading;
		
		@FindBy(xpath="//div[@id=\"account-account\"]//i") WebElement btnHome;
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		public void clickLogout() {
			js.executeScript("arguments[0].click();", btnLogout);
		}
		
		public void ClickHome() {
			js.executeScript("arguments[0].click();", btnHome);
		}
		
		

		public boolean isMyAccountPageExists()   // MyAccount Page heading display status
		{
			
			
			
			if(msgHeading.isDisplayed())
					return true;
			else 
				return false;
	/*		try {
				return (msgHeading.isDisplayed());
			} catch (Exception e) {
				return (false);
			}						*/
		}

}
