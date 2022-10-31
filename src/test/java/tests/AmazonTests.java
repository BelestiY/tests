package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resources.Base;
import pages.BrandPage;
import pages.HomePage;
import pages.SelectedTVPage;
import pages.SortedTVListPage;
import pages.SortingPage;


public class AmazonTests  extends Base {
	
	WebDriver driver;
	
	HomePage homePage;
	BrandPage brandPage;
	SortingPage sortingPage;
	SortedTVListPage sortedTVListPage;
	SelectedTVPage selectedTVPage;
	
	
	@BeforeClass()
	public void setup() throws IOException {		
		driver = initializeDriver();
		
		driver.get(prop.getProperty("baseUrl"));
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
		
	}
	
	@Test(priority=1)
	public void testHomePage() {
		homePage = new HomePage(driver);		
		homePage.selectHambergerMenu().click();
		homePage.selectTvApplianceElectronics().click();
		homePage.selectTelevisions().click();
		
	}
	
	@Test (priority=2)
	public void testBrandPage() {
		brandPage = new BrandPage(driver);
		brandPage.selectSamsungBrand().click();
		
	}
	
	@Test(priority=3)
	public void testSortingPage() throws InterruptedException {
		sortingPage = new SortingPage(driver);
		sortingPage.selectSortingMenu().click();
		sortingPage.selectHighToLowSortMenu().click();
	}
	
	@Test(priority=4)
	public void testSortedTVListPage() {
		sortedTVListPage = new SortedTVListPage(driver);
		sortedTVListPage.selectSecondHighestTV().click();
	}
	
	@Test(priority=5)
	public void testSelectedTVPage() {
		selectedTVPage = new SelectedTVPage(driver);
		selectedTVPage.switchWindow();
		
		boolean aboutThisItem = selectedTVPage.aboutThisItem();
		if(aboutThisItem = true) {
			Assert.assertTrue(aboutThisItem, "About This Item is Present");
			System.out.println("This test has passed");
		} else {
			Assert.assertTrue(aboutThisItem, "About This Item is Absent");
			System.out.println("This test has failed");
		}
		
		String text = selectedTVPage.aboutThisItemText().getText();
		System.out.println(text);
	}
	
	@AfterClass
	public void terminate() {
		terminateBrowser();
	}
	

}
