package com.testing.intBankingV2.testCases;

import java.io.IOException;

import org.testng.Assert;

import com.testing.intBankingV2.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	public void loginTest() throws IOException {
		
		driver.get(baseURL);
		logger.info("URL is open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is entered");
		
		lp.setPassword(password);
		logger.info("Password is entered");
		
		lp.setLoginButton();
		logger.info("Submit button clicked");
		
		if(driver.getTitle().equals("Guru99 Bank Home Page")) {
			
			Assert.assertTrue(true);
			logger.info("Logging Test Passed");
			
		} else {
			
			captureScreen(driver, "loginTest");
			Assert.assertFalse(false);
			logger.info("Logging Test Failed");
		}
		
	}

}
