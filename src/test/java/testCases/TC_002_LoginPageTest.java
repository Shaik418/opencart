package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginPageTest extends BaseClass{
	
	
	
	@Test
	public void testLogin() {
		
		logger.info("**************** Starting TC_002_LoginPageTest ****************");
		
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
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountPageExists();
		Assert.assertEquals(targetpage, true);
		
		macc.clickLogout();
		logger.info("Clicked on logout");
		
		}catch(Exception e) {
			Assert.assertTrue(false);
		}
		logger.info("**************** Finished TC_002_LoginPageTest ****************");
	}
	
	

}
