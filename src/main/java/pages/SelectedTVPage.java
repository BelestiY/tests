package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectedTVPage {

	public WebDriver driver;
	
	By aboutThisItemSection = By.xpath("//div/h1[text()=' About this item ']");
	By aboutThisItemSectionText = By.cssSelector("div#feature-bullets ul.a-unordered-list");
	
	
	public SelectedTVPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void switchWindow() {
//		String parentWindow = driver.getWindowHandle();
		
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		
	}
	
	public boolean aboutThisItem() {
		return driver.findElement(aboutThisItemSection).isDisplayed();
	}
	
	public WebElement aboutThisItemText() {
		return driver.findElement(aboutThisItemSectionText);
	}
}
