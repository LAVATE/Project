package com.practise.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practise.Base.Page;
import com.practise.Base.TopMenu;
import com.practise.pages.HomePage;
import com.practise.pages.LoginPage;
import com.practise.pages.ZohoAppPage;
import com.practise.pages.crm.account.AccountPage;
import com.practise.pages.crm.account.CreateAccount;

public class loginTest  {
	
	

	public static void main(String[] args) throws Exception {
		
		/*System.setProperty("webdriver.firefox.marionette", "/src/executables/geckodriver.exe");
		
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/");
		Thread.sleep(5000);
		System.out.println("got");
*/		//driver.findElement(By.linkText("Login")).click();;
		//HomePage homepage= new HomePage(driver);
		//homepage.gotoLogin();
		
	   /* System.out.println("navigated successfully");
	    System.out.println("got");
		driver.findElement(By.linkText("Login")).click();;*/
	    LoginPage loginPage = new LoginPage();
	    
	    ZohoAppPage zohoAppPage = loginPage.doLogin("shwetalavate7@gmail.com","Zoho@123");
	    //WebDriverWait wait = new WebDriverWait(driver, 5);
		
	   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._logo-crm._logo-x96.zod-app-logo")));
	   // ZohoAppPage zohoAppPage = new ZohoAppPage();
	    zohoAppPage.goToCRM();
	    //Thread.sleep(5000);
	    Page.topMenu.goToAccounts();
	    AccountPage accountPage= new AccountPage();
	    CreateAccount createAccount = accountPage.goToCreateAccount();
	    //Thread.sleep(5000);
	    //CreateAccount createAccount = new CreateAccount();
	    createAccount.createAccount("Raman");
	    //driver.quit();
	    //String captcha=driver.findElement(By.cssSelector("#hip")).getAttribute("data:image/png");
	    //System.out.println(captcha);
	}

}
