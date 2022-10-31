package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By hambergerMenu = By.id("nav-hamburger-menu");
	public By tvApplianceElectronics = By.xpath("//li/a/div[text()='TV, Appliances, Electronics']");
	By televisions = By.xpath("//li/a[text()='Televisions']");
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public  WebElement selectHambergerMenu() {
		return driver.findElement(hambergerMenu);
	}
	
	public WebElement selectTvApplianceElectronics() {
		return driver.findElement(tvApplianceElectronics);
	}
	
	public WebElement selectTelevisions() {
		return driver.findElement(televisions);
	}
	
	public void switchWindow() {
//		String parentWindow = driver.getWindowHandle();
		
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		
	}
	

}

