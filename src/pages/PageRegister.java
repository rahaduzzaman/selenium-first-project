package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.*;


public class PageRegister {
	String expectedNote="",actualVal="";
	String expectedUserName ="Rahad";
	
	public void registration(WebDriver driver) throws Exception {
		
		// Click register link
		driver.findElement(By.xpath(Registration.button_link)).click();
		
		// Contact Information
		driver.findElement(By.xpath(Registration.textbox_firstName)).sendKeys("Md");
		driver.findElement(By.xpath(Registration.textbox_lastName)).sendKeys("Rahaduzzaman");
		driver.findElement(By.xpath(Registration.textbox_phone)).sendKeys("6325529808");
		driver.findElement(By.xpath(Registration.textbox_email)).sendKeys("user@domain.com");
		
		// Mailing Information
		driver.findElement(By.xpath(Registration.textbox_address1)).sendKeys("175-20, 89 ave");
		driver.findElement(By.xpath(Registration.textbox_address2)).sendKeys("2nd Fl");
		driver.findElement(By.xpath(Registration.textbox_city)).sendKeys("Jamaica");
		driver.findElement(By.xpath(Registration.textbox_state)).sendKeys("New York");
		driver.findElement(By.xpath(Registration.textbox_postalCode)).sendKeys("11432");
		
//		//Select dropdown value
		WebElement ele = driver.findElement(By.xpath(Registration.selectbox_country));
		Select sel = new Select(ele);
		sel.selectByVisibleText("UNITED STATES");
		
		//User Information
		WebElement el = driver.findElement(By.xpath(Registration.textbox_userName));
		el.sendKeys(expectedUserName);
		driver.findElement(By.xpath(Registration.textbox_password)).sendKeys("pasword123");
		driver.findElement(By.xpath(Registration.textbox_confirmPassword)).sendKeys("pasword123");
		driver.findElement(By.xpath(Registration.button_submit)).click();
		//Synchronization
//		Thread.sleep(5000);//Static wait
//		driver.manage().wait(5000);//Static wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //implicit wait
//		WebDriverWait webwait = new WebDriverWait(driver, 10); // Explicit Wait/Dynamic Wait (Waits for a particular element for a conditions) 
//		webwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'firstName')]")));
		
		//Confirmation
		String expectedNote = "Note: Your user name is Rahad.";

		String actualNote = driver.findElement(By.xpath(Registration.text_Note)).getText();
		String actualUserName = actualNote.substring(24, 29);
		
		System.out.println("=========================================================");
		
		System.out.println("Actual Note: "+ actualNote);
		System.out.println("Actual UserName: "+ actualUserName);

		
		//Note Validation
		if(expectedNote.equals(actualNote))
			System.out.println("PASS - "+"The Note : "+ actualNote +" Matched");
		else
			System.out.println("FAIL - Not Matching \n"+ "Expected Note: "+expectedNote + "\n Actual Note: "+actualNote);

		System.out.println("=========================================================");
		
		//UserName validation
		if(expectedUserName.equals(actualUserName))
			System.out.println("PASS - "+"The expected Username : \n"+ expectedUserName +" is matching!");
		else
			System.out.println("FAIL - Not Matching \n"+ "Expected Username: "+expectedUserName +"\n Actual Username: "+actualUserName);

		
	}
}
