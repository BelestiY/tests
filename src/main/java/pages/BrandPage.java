package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrandPage {

	public WebDriver driver;
	
	By samsungBrand = By.xpath("//li/span/a//span[text()='Samsung']");
	
	public BrandPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement selectSamsungBrand() {
		return driver.findElement(samsungBrand);
	}
	
	
}
