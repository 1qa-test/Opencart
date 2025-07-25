package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test
	public void verify_login()
	{
		//Home
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		//MyAccount
		MyAccountPage acc_page=new MyAccountPage(driver);
		Boolean targetpage=acc_page.isMyAccountPageExists();
		
		Assert.assertTrue(targetpage);
		
		acc_page.clickLogout();	
	}

}
