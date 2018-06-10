package example.trademeSellAndBuy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceHomePage extends BasePage {

	public InsuranceHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(driver, this);
		
	}
	 @FindBy(css="a.button.yellow")
	 
        WebElement carInsurance;
//	 
//	 @FindBy(xpath="(//a[contains(text(),'House')])[4]")
//
//	    WebElement houseInsurance1;
//	 
//	 @FindBy(linkText="Contents")
//
//	    WebElement contentsInsurance;
	 
	 public void selectCarInsuranceQuote() {
		 carInsurance.click();
	 }
}
