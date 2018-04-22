package com.crm.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.crm.qa.pageobjects.LoginCredentials;
import com.crm.qa.pageobjects.Signup;
import com.crm.qa.resources.TestBase;

public class Home extends TestBase {
	 

	@Test(/*dataProvider="getdata"*/)
	public void BasePageNavigation(/*String user,String pass,String test*/) throws IOException, InterruptedException {
		driver=initializer();
		driver.get(prop.getProperty("url"));
	
		LoginCredentials lc=new LoginCredentials(driver) ;
		lc.getusr().sendKeys("naveenk");////user
		Thread.sleep(1000);
		lc.getpassword().sendKeys("test@123");////pass
	//	System.out.println("");//test 
		Thread.sleep(1000);
		lc.getsignin().click();
	
		driver.navigate().back();
		Signup sp=new Signup(driver);
		sp.getsign().click();
		sp.dd().sendKeys("Free Edition");
		sp.getfname().sendKeys("rajsekhar");
		sp.getlanme().sendKeys("rajsekhar");
		sp.getemail().sendKeys("raj@gmail.com");
		sp.getcmail().sendKeys("raj@gmail.com");
		sp.getusername().sendKeys("ramsekhar");
		sp.getpassword().sendKeys("123456789");
		sp.getcpass().sendKeys("123456789");
		sp.getcheck().click();
		Thread.sleep(3000);
		sp.getsubmit().click();
	}
/*@DataProvider
public Object[][] getdata() {
Object[][] data=new Object[2][3]	;
data[0][0]="naveen";
data[0][1]="test@123";
data[0][2]="text";
data[1][0]="naveenk";
data[1][1]="test@123";
data[1][2]="test";


return data;*/
	
	
	
	
}

