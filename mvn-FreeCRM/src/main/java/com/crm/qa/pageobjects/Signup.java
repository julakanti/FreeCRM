package com.crm.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {
public WebDriver driver;
		// TODO Auto-generated constructor stub
	By dropd=By.xpath(".//*[@id='payment_plan_id']");
	
By signup=By.xpath("html/body/div[2]/div/a[2]/button");
By fname=By.xpath(".//*[@id='multipleForm']/div[3]/input");
By lnsem=By.xpath(".//*[@id='multipleForm']/div[4]/input");
By email=By.xpath(".//*[@id='multipleForm']/div[5]/input");
By cemail=By.xpath(".//*[@id='multipleForm']/div[6]/input");
By username=By.xpath(".//*[@id='username']/input");
By password=By.xpath(".//*[@id='multipleForm']/div[8]/input");
By cpassword=By.xpath(".//*[@id='multipleForm']/div[9]/input");
By checkbox=By.xpath(".//*[@id='multipleForm']/div[11]/div/label/input");
By submit=By.xpath(".//*[@id='submitButton']");

public Signup(WebDriver driver) {
	this.driver=driver;	
}
public WebElement getsign() {
	return driver.findElement(signup);	
}
public WebElement getfname() {
	return driver.findElement(fname);	
}
public WebElement getlanme() {
	return driver.findElement(lnsem);	
}
public WebElement getemail() {
	return driver.findElement(email);	
}
public WebElement getcmail() {
	return driver.findElement(cemail);	
}
public WebElement getusername() {
	return driver.findElement(username);
}
public WebElement getpassword() {
	return driver.findElement(password);	
}
public WebElement getcpass() {
	return driver.findElement(cpassword);	
}
public WebElement getcheck() {
	return driver.findElement(checkbox);	
}
public WebElement getsubmit() {
	return driver.findElement(submit);	
}
public WebElement dd() {
	return driver.findElement(dropd);
	
}
}
