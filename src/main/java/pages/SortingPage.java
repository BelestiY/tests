package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortingPage {

	public WebDriver driver;
	
	public By sortingMenu = By.xpath("//div/form//span[@class='a-button-inner']");
	public By highToLow = By.xpath("//ul/li/a[text()='Price: High to Low']");
	
	public SortingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement selectSortingMenu() throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(sortingMenu);
	}
	
	public WebElement selectHighToLowSortMenu() {
		return driver.findElement(highToLow);
	}
	
}
