package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchProductPage extends BasePage{
	
	public SearchProductPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement txtSearchProduct;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;
	
	@FindBy(xpath="//a[normalize-space()='iPhone']")
	WebElement productName;
	
	public void setProductName(String productname)
	{
		txtSearchProduct.sendKeys(productname);
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}
	
	public Boolean isProductExist()
	{
		try
		{
		return (productName.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
