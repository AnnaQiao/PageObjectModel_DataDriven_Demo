package example.trademeSellAndBuy.testcases;

import org.testng.annotations.Test;

import example.trademeSellAndBuy.pageObjects.CarDetailInsuranceQuotePage;
import example.trademeSellAndBuy.pageObjects.InsuranceHomePage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GotInsuranceQuote {
	WebDriver driver;
	InsuranceHomePage insuranceHomepage;
	CarDetailInsuranceQuotePage carInsuranceQuote;
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.firefox.marionette", "C:/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.navigate().to("https://www.trademeinsurance.co.nz/?utm_source=holidayhouses&utm_medium=navbar&utm_campaign=navbar");
	  insuranceHomepage = new InsuranceHomePage(driver);
	  carInsuranceQuote = new CarDetailInsuranceQuotePage(driver);
	  
  }
  @Test
  public void getCarInsuranceQuote() throws InterruptedException {
	  // car insurance quote;
	  insuranceHomepage.selectCarInsuranceQuote();
	  //search car registration number
	  carInsuranceQuote.setCarPlateNumber("JTT948");
	  
	  carInsuranceQuote.clickSearchButton();
	  Thread.sleep(5000);
	  //input where is the vehicle usually kept when it is not on the move
	  carInsuranceQuote.selectCarAddress("Flat 1, 38 Latham Avenue, Pakuranga, Auckland 2010");
	  //the date of main driver'birth of vehicle
	  carInsuranceQuote.setDriverBirthDD("23");
	  // the month of main driver'birth of vehicle
	  carInsuranceQuote.setDriverBirthMM("10");
	  // the year of main driver'birth of vehicle
	  carInsuranceQuote.setDriverBirthYY("1985");
	  //the main driver is male
	  carInsuranceQuote.selectMaleGender();
	  //select the main driver is younger or not
	  carInsuranceQuote.selectRegularDriver();
	  //select your cover,we will chose Third Party Cover.
	  carInsuranceQuote.setThirdPartyCover();
	  //confirm the value of your car
	  carInsuranceQuote.setCarValue("6000");
	  //get your estimate of car insurance
	  carInsuranceQuote.getCarInsurancePrice();
	  
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
