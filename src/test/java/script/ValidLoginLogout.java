package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLoginLogout extends BaseTest
{

	@Test(priority = 1)
	public void testValidLoginLogout() {
		String un=Excel.getCellValue(xl_path, "ValidLoginLogout", 1, 0);
		String pwd =Excel.getCellValue(xl_path, "ValidLoginLogout", 1, 1);
		LoginPage loginpage= new LoginPage(driver);
//		1. enter valid un
		loginpage.setUserName(un);
//		2. enter valid pw
		loginpage.setPassword(pwd);
//		3. click login button
		loginpage.clickLoginButton();
//		4. click logout link
		EnterTimeTrackPage ettPage=new EnterTimeTrackPage(driver);
		boolean result = ettPage.verifyLogoutIsDisplayed(wait);
		Assert.assertTrue(result);
		ettPage.clickLogoutLink();
//		5. verify that login page is displayed	
		boolean loginres=loginpage.verifyLoginPageIsDisplayed(wait);
		Assert.assertTrue(loginres);
		
	}
}
