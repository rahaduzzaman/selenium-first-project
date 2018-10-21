package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.Signin;

public class PageSignOn {
	
	public void signin(WebDriver driver) {
		driver.findElement(By.xpath(Signin.link_signin)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Signin.textBox_userName)).sendKeys("Rahad");
		driver.findElement(By.xpath(Signin.textBox_password)).sendKeys("password123");
		driver.findElement(By.xpath(Signin.button_signin)).click();
		
	}
}
