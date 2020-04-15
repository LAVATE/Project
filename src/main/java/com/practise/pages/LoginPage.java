package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practise.Base.Page;
import com.thoughtworks.selenium.webdriven.WebDriverCommandProcessor;

public class LoginPage extends Page {

	public LoginPage() throws Exception {
		super();
		System.out.println("Login Page constructed called");
		// this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public ZohoAppPage doLogin(String userName, String passWord) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		HomePage homepage = new HomePage();
		homepage.gotoLogin();
		System.out.println("gotoLogin executed successfully");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login_id")));
		type("email_CSS", userName);
		System.out.println("found login webelement");
		click("nextbtn_CSS");
		System.out.println("found next webelement");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
		type("password_CSS", passWord);
		click("nextbtn_CSS");
		System.out.println("logged in successfully");
		Thread.sleep(60000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nextbtn")));
		click("nextbtn_CSS");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.blue.trustdevice.trustbtn")));
		click("trustbtn_CSS");
		System.out.println("on zoho app page");
		return new ZohoAppPage();
	}

}
