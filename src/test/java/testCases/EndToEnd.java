package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class EndToEnd extends BaseClass{
	
	
	public void testEndtoend() {

		logger.info("**************** Starting End to end test case ****************");
		
		try {
		HomePage hp = new HomePage(driver);
		hp.ClickMyaccount();
		logger.info("Clicked on my account");
		hp.ClickLogin();
		logger.info("Clicked on login");
		
		LoginPage lp = new LoginPage(driver);
		//lp.clickLogin();
		lp.setEmail(rb.getString("username"));
		logger.info("Enterd email");
		lp.setPassword(rb.getString("password"));
		logger.info("Enterd password");
		lp.clickLogin();
		logger.info("Clicked on Login");
		
		List<WebElement> list = hp.ListOfElements();
		for(WebElement plist: list) {
			if(plist.equals("")) {
				
			}
		}
		
		
		MyAccountPage macc=new MyAccountPage(driver);
		macc.clickLogout();
		logger.info("Clicked on logout");
		
		}catch(Exception e) {
			Assert.assertTrue(false);
		}
		logger.info("**************** Finished TC_002_LoginPageTest ****************");
	}
	
	
	
	
	
	
	

}
