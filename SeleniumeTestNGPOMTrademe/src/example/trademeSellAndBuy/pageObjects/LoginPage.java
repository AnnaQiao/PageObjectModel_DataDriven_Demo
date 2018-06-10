package example.trademeSellAndBuy.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	private WebElement emailAddress;
	private WebElement password;
	private WebElement loginButtonOnLoginPage;

	private final By emailAddressSelector = By.id("page_email");
	private final By passwordSelector = By.id("page_password");
	private final By loginButtonSelector = By.id("LoginPageButton");

	//Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void initPageObjects() throws InterruptedException {
		this.emailAddress = driver.findElement(emailAddressSelector);
		this.password = driver.findElement(passwordSelector);
		this.loginButtonOnLoginPage = driver.findElement(loginButtonSelector);
	}
	
	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButtonOnLoginPage() {
		return loginButtonOnLoginPage;
	}

}