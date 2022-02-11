package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.ManufacturingOrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The Class ManufacturingOrderPageTest.
 *
 * @author Vardan
 */
@Test(testName = "ManufacturingOrderPageTest", description = "Test description")
public class ManufacturingOrderPageTest {

	/**
	 * Landing on ManufacturingOrderPageTest.
	 */
	@Test
	public void manufacturingOrderTest() {
		ManufacturingOrderPage manufacturingOrderPage = PageinstancesFactory.getInstance(ManufacturingOrderPage.class);
		manufacturingOrderPage.navigateToManufacturing();
		manufacturingOrderPage.createManufacturingOrder();
		manufacturingOrderPage.validateCreatedProdOrder();
		Assert.assertTrue(true, "Successfully created a manufacturing order : Test Passed");
	}
}
