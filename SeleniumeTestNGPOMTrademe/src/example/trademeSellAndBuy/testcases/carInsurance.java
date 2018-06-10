package example.trademeSellAndBuy.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class carInsurance {
	WebDriver driver;
	@Test
	public void setUp() throws InterruptedException {
		driver.findElement(By.cssSelector("a.button.yellow")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("plateno")).sendKeys("JTT948");
		
		WebElement searchButtom = driver.findElement(By.cssSelector(".btn.btn-md.btn-primary.btn-block-sm.numPlateSearch"));
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", searchButtom); 
		Actions actions = new Actions(driver);
		actions.moveToElement(searchButtom).click().build().perform();
		Thread.sleep(5000);
		WebElement addressCar = driver.findElement(By.cssSelector("div[name='addressSearch']"));
		jse2.executeScript("arguments[0].scrollIntoView()", addressCar); 
		addressCar.clear();
		addressCar.sendKeys("Flat 1, 38 Latham Avenue, Pakuranga, Auckland 2010");
		WebElement birth = driver.findElement(By.id("dateofbirth_dd"));
		jse2.executeScript("arguments[0].scrollIntoView()", birth); 
		birth.sendKeys("10");
		WebElement month = driver.findElement(By.id("dateofbirth_mm"));
		month.sendKeys("07");
		WebElement year =  driver.findElement(By.id("dateofbirth_yyyy"));
        year.sendKeys("1985");
        
        driver.findElement(By.cssSelector ("span.ng-invalid")).click();
        
        WebElement regularDriver = driver.findElement(By.xpath ("//div[2]/label[2]/span"));
        jse2.executeScript("arguments[0].scrollIntoView()", regularDriver); 
        regularDriver.click();
        		
        WebElement thirdPartyCover = driver.findElement(By.xpath ("//div[2]/div[2]/div[2]/label/span"));
        jse2.executeScript("arguments[0].scrollIntoView()", thirdPartyCover); 
        thirdPartyCover.click();
        WebElement carValue = driver.findElement(By.name("coverAmount"));
        carValue.clear();
        carValue.sendKeys("5200");
        WebElement estimateCarInsurance = driver.findElement(By.cssSelector("span.dynamicNext"));
        jse2.executeScript("arguments[0].scrollIntoView()", estimateCarInsurance); 
        estimateCarInsurance.click();
      
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.firefox.marionette", "C:/geckodriver.exe");
		driver = new FirefoxDriver();
		 driver.navigate().to("https://www.trademeinsurance.co.nz/?utm_source=holidayhouses&utm_medium=navbar&utm_campaign=navbar");
	}
	

	@AfterTest
	public void tearDown() {
		//driver.close();
	}

}
