package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class KeyIn {
	
	public static void KeyInButton(String locator, String button)
	{
		WebDriver driver= ManageDrivers.GetDriver();
		switch(button)
		{
		
		case "TAB":
			driver.findElement(By.id(locator)).sendKeys(Keys.TAB);
			break;
			
		default:
	    	System.out.println("Invalid button");
		}
		
	}

}
