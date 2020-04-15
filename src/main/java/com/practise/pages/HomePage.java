package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.practise.Base.Page;

public class HomePage extends Page {

	
	public HomePage() throws Exception {
		super();
		System.out.println("homepage constructor called");
		//this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	public void gotoLogin()
	{
		System.out.println("got");
		System.out.println(driver.findElement(By.cssSelector(OR.getProperty("loginlink_CSS"))));
		click("loginlink_CSS");
		//driver.findElement(By.cssSelector(".zh-login"));
		//driver.findElement(By.linkText("Login")).click();;
		System.out.println("navigated to login page");
		//driver.findElement(By.xpath("html/body/div[2]/div[2]/div/a[4]")).click();
		//
	}
	

	public void gotoSupport()
	{
		
	}

	public void gotoSignUp()
	{
		
	}

	public void gotoCustomers()
	{
		
	}

	
	
}
