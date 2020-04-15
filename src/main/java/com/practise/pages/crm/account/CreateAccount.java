package com.practise.pages.crm.account;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practise.Base.Page;

public class CreateAccount extends Page {
	WebDriverWait wait;
public CreateAccount() throws Exception {
		super();
		wait= new WebDriverWait(driver, 10);
		// TODO Auto-generated constructor stub
	}

public void createAccount( String accountName)
{
System.out.println("going to click on account name");
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#Crm_Accounts_ACCOUNTNAME")));
//driver.findElement(By.cssSelector("#Crm_Accounts_ACCOUNTNAME")).sendKeys(accountName);
type("accountname_CSS",accountName);
System.out.println("added  account name");
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#saveAccountsBtn")));
click("savebtn_CSS");
//driver.findElement(By.cssSelector("#saveAccountsBtn")).click();
System.out.println("clicked on save account");
}
	
}
