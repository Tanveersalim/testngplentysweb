package com.plentysweb.pageobjectmodal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	public Homepage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="(//button[normalize-space()='Log In'])[1]")
	WebElement login;
	
	@FindBy(xpath="(//button[normalize-space()='Sign Up'])[1]")
	WebElement signup;
	
	public void Clickonloginbtn() {
		login.click();
	}
	public void Clickonsignupbtn() {
		signup.click();
	}
}
