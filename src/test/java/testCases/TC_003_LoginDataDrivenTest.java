package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends BaseClass {
	
	

	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_LoginDDT(String username, String password, String res) {
		
		logger.info("**************** TC_003_LoginDataDrivenTest Started ****************");
		
		try {
		HomePage hp = new HomePage(driver);
		hp.ClickMyaccount();
		logger.info("Clicked on my account");
		hp.ClickLogin();
		logger.info("Clicked on login");
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickLogin();
		logger.info("Clicked on login");
	/*	try {
			lp.closeAlert(); 
		}catch(Exception e) {
			lp.closeAlert();
		}	*/
		
		
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage = macc.isMyAccountPageExists();// this method is created MyAccountPage
		

		if(lp.alertDisplayed()) {
			lp.closeAlert();
		}
					
		if(res.equalsIgnoreCase("Valid")) 
		{
			if(targetpage==true) 
			{
				macc.clickLogout();
				logger.info("Clicked on logout Valid");
				Assert.assertTrue(true);
			}else 
			{
				Assert.assertTrue(false);
			}
			
		}
		if(res.equalsIgnoreCase("Invalid")) 
		{
			
			if(targetpage==true) {
				macc.clickLogout();
				logger.info("Clicked on logout Invalid");
				Assert.assertTrue(false);			
		}else {
			Assert.assertTrue(true);
		}
			
		}
		
		//logger.info("Clicked on logout");
		logger.info("**************** TC_003_LoginDataDrivenTest Started ****************");
		
		}catch(Exception e) {
			Assert.fail();
		}
		
		
	}
	
	

}
