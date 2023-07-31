package com.plentysweb.testcases;


import org.testng.annotations.*;

import com.plentysweb.pageobjectmodal.*;
import com.plentysweb.utilities.Readexcelfile;

public class TC_Login extends Baseurl {
  
	
	@Test(dataProvider="Logindata")
	public void Loginweb(String email,String password) {
		
		
	
		
		Homepage hp=new Homepage(driver);
		hp.Clickonloginbtn();
		logs.info("Click Login Button");
		
		Login login=new Login(driver);
		login.EnterEmail(email);
		logs.info("Enter Email Address");
		login.EnterPass(password);
		logs.info("Enter Password");
		login.ClickSignin();
		logs.info("Click on Signin Button");
		try {
			Thread.sleep(3000);
			logs.info("Wait for 3 Seconds");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login.ClickAccount();
		logs.info("Click Account Button");
		login.ClickLogout();
		logs.info("Click Logout Button");
		try {
			Thread.sleep(2000);
			logs.info("Wait for 2 Seconds");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@DataProvider(name="Logindata")
	public String[][] Logindata(){
		String filename=System.getProperty("user.dir") + "\\TestData\\Testactiondata.xlsx";
		int ttrows=Readexcelfile.getRowCount(filename, "login");
		int ttcol=Readexcelfile.getColCount(filename, "login");
		
		String Data[][]=new String[ttrows-1][ttcol];
		
		for(int i=1;i<ttrows;i++) {
			for(int j=0;j<ttcol;j++) {
				Data[i-1][j]=Readexcelfile.getCellValue(filename, "login",i,j);
				
			}
			
		}
		return Data;
		
		
		
		
		
	}
}
