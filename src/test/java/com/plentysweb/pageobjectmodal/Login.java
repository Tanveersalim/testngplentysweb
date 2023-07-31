package com.plentysweb.pageobjectmodal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
WebDriver driver;
	
	public Login(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="(//input[@placeholder='Enter your email or phone number'])[1]")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pass;
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement Signin;
	
	@FindBy(xpath="(//span[@class='ml-2 select-none'])[1]")
	WebElement account;
	
	@FindBy(xpath="(//div[contains(@class,'inline-flex items-center')][normalize-space()='Logout'])[1]")
	WebElement logout;
	
	
	public void EnterEmail(String EmailAddress) {
		email.sendKeys(EmailAddress);
	}
	public void EnterPass(String Password) {
		pass.sendKeys(Password);
	}

    public void ClickSignin() {
	    Signin.click();
	}
    
    public void ClickAccount() {
	    account.click();
	}
    

    public void ClickLogout() {
	    logout.click();
	}
}

