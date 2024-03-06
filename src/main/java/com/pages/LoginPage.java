package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By emailId = By.id("ap_email");
	private By password = By.id("ap_password");
	private By Signinbtn = By.xpath("//a[@id='nav-link-accountList']");
	private By continuebtn =By.id("continue");
	private By loginbtn =By.id("signInSubmit");
	
	
	

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		driver.get("https://www.amazon.in");
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public void clickonsign() {
		driver.findElement(Signinbtn).click();
	}

	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	public void clickoncontinue() {
		driver.findElement(continuebtn).click();
	}
	

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(loginbtn).click();
	}

	public HomePage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(Signinbtn).click();
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(continuebtn).click();
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbtn).click();
		return new HomePage(driver);
	}

}


