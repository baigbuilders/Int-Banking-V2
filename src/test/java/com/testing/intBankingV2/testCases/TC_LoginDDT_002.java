package com.testing.intBankingV2.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testing.intBankingV2.pageObject.LoginPage;
import com.testing.intBankingV2.utilities.XLUtiles;

public class TC_LoginDDT_002 extends BaseClass{
	
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("UserName is Provided");
		
		lp.setPassword(pwd);
		logger.info("Password is Provided");
		
		lp.setLoginButton();
		
		Thread.sleep(3000);
		
		
		
		if(isAlertPresent()==true) {
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
			
		} else {
			Assert.assertTrue(true);
			logger.info("Logging is Passed");
			lp.setLogout();
			
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
		public boolean isAlertPresent() {
			
			try {
				driver.switchTo().alert().accept();
				
				return true;
			} catch (NoAlertPresentException e) {
				
				return false;
			}
		}
		
		@DataProvider(name = "LoginData")
		String [][] getData() throws IOException{
			
			String path = System.getProperty("user.dir") + "/src/test/java/com/intBankingV1/LoginData.xlsx";
			
			int rowNum = XLUtiles.getRowCount(path, "Sheet1");
			int colNum = XLUtiles.getCellCount(path,"Sheet1");
			
			String [][] loginData = new String[rowNum][colNum];
		}
	}

}
