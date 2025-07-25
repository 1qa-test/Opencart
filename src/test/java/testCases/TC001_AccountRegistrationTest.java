package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verify_account_registration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage reg_page=new AccountRegistrationPage(driver);
		
		reg_page.setFirstName(randomeString().toUpperCase());
		reg_page.setLastName(randomeString().toUpperCase());
		reg_page.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		reg_page.setTelephone(randomeNumber());
			
		String password=randomeAlphaNumberic();
			
		reg_page.setPassword(password);
		reg_page.setConfirmPassword(password);
		
		reg_page.setPrivacyPolicy();
		reg_page.clickContinue();
		
		String confmsg = reg_page.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");

	}

}
