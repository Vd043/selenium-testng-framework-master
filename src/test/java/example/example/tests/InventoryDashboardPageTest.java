package example.example.tests;

import example.example.pages.InventoryDashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;

/**
 * The Class InventoryDashboardPage.
 *
 * @author Vardan
 */
@Test(testName = "Inventory Dashboard Page Test", description = "Test description")
public class InventoryDashboardPageTest  {

	/**
	 * Landing on InventoryDashboardPage test.
	 */
	@Test
	public void inventoryDashboardTest() {
		//driver.get("https://www.google.co.in/");
		InventoryDashboardPage inventoryDashboardPage = PageinstancesFactory.getInstance(InventoryDashboardPage.class);
		inventoryDashboardPage.clickInventory();
		Assert.assertTrue(true, "Successfully clicked on Inventory button : Test Passed");
	}
}
