package example.trademeSellAndBuy.pageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
	    this.driver = driver;
	}
	
	public LoginPage navigateTo() {
		
	    driver.navigate().to("https://www.trademe.co.nz/");
	   
	    return new LoginPage(driver);
	}
}