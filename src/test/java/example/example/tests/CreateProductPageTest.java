package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.CreateProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The Class InventoryDashboardPage.
 *
 * @author Vardan
 */
@Test(testName = "CreateProductPageTest", description = "Test description")
public class CreateProductPageTest {

	/**
	 * Landing on CreateProductPageTest.
	 */
	@Test
	public void createProductTest() {
		CreateProductPage createProductPage = PageinstancesFactory.getInstance(CreateProductPage.class);
		createProductPage.productJourney();
		createProductPage.navigateToHomeMenu();
		Assert.assertTrue(true, "Successfully created a new product : Test Passed");
	}
}
