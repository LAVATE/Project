package com.practise.pages.crm.account;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practise.Base.Page;

public class AccountPage extends Page {

	WebDriverWait wait;
	public AccountPage() throws Exception {
		super();
		wait = new WebDriverWait(driver, 10);
		// TODO Auto-generated constructor stub
	}
	public CreateAccount goToCreateAccount() throws Exception
	{
		System.out.println("going to click on add account");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".newwhitebtn.customPlusBtn")));
		driver.findElement(By.cssSelector(".newwhitebtn.customPlusBtn")).click();
		//driver.findElement(By.linkText("Accounts")).click();
		System.out.println("clicked on add account");
		return new CreateAccount();
	}
	public void goToImportAccount()
	{
		
	}
}
