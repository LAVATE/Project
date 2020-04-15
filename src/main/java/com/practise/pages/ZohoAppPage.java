package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practise.Base.Page;

public class ZohoAppPage extends Page{

	

	
	public ZohoAppPage() throws Exception {
		super();
		System.out.println("zohoapp constructor called");
		wait=new WebDriverWait(driver, 15);
		//this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void goToBooks()
	{
		
	}
	public void goToCalender()
	{
		
	}
	public void goToCRM()
	{

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._logo-crm._logo-x96.zod-app-logo")));
	driver.findElement(By.cssSelector("._logo-crm._logo-x96.zod-app-logo")).click();
	System.out.println("navigated to CRM page");
	}
	public void goToShow()
	{
		
	}
}
