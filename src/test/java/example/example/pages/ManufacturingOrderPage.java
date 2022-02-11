package example.example.pages;

import example.example.util.TestProperties;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * The Class represents ManufacturingOrderPage.
 *
 * @author Vardan
 */
public class ManufacturingOrderPage extends BasePage {

	/** The manufacturingLink. */
	@FindBy(xpath="//a[@id='result_app_2']")
	private WebElement manufacturingLink;

	/** The stockEmptyCreateButton. */
	@FindBy(xpath="//button[@data-original-title='Create record']")
	private WebElement stockEmptyCreateButton;

	/** The confirmButton. */
	@FindBy(xpath="//button[@name='action_confirm']")
	private WebElement confirmButton;

	/** The productNameManuOrder. */
	@FindBy(xpath="//*[@id='o_field_input_205']")
	private WebElement productNameManuOrder;

	/** The itemQuantity. */
	@FindBy(xpath="//input[@id='o_field_input_232']")
	private WebElement itemQuantity;

	/** The addLine. */
	@FindBy(linkText="Add a line")
	private WebElement addLine;

	/** The markDoneButton. */
	@FindBy(xpath="//button[4][@name='button_mark_done']")
	private WebElement markDoneButton;

	/** The consumedQuantity. */
	@FindBy(xpath="//*[@id='o_field_input_242']/div[2]/div[1]/table/tbody/tr[1]/td[6]")
	private WebElement consumedQuantity;

	/** The productDropdown. */
	@FindBy(xpath="//*[@id='o_field_input_242']/div[2]/div[1]/table/tbody/tr[1]/td[1]//input")
	private WebElement productDropdown;

	/** The newProductCreate. */
	@FindBy(xpath="//footer/button[1]")
	private WebElement newProductCreate;

	/** The searcForRecords. */
	@FindBy(xpath="//div[@class='o_searchview_input_container']/input[@title='Search for records']")
	private WebElement searcForRecords;

	/** The manuOrderNumberVerification. */
	@FindBy(xpath="//td[@class='o_data_cell o_field_cell o_list_char o_readonly_modifier font-weight-bold']")
	private WebElement manuOrderNumberVerification;

	/** The crossLink. */
	@FindBy(xpath="//i[@title='Remove']")
	private WebElement crossLink;

	/** The manuOrderNavigation. */
	@FindBy(linkText="Manufacturing Orders")
	private WebElement manuOrderNavigation;

	/** The fetchManuOrder. */
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/h1/span")
	private WebElement fetchManuOrder;

	/** The manuSave. */
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[1]")
	private WebElement manuSave;

	/** The modalOk. */
	@FindBy(xpath="//footer[@class='modal-footer']/button[1]")
	private WebElement modalOk;

	/** The modalApply. */
	@FindBy(xpath="//footer[@class='modal-footer']//button[@name='process']")
	private WebElement modalApply;

	String manuOrderNumber="";
	String itemQuantityS="//input[@id='o_field_input_232']";
	String stockEmptyCreate="//button[@data-original-title='Create record']";
	String confirm="//button[@name='action_confirm']";



	public ManufacturingOrderPage(WebDriver driver) {
		super(driver);
	}

	public void navigateToManufacturing()
	{
		manufacturingLink.click();
		waitByElement(driver,stockEmptyCreate);
	}

	public void createManufacturingOrder()
	{
		stockEmptyCreateButton.click();
		waitByElement(driver,confirm);
		productNameManuOrder.sendKeys(TestProperties.getProperty("product.name"));
		driver.findElement(By.linkText("Components")).click();
		newProductCreate.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		confirmButton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		for(int i=0; i<=2;i++){
			try{
				markDoneButton.click();
				break;
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		modalOk.click();
		modalApply.click();
		manuOrderNumber= fetchManuOrder.getText();
		manuSave.click();
		//click on save
		}

		//Land on the finally created Prod Order
		public void validateCreatedProdOrder()
		{
			//navigate to Manufacturing order
			manuOrderNavigation.click();
			//click on crossLink
			crossLink.click();

			//enter value in search records
			searcForRecords.sendKeys(manuOrderNumber);
			searcForRecords.sendKeys(Keys.ENTER);
			manuOrderNumberVerification.click();

		}


}
