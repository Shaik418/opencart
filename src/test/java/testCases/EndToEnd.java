package testCases;

import org.apache.logging.log4j.Level;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class EndToEnd extends BaseClass{
	
	@Test
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
		
		MyAccountPage ma = new MyAccountPage(driver);
		ma.ClickHome();
		
		
		hp.EnterText();
		logger.info("text entered");
		hp.ClickSearch();
		logger.info("Clicked on search");
		hp.ClickSelectedProduct();
		logger.info("Product selected");
		hp.ClickAddtoCart();
		logger.info("added to cart");
		hp.ClickShoppingCart();
		logger.info("Clicked on shopping cart");
		
		ShoppingCartPage sc = new ShoppingCartPage(driver);
		sc.ClickCheckout();
		logger.info("Clicked on Checkout");
		
		
	//	MyAccountPage macc=new MyAccountPage(driver);
	//	macc.clickLogout();
	//	logger.info("Clicked on logout");
		
		}catch(Exception e) {
			
		// the below logger is to print the exception got while execution	
		//	logger.log(Level.FATAL,"Exceptio found was: "+e.getMessage(),e);
			
			Assert.assertTrue(false);
		}
		logger.info("**************** Finished TC_002_LoginPageTest ****************");
	}
	
	
	
	
	
	
	

}
