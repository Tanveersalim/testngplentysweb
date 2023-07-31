package com.plentysweb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.plentysweb.pageobjectmodal.Homepage;
import com.plentysweb.pageobjectmodal.Signup;
import com.plentysweb.utilities.Readexcelfile;

public class TC_Signup extends Baseurl {

	
@Test(dataProvider="signupdata")
	public void Signup(String fullname,String email,String phone,String password,String confirmpassword) {
		
		
		
		Homepage hp=new Homepage(driver);
		hp.Clickonsignupbtn();
		logs.info("Click Signup Button");
		
		Signup signup=new Signup(driver);
		signup.EnterFullname(fullname);
		logs.info("Enter Fullname");
		
		signup.EnterEmail(email);
		logs.info("Enter Email Address");
		
		
		signup.EnterPhone(phone);
		logs.info("Enter Phone number");

		signup.EnterPassword(password);
		logs.info("Enter Password");

		signup.EnterConfirmpassword(confirmpassword);
		logs.info("Enter Confirm password");
	
	
		try {
			Thread.sleep(12000);
			logs.info("Wait for 12 Seconds");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		signup.ClickonSignup();
		logs.info("Click on Signup Button");
		
		try {
			Thread.sleep(4000);
			logs.info("Wait for 4 Seconds");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


@DataProvider(name="signupdata")
public String[][] signupdata(){
	String filename=System.getProperty("user.dir")+"\\Testdata\\Testactiondata.xlsx";
	
	int ttrows=Readexcelfile.getRowCount(filename,"signup");
	int ttcol=Readexcelfile.getColCount(filename,"signup");
	
	String Data[][]=new String[ttrows-1][ttcol];
	
	for(int i=1;i<ttrows;i++) {
		for(int j=0;j<ttcol;j++) {
			Data[i-1][j]=Readexcelfile.getCellValue(filename, "signup", i, j);
			
		}
	}
	return Data;
}
		
}
