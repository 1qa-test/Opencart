package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends BasePage{
	
	
	
	public ShoppingCart(WebDriver driver)
	{
		super(driver);
	}
	
	public String checkProduct(String productname) {
       String dynamicXpath = "(//a[contains(text(),'" + productname + "')])[2]";
       String Productname=driver.findElement(By.xpath(dynamicXpath)).getText();
       return Productname;
        
	
	}
	
	

}
