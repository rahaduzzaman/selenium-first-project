package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
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
			
			// Operate on Google search box
			driver.findElement(By.xpath(searchBox_Xpath)).clear();
			driver.findElement(By.xpath(searchBox_Xpath)).click();
			driver.findElement(By.xpath(searchBox_Xpath)).sendKeys("Search Flight");
			
			Thread.sleep(2000); //static wait


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
