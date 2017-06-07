package Keywords;

import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class closeBrowser {
	
	public static void closeTheBrowser()
	{
		WebDriver driver= ManageDrivers.GetDriver();
		System.out.println("Closing The Brower");
		driver.quit();
		
	}

}
