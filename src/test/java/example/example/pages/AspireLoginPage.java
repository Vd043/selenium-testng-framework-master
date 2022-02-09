package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * The Class represents AspireLoginPage.
 *
 * @author Vardan
 */
public class AspireLoginPage extends BasePage {

	/** The email input. */
	@FindBy(id = "login")
	private WebElement emailInput;

	/** The pass. */
	@FindBy(id = "password")
	private WebElement pass;

	/**
	 * Instantiates a new aspire login page.
	 *
	 * @param driver the driver
	 */
	public AspireLoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Enter email.
	 *
	 * @param email the email
	 * @return the aspire login page
	 */
	public AspireLoginPage enterEmail(String email) {
		emailInput.sendKeys(email);
		return this;
	}

	/**
	 * Enter password.
	 *
	 * @param password the password
	 * @return the aspire login page
	 */
	public AspireLoginPage enterPassword(String password) {
		pass.sendKeys(password);
		return this;
	}

	/**
	 * Click sign in.
	 */
	public void clickSignIn() {
		pass.submit();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
