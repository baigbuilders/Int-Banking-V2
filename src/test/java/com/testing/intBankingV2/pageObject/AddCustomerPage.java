package com.testing.intBankingV2.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver driver;
	
	AddCustomerPage(WebDriver d){
		
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtGender;
	
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement txtDOB;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtPinNo;
	
	@FindBy(how = How.NAME, using ="telephoneno")
	@CacheLookup
	WebElement txtTelephoneNo;
	
	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtEmailId;
	
	@FindBy(how = How.NAME, using ="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement clickSubmit;
	
	@FindBy(how = How.NAME, using = "addnewcust")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	public void clickAddNewCustomer() {
		
		lnkAddNewCustomer.click();
	}
	
	public void setAddcustomer(String addcust) {
		
		txtCustomerName.sendKeys(addcust);
	}
	
	public void setGender(String gen) {
		
		txtGender.sendKeys(gen);
	}
	
	public void setDOB(String date) {
		
		txtDOB.sendKeys(date);
	}
	
	public void setAddress(String add) {
		
		txtAddress.sendKeys(add);
	}
	
	public void setCity(String cty) {
		
		txtCity.sendKeys(cty);
	}
	
	public void setState(String sta) {
		
		txtState.sendKeys(sta);
	}
	
	public void setPinNo(String pin) {
		
		txtPinNo.sendKeys(pin);
	}
	
	public void setTelephoneNo(String telphone) {
		
		txtTelephoneNo.sendKeys(telphone);
	}
	
	public void setEmailId(String email) {
		
		txtEmailId.sendKeys(email);
	}
	
	public void setPassword(String pass) {
		
		txtPassword.sendKeys(pass);
	}
	
	public void clickSubmit() {
		
		clickSubmit.click();
	}

}
