package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import pageObject.SearchProductPage;
import testBase.BaseClass;

public class TC003_SearchProduct extends BaseClass{
	
	@Test
	public void verify_search()
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
		
		//Search Product
		SearchProductPage spg=new SearchProductPage(driver);
		spg.setProductName(p.getProperty("productname"));
		spg.clickSearch();
		Boolean targetproduct=spg.isProductExist();
		
		Assert.assertTrue(targetproduct);
		
		
		
		
		
		//Logout
		//MyAccountPage acc_page=new MyAccountPage(driver);
		//acc_page.clickLogout();
		
		
		
	}

}
