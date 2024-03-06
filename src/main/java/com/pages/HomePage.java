package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.factory.DriverFactory;

public class HomePage {

	
	private WebDriver driver;
	private By delivary = By.xpath("//div[@id='glow-ingress-block']");
	private By  serchbar =By.xpath("//input[@id='twotabsearchtextbox']");
	private By Accountname = By.xpath("//a[@id='nav-link-accountList']");
	private By Headerlinks = By.xpath("//div[@id='nav-xshop']//a");
	private By footerlinks =By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//li");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		driver.get("https://www.amazon.in");
	}
	public String getHomePageTitle() {
		return driver.getTitle();
	}
public void clicksonaccountname() {
	driver.findElement(Accountname).click();
}
public void clicksondelivarytab() {
	driver.findElement(delivary).click();
}
public void clicksonserchbar() {
	driver.findElement(serchbar).click();
}
public List<String> headrlinkcount() {
	List<String> headerlist = new ArrayList<>();
	List<WebElement>headerlink = driver.findElements(Headerlinks);
	for(WebElement e :headerlink) {
		String text =e.getText();
		System.out.println(text);
		headerlist.add(text);
		
	}
	return headerlist;
	
}
public List<String> footerlinks() {
	List<String>footerlist =new ArrayList<>();
	List<WebElement>footerlink =driver.findElements(footerlinks);
	for(WebElement f :footerlink) {
		
	String ftext =	f.getText();
	System.out.println(ftext);
	footerlist.add(ftext);
	}
	return footerlist;
		
		
		
		
		
		
		
		
		
		
	
	
	
}

}