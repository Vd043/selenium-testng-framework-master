package example.example.pages;

import example.example.util.TestProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * The Class represents InventoryDashboardPage.
 *
 * @author Vardan
 */
public class CreateProductPage extends BasePage {

	/** The inventoryButton. */
	@FindBy(xpath="//div/a[@id='result_app_1']")
	private WebElement inventoryButton;

	@FindBy(xpath="//button[@title='Products']")
	private WebElement productHeader;

	@FindBy(xpath="//input[@id='o_field_input_1010']")
	private WebElement productName;

	@FindBy(xpath="//button[@title='Create record']")
	private WebElement createButton;

	@FindBy(xpath="//button[@title='Save record']")
	private WebElement saveButton;



	public CreateProductPage(WebDriver driver) {
		super(driver);
	}

	public void navigateToProduct()
	{
		productHeader.click();
		//waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='o_field_input_1010']")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Products")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void createNewProduct()
	{
		createButton.click();
		// "//input[@id='o_field_input_1072']"  product name xpath
		//waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='o_field_input_1072']")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		productName.sendKeys(TestProperties.getProperty("product.name"));
		driver.findElement(By.xpath("//a[@title='Favorite']")/following-sibling);
	}

	public void saveCreatedProduct()
	{
		saveButton.click();
	}

}
