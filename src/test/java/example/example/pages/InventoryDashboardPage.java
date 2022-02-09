package example.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The Class represents InventoryDashboardPage.
 *
 * @author Vardan
 */
public class InventoryDashboardPage extends BasePage {
	
	/** The inventoryButton. */
	@FindBy(xpath="//div/a[@id='result_app_1']")
	private WebElement inventoryButton;

	public InventoryDashboardPage(WebDriver driver) {
		super(driver);
	}

	public void clickInventory()
	{
		inventoryButton.click();
	}

}
