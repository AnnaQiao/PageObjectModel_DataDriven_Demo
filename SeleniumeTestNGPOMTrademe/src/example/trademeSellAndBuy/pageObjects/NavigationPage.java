package example.trademeSellAndBuy.pageObjects;

import org.openqa.selenium.WebDriver;

public class NavigationPage extends BasePage {
    public String currentPageTitle;
	public NavigationPage(WebDriver driver) {
		super(driver);
	}
   public NavigationPage checkForPageTitel() {
        currentPageTitle = driver.getTitle(); 
        System.out.println(currentPageTitle+"!!!!!!!");
		return new NavigationPage(driver);

	}
	public NavigationPage checkForNavigationList() {
        
		return new NavigationPage(driver);

	}
}
