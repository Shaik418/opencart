package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_004_LoginFailTest extends BaseClass{
	
	@Test
	public void testLoginFail() {
		
		logger.info("**************** Starting TC_004_LoginTestFail ****************");
		try {
		HomePage hp = new HomePage(driver);
		hp.ClickMyaccount();
		logger.info("clicked on my account");
		hp.ClickLogin();
		logger.info("Clicked on login");
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(rb.getString("username"));
		logger.info("Username entered");
		lp.setPassword("yturhf");
		logger.info("wrong password entered");
		lp.clickLogin();
		logger.info("clicked on login");
		
		if(lp.alertDisplayed()) {
			Assert.assertTrue(true);
		}
		
		lp.closeAlert();
		logger.info("alert close");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("**************** Finished TC_004_LoginTestFail ****************");
		
	}
}
