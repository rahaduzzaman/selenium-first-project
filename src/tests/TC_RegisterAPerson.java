package tests;

import org.openqa.selenium.WebDriver;

import infrastructure.Setup;
import pages.PageRegister;
import pages.PageSignOn;

public class TC_RegisterAPerson {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			Setup setup = new Setup();
			String url = "http://www.newtours.demoaut.com/";
			
			//Setup the WebDriver
			 driver = setup.appLauncher(url);
			
			//Registration
			PageRegister register = new PageRegister();
			register.registration(driver);
			
			//SignIn
			/*PageSignOn signin = new PageSignOn();
			signin.signin(driver);
			*/
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
	//		driver.close();
		}

	}

}
