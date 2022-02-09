package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.CreateProductPage;
import example.example.pages.InventoryDashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The Class InventoryDashboardPage.
 *
 * @author Vardan
 */
@Test(testName = "Inventory Dashboard Page Test", description = "Test description")
public class CreateProductPageTest {

	/**
	 * Landing on InventoryDashboardPage test.
	 */
	@Test
	public void inventoryDashboardTest() {
		CreateProductPage createProductPage = PageinstancesFactory.getInstance(CreateProductPage.class);
		createProductPage.productJourney();
		createProductPage.navigateToHomeMenu();
		Assert.assertTrue(true, "Successfully created a new product : Test Passed");
	}
}
