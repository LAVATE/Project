package com.practise.Test;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.practise.Base.Page;
import com.practise.pages.ZohoAppPage;
import com.practise.pages.crm.account.AccountPage;
import com.practise.pages.crm.account.CreateAccount;
import com.practise.utilities.TestUtil;


public class CreateAccountTest extends TestBase {
	
	public CreateAccountTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void createAccount(Hashtable<String, String> data) throws Exception
	{
	ZohoAppPage zohoAppPage=new ZohoAppPage();
	zohoAppPage.goToCRM();
	Page.topMenu.goToAccounts();
	AccountPage accountPage = new AccountPage();
	CreateAccount createAccount = accountPage.goToCreateAccount();
	createAccount.createAccount(data.get("AccountName"));
}
}
