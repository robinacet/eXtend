package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class click {
	
	public static void clickTheButton(String locator) throws InterruptedException
	{
		Thread.sleep(2000);
		WebDriver driver= ManageDrivers.GetDriver();
		driver.findElement(By.id(locator)).click();
		System.out.println("Button has been clicked");
		Thread.sleep(2000);
	}

}
