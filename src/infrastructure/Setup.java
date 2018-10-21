package infrastructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

	public WebDriver appLauncher(String url) {
		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");

			 driver = new ChromeDriver();
			
			driver.get(url);
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
}
