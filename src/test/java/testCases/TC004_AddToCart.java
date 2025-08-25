package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.SearchProductPage;
import pageObject.ShoppingCart;
import testBase.BaseClass;

public class TC004_AddToCart extends BaseClass{
	
	@Test(priority=1)
	public void verify_AddToCart()
	{
		logger.info("****** Starting TC004_AddToCart *****");
		
		//Search Product
		SearchProductPage spg=new SearchProductPage(driver);
		spg.setProductName(p.getProperty("productname"));
		spg.clickSearch();
		
		//Product Added to Cart
		spg.clickAddToCart();
	}
	
	@Test(priority=2)
	public void verify_ValidateAddToCart()
	{
		try {
		ShoppingCart sc=new ShoppingCart(driver);
		
		String expectedProductName = p.getProperty("productname");
	    String actualProductName = sc.checkProduct(expectedProductName);

	    Assert.assertEquals(actualProductName, expectedProductName);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("****** Finished TC004_AddToCart *****");
	}
}
