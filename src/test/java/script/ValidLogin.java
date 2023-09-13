package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest
{
	@Test(priority = 1,groups= {"smoke","regression"})
	public void testValidLogin()
	{
//		1. enter valid un
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("admin");
//		2. enter valid pw
		loginPage.setPassword("manager");
//		3. click login button
		loginPage.clickLoginButton();
//		4. home page should be displayed
		EnterTimeTrackPage ettPage=new EnterTimeTrackPage(driver);
		boolean result = ettPage.verifyLogoutIsDisplayed(wait);
		Assert.assertTrue(result);
	}
}
