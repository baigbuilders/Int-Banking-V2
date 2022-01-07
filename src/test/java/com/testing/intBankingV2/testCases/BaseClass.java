package com.testing.intBankingV2.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.testing.intBankingV2.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig rc = new ReadConfig();
	
	String baseURL = rc.getApplicationURL();
	String username = rc.getUsername();
	String password = rc.getPassword();
	static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setUP(String br) {
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.porperties");
		
		if(br.equals("chrome")) {
			
			System.getProperty("webdriver.chrome.driver", rc.getChromePath());
			driver = new ChromeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir" + "/Screenshots/" + tname + ".png"));
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}
	
	public String randomString() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}
	
	public static String randomNum() {
		
		String generatedNumber = RandomStringUtils.randomNumeric(6);
		return generatedNumber;
	}

}
