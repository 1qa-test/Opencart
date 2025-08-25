package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);  // call parent class driver
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;

	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;

	@FindBy(linkText = "Login")   
	WebElement linkLogin;

	@FindBy(xpath="//ul[@class=\"list-inline\"]//li[4]")
	WebElement btnShoppingCart;

	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}

	public void clickRegister()
	{
		lnkRegister.click();
	}

	public void clickLogin()
	{
		linkLogin.click();
	}
	
	public void clickShoppingCart()
	{
		btnShoppingCart.click();
	}
	

}
