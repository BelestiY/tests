package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortedTVListPage {

	public WebDriver driver;
	By secondHighestPriceTV = By.xpath("//span[@data-component-type='s-search-results']/div/div[3]");
	
	public SortedTVListPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement selectSecondHighestTV() {
		return driver.findElement(secondHighestPriceTV);
	}
}
