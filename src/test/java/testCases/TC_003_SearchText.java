package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import testBase.BaseClass;

public class TC_003_SearchText extends BaseClass {
	
	@Test
	public void testSearch() {
		try {
			
			logger.info("************ TC_003_SearchText started ************");
		AccountRegistrationPage lp = new AccountRegistrationPage(driver);
		lp.enterImac();
		logger.info("entered imac text in searchBox");
		lp.clickSearchBtn();
		logger.info("clicked on search");
		
		
		boolean rd =lp.resultDisplayed();
		
		Assert.assertTrue(rd);
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("************ TC_003_SearchText finished ************");
	}
	
}
