package example.trademeSellAndBuy.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNGClass {
	//WebDriver driver = new FirefoxDriver();
    WebDriver driver;
	@BeforeTest
	public void  launchapp() throws MalformedURLException
	{
//		URL url = new URL("http://localhost:4444/wd/hub/");
//		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
//		Capabilities capabilities = DesiredCapabilities.firefox();
//		//capabilities.setProperty("webdriver.firefox.marionette", "C:/geckodriver.exe");
//		driver = new RemoteWebDriver(url,capabilities);
//		
//		URL url = new URL("http://localhost:4444");
//		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
//		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//        capabilities.setCapability("networkConnectionEnabled", true);
//        capabilities.setCapability("browserConnectionEnabled", true);
//		this.driver = new RemoteWebDriver(url, capabilities);
//		//this.driver = new FirefoxDriver(capabilities);
//		
//		driver.navigate().to("https://www.aainsurance.co.nz/car-insurance.html");
		System.out.println("okokok......");
	}
  @Test
  public void getAQuote() {
	  System.out.println("get a quote from AA Insurance");  
	  }
  @AfterTest
  public void terminatetest()
  {
	  driver.close();
  }
}