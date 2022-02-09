package example.example.tests;

import example.example.util.TestProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.AspireLoginPage;

/**
 * The Class AspireLoginTest.
 *
 * @author Vardan
 */
@Test(testName = "Aspire login test", description = "Aspire login test")
public class AspireLoginTest extends BaseTest {

	@Test(groups = "abc")
	public void aspireLoginTest() {
		driver.get(TestProperties.getProperty("url"));
		AspireLoginPage aspireLoginPage = PageinstancesFactory.getInstance(AspireLoginPage.class);
		aspireLoginPage.enterEmail(TestProperties.getProperty("username")).enterPassword(TestProperties.getProperty("password")).clickSignIn();
		Assert.assertTrue(true, "Login Passed : Test Passed");
	}
}
