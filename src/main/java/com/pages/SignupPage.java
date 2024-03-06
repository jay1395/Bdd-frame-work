package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;

public class SignupPage {
	private WebDriver driver;
	private By Signin = By.xpath("//a[@id='nav-link-accountList']");
	private By createacc= By.id("createAccountSubmit");
	//private By starthere = By.partialLinkText("Start here.");
	private By name = By.id("ap_customer_name");
	private By number = By.id("ap_phone_number");
	private By password = By.xpath("//input[@id='ap_password']");
	private By verifybtn = By.xpath("//input[@id='continue']");
	private By Errormsg = By.xpath("//div[@id='auth-error-message-box']");
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		driver.get("https://www.amazon.in");
		
		
	}
	public String getSignuppagetitle() {
		return driver.getTitle();
		
	}
	public   SignupPage clickonstart() throws IOException {
		driver.findElement(Signin).click();
		driver.findElement(createacc).click();
	
		return new SignupPage(driver);
	}
	public String fillname(String nm) {
		driver.findElement(Signin).click();
		driver.findElement(createacc).click();
		driver.findElement(name).sendKeys(nm);
		return new String();
		
	}
	public String fillnumber(String nu) {
		driver.findElement(number).sendKeys(nu);
		return new String();
	}
	public String fillpassword(String ps) {
	driver.findElement(password).sendKeys(ps);
		return new String();
	}
	public LoginPage verifybtn() {
		driver.findElement(verifybtn).click();
		return new LoginPage(driver);
	}
	public String errormsg() {
		return driver.findElement(Errormsg).getText();
		
	}
}
