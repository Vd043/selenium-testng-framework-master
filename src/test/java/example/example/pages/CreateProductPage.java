package example.example.pages;

import example.example.util.TestProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * The Class represents CreateProductPage.
 *
 * @author Vardan
 */
public class CreateProductPage extends BasePage {

	/** The inventoryButton. */
	@FindBy(xpath="//div/a[@id='result_app_1']")
	private WebElement inventoryButton;

	/** The productHeader. */
	@FindBy(xpath="//button[@title='Products']")
	private WebElement productHeader;

	/** The productName. */
	@FindBy(xpath="//*[@id='o_field_input_11']")
	private WebElement productName;

	/** The createButton. */
	@FindBy(xpath="//button[@title='Create record']")
	private WebElement createButton;

	/** The stockEmptyCreateButton. */
	@FindBy(xpath="//button[@data-original-title='Create record']")
	private WebElement stockEmptyCreateButton;

	/** The saveButton. */
	@FindBy(xpath="//button[@title='Save record']")
	private WebElement saveButton;

	/** The updateQuantityButton. */
	@FindBy(xpath="//button[@name='action_update_quantity_on_hand']")
	private WebElement updateQuantityButton;

	/** The inventoryQuantityButton. */
	@FindBy(xpath="//input[@name='inventory_quantity']")
	private WebElement inventoryQuantityButton;

	/** The homeMenu. */
	@FindBy(xpath="//nav/a[1]")
	private WebElement homeMenu;

	String editButton ="//button[@title='Edit record']";


	public CreateProductPage(WebDriver driver) {
		super(driver);
	}

	public void navigateToProduct()
	{
		productHeader.click();
		//waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='o_field_input_1010']")));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Products")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void createNewProduct()
	{
		createButton.click();
		// "//input[@id='o_field_input_1072']"  product name xpath
		//waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='o_field_input_1072']")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		productName.sendKeys(TestProperties.getProperty("product.name"));

	}

	public void saveCreatedProduct()
	{
		saveButton.click();
		waitByElement(driver,editButton);

	}

	public void updateProductQuantity()
	{
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		updateQuantityButton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		stockEmptyCreateButton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		inventoryQuantityButton.clear();
		inventoryQuantityButton.sendKeys("10");
		saveButton.click();
	}

	public void productJourney()
	{
		navigateToProduct();
		createNewProduct();
		saveCreatedProduct();
		updateProductQuantity();
	}

	public void navigateToHomeMenu()
	{
		homeMenu.click();
	}
}
