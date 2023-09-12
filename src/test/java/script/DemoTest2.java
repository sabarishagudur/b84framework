package script;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class DemoTest2 extends BaseTest
{

	@Test
	public void testA()
	{
		Reporter.log(driver.getTitle(),true);
		Assert.fail();
	}
}
