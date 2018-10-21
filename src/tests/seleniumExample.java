package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Configure Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		try {

			//			Open url in chrome browser
			driver.get("https://www.google.com/");
			
			//x-path for search textbox
			String searchBox_Xpath = "//input[contains(@title, 'Search')]";
			String searchTerm = "Flight Booking";
			String searchButton_Xpath = "//input[contains(@value, 'Google Search')]";
			
			// Operate on Google search box
			driver.findElement(By.xpath(searchBox_Xpath)).clear();
			driver.findElement(By.xpath(searchBox_Xpath)).click();
			driver.findElement(By.xpath(searchBox_Xpath)).sendKeys(searchTerm);
			
			// Search button X_path
			driver.findElement(By.xpath(searchButton_Xpath)).click();
			
			// Capture the Page tile 
			String actualPageTitle = driver.getTitle(); 
			System.out.println("Title of the page is: " +  actualPageTitle);

			Thread.sleep(1000); //static wait
			
			String expectedPageTitle = searchTerm + " - Google Search";

			if (expectedPageTitle.equals(actualPageTitle)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAILED - Page title is not correct. The actual page title is - "+ actualPageTitle);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}

		finally {
			driver.close();
			//			driver.quit();
		}
	}

}
