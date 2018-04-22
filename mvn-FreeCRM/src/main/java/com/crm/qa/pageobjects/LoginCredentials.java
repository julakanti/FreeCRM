package com.crm.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginCredentials {
public WebDriver driver;
By username =By.xpath(".//*[@id='loginForm']/div/input[1]");
By password=By.xpath(".//*[@id='loginForm']/div/input[2]");
By signin=By.xpath(".//*[@id='loginForm']/div/div/input");

public LoginCredentials(WebDriver driver) {
	this.driver=driver;
}
public WebElement getusr() {
	return driver.findElement(username);
}
public WebElement getpassword() {
	return driver.findElement(password);
}
public WebElement getsignin() {
	return driver.findElement(signin);
}
}
