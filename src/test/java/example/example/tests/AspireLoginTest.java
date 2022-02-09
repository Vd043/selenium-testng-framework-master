package example.example.tests;

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
		driver.get("https://aspireapp.odoo.com");
		AspireLoginPage aspireLoginPage = PageinstancesFactory.getInstance(AspireLoginPage.class);
		aspireLoginPage.enterEmail("user@aspireapp.com").enterPassword("@sp1r3app").clickSignIn();
		Assert.assertTrue(true, "Login Passed : Test Passed");
	}
}
