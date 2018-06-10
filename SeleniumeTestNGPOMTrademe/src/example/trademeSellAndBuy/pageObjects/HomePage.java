package example.trademeSellAndBuy.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	private WebElement loginButtonOnHomePage;
	
	private final By loginPageSelector = By.id("LoginLink");
	

	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void initPageObjects() throws InterruptedException {
		this.loginButtonOnHomePage = driver.findElement(loginPageSelector);
	}
	
	public WebElement getLoginButtonOnHomePage() {
		return loginButtonOnHomePage;
	}
}
