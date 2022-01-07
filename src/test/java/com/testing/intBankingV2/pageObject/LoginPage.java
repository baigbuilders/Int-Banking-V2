package com.testing.intBankingV2.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name = "uid")
	@CacheLookup
	WebElement UserId;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement LoginButton;
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement linkLogout;
	
	public void setUserName(String uname) {
		UserId.sendKeys(uname);
	}
	
	public void setPassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void setLoginButton() {
		LoginButton.click();
	}
	
	public void setLogout() {
		linkLogout.click();
	}
}