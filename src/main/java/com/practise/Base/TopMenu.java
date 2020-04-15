package com.practise.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu  {

	WebDriver driver;

	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}

	public void goToAccounts() {
		driver.findElement(By.linkText("Accounts")).click();
		System.out.println("going to click on accounts tab");
		//driver.findElement(By.xpath(".//*[@id='mainMenuTabDiv']/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
		System.out.println("clicked on accounts tab");
	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public void goToDeals() {

	}

	public void goToActivities() {

	}

}
