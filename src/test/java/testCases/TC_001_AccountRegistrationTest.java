package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	@Test
	public void test_account_Registration() {
		
		try {
			
			
		logger.info("**************** Starting TC_001_AccountRegistrantionTest ****************");
		HomePage hp = new HomePage(driver);
		hp.ClickMyaccount();
		logger.info("My account clicked");
		
		hp.ClickRegister();
		logger.info("Register clicked");
		
		AccountRegistrationPage repage = new AccountRegistrationPage(driver);
		repage.setUsername(randomString());
		logger.info("User name entered");
		
		repage.setLastname(randomString());
		logger.info("Last name entered");
		
		repage.setEmail(randomString()+"@gmail.com");
		logger.info("Entered G-mail");
		
		repage.setPassword(randomAlphaNumeric());
		logger.info("Entered password");
		
		repage.setPrivacyPolicy();
		logger.info("Checked on privacy policy");
		
		repage.clickContinue();
		logger.info("Clicked on Continue button");
		
		
		if(repage.getConfirmationMsg().equals("Your Account Has Been Created!")) {
			logger.info("Test passed");
			logger.info("**************** Completed TC_001_AccountRegistrantionTest ****************");
			Assert.assertTrue(true);
		}else {
			
			logger.error("Test failed");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(repage.getConfirmationMsg(), "Your Account Has Been Created!");	
		}catch(Exception e) {
			Assert.fail();
		}
		
	}
	
	

}
