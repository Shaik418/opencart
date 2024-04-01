package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
		@FindBy(id="input-email") WebElement txtEmail;
		@FindBy(id = "input-password") WebElement txtPassword;
		
		@FindBy(xpath="//div[@class='text-end']/button[text()='Login']") WebElement btnLogin;
		
		@FindBy(xpath="//button[@class='btn-close']") WebElement alert;
		
		 
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//setup sp = new setup();
		
		public void setEmail(String email) {
			txtEmail.sendKeys(email);
		}
		
		public void setPassword(String password) {
			txtPassword.sendKeys(password);
		}
		
		public void clickLogin() {
			js.executeScript("arguments[0].click();", btnLogin);
		}
		
		public void closeAlert() {
			js.executeScript("arguments[0].click();", alert);
		}
		public boolean alertDisplayed() {
			boolean al= alert.isDisplayed();
			return al;
		}
		
		
		

}
