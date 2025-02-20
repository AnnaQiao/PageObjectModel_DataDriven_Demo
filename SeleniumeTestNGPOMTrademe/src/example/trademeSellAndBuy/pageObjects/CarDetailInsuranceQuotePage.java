package example.trademeSellAndBuy.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarDetailInsuranceQuotePage extends BasePage{
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	public CarDetailInsuranceQuotePage(WebDriver driver) {
		super(driver);
		
		// this initElements methods will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "plateno")
	WebElement carPlateNumber;

	@FindBy(css = ".btn.btn-md.btn-primary.btn-block-sm.numPlateSearch")
	WebElement searchButtom;

	@FindBy(css = "div[name='addressSearch']")
	WebElement addressCar;

	@FindBy(id = "dateofbirth_dd")
	WebElement driverBirthDD;

	@FindBy(id = "dateofbirth_mm")
	WebElement driverBirthMM;

	@FindBy(id = "dateofbirth_yyyy")
	WebElement driverBirthYY;

	@FindBy(css = "span.ng-invalid")
	WebElement genderMale;

	@FindBy(xpath = "//div[2]/label[2]/span")
	WebElement regularDriver;

	@FindBy(xpath = "//div[2]/div[2]/div[2]/label/span")
	WebElement thirdPartyCover;

	@FindBy(name = "coverAmount")
	WebElement carValue;

	@FindBy(css = "span.dynamicNext")
	WebElement estimateCarInsurance;

	// enter car plate number in textbox
	public void setCarPlateNumber(String strCarPlateNumber) {

		carPlateNumber.sendKeys(strCarPlateNumber);
	}

	// click search button
	public void clickSearchButton() {
		jse2.executeScript("arguments[0].scrollIntoView()", searchButtom); 
		Actions actions = new Actions(driver);
		actions.moveToElement(searchButtom).click().build().perform();
		//searchButtom.click();
	}

	// select car parks address
	public void selectCarAddress(String strCarAddress) {
		jse2.executeScript("arguments[0].scrollIntoView()", addressCar); 
		addressCar.clear();
		addressCar.sendKeys(strCarAddress);
	}

	// set the birth of car owner
	public void setDriverBirthDD(String strDriverBirthDD) {
		jse2.executeScript("arguments[0].scrollIntoView()", driverBirthDD); 
		driverBirthDD.sendKeys(strDriverBirthDD);
	}
	public void setDriverBirthMM(String strDriverBirthMM) {
		driverBirthMM.sendKeys(strDriverBirthMM);
	}
	public void setDriverBirthYY(String strDriverBirthYY) {
		driverBirthYY.sendKeys(strDriverBirthYY);
	}
	// select the gender of car owner
	public void selectMaleGender() {
		jse2.executeScript("arguments[0].scrollIntoView()", genderMale); 
		genderMale.click();
	}
	
	// select regular Driver is younger or not
	public void selectRegularDriver() {
		jse2.executeScript("arguments[0].scrollIntoView()", regularDriver); 
		regularDriver.click();
	}
	public void setThirdPartyCover() {
		jse2.executeScript("arguments[0].scrollIntoView()", thirdPartyCover); 
		thirdPartyCover.click();
	}
	//set the value of this car
	public void setCarValue(String strCarValue) {
		jse2.executeScript("arguments[0].scrollIntoView()", carValue); 
		carValue.clear();
		carValue.sendKeys(strCarValue);;
	}
	//get a quote of this car insurance
	public void getCarInsurancePrice() {
		jse2.executeScript("arguments[0].scrollIntoView()", estimateCarInsurance); 
		estimateCarInsurance.click();
	}
}
