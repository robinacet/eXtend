package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ActionUtilities.ManageDrivers;
import HomePage.HomePage;

public class openSession {
	
	public static void openTheSession(String sessionID) throws InterruptedException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		HomePage more = PageFactory.initElements(driver, HomePage.class);
		more.More.click();
		more.options.click();
		more.RunProgram.click();
		Thread.sleep(2000);
		driver.findElement(By.id("dlg-run_program-input-widget")).sendKeys(sessionID);
		Thread.sleep(2000);
		more.runprogramOK.click();
		System.out.println("Session "+sessionID +" has been opened");
	}

}
