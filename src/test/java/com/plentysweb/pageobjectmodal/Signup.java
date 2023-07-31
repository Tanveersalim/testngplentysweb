package com.plentysweb.pageobjectmodal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {

WebDriver driver;
	
	public Signup(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//input[@placeholder='Your Name *']")
	WebElement fullname;
	
	@FindBy(xpath="//input[@placeholder='Enter Your Email Address *']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Your Phone Number *']")
	WebElement phone;
	
	@FindBy(xpath="(//input[contains(@placeholder,'Password')])[1]")
	WebElement password;
	
	@FindBy(xpath="(//input[contains(@placeholder,'Password')])[2]")
	WebElement confirmpassword;
	
	@FindBy(xpath="(//button[contains(@type,'submit')][normalize-space()='Sign Up'])[1]")
	WebElement signup;
	
	
	
	public void EnterFullname(String Fullname) {
		fullname.sendKeys(Fullname);
	}
	public void EnterEmail(String Email) {
		email.sendKeys(Email);
	}
    
	public void EnterPhone(String Phone) {
		phone.sendKeys(Phone);
	}
    
	public void EnterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void EnterConfirmpassword(String Confirmpassword) {
		confirmpassword.sendKeys(Confirmpassword);
	}
	public void ClickonSignup() {
		signup.click();
	}
}
