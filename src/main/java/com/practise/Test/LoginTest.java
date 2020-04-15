package com.practise.Test;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.practise.pages.LoginPage;

import com.practise.utilities.TestUtil;



public class LoginTest extends TestBase {
	public LoginTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void LoginTest(Hashtable<String, String> data) throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.doLogin(data.get("username"), data.get("password"));
		//Assert.fail("login test failed");
		
	}
}
