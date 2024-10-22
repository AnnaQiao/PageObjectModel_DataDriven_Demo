package example.trademeSellAndBuy.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import example.trademeSellAndBuy.pageObjects.HomePage;
import example.trademeSellAndBuy.pageObjects.LoginPage;
import example.trademeSellAndBuy.pageObjects.NavigationPage;
import example.trademeSellAndBuy.utility.ExcelUtil;

public class LoginAction {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homepage;
	NavigationPage nav;
	@BeforeTest
	public void startUp() throws IOException {
		System.setProperty("webdriver.firefox.marionette", "C:/geckodriver.exe");
		driver = new FirefoxDriver();
		ExcelUtil.setExcelFileSheet("loginData");
		homepage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		loginPage.navigateTo();
	}

    //@Parameters({"admin","admin"})
	@Test
	public void loginAsAdmin() throws Throwable {
		Thread.sleep(5000);
		//click login button on home page to open login page
		homepage.initPageObjects(); 
		homepage.getLoginButtonOnHomePage().click();
		//waiting load page completely, enter email address  and password 
		Thread.sleep(15000);
		loginPage.initPageObjects();
		
		loginPage.getEmailAddress().sendKeys(ExcelUtil.getCellData(1, 1));
		loginPage.getPassword().sendKeys(ExcelUtil.getCellData(1, 2));
		
		loginPage.getLoginButtonOnLoginPage().click();
		
     	nav = new NavigationPage(driver);
		nav.checkForPageTitel();
		String actual = nav.currentPageTitle;
		
		Assert.assertEquals(actual, "Buy online and sell with NZ's #1 auction & classifieds site | Trade Me");
		 
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
