package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	
	@FindBy(id="input-firstname") WebElement txtFirstname; //input-email
	@FindBy(id="input-lastname") WebElement txtLastname;
	@FindBy(id="input-email") WebElement txtEmail;
	@FindBy(id="input-password") WebElement txtPassword;
	
	@FindBy(name="search") WebElement searchbox;
	
	@FindBy(xpath="//div[@id='search']//button") WebElement btnSearch;
	
	@FindBy(xpath="//div[@class='description']//a") WebElement resultText;
	
	@FindBy(xpath="//div[@id='product-list']") WebElement resultListMac;
	
	
	
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	
	@FindBy(name="agree") WebElement chkPolicy;
	@FindBy(xpath="//button[text()='Continue']") WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgConfiguration;
	
	
	public void setUsername(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
		txtLastname.sendKeys(lname);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPrivacyPolicy() {
		
		js.executeScript("arguments[0].click();",chkPolicy );
		//chkPolicy.click();
	}
	
	public void clickContinue() {
		
		
		js.executeScript("arguments[0].click();",btnContinue );
		//btnContinue.click();
	}
	
	public String getConfirmationMsg() {
		
		try {
		return (msgConfiguration.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
	
	public void enterImac() {
		searchbox.sendKeys("iMac");
	}
	
	public void clickSearchBtn() {
		js.executeScript("arguments[0].click();", btnSearch);
	}
	public boolean resultDisplayed() {
		boolean text= resultText.isDisplayed();
		return text;
	}

	
}
