package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class SendText {
	
	public static void SendTheText(String locator,String TestData1) throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriver driver= ManageDrivers.GetDriver();
		driver.findElement(By.id(locator)).sendKeys(TestData1);
		System.out.println("Text has been entered");
		Thread.sleep(2000);
	}

}
