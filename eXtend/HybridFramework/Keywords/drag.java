package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ActionUtilities.ManageDrivers;

public class drag {
	
	public static void dragit() throws InterruptedException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		Actions dragger = new Actions(driver);

		WebElement draggablePartOfScrollbar = driver.findElement(By.xpath(".//*[@class='gwt-SplitLayoutPanel-VDragger']"));

		// drag downwards

		int numberOfPixelsToDragTheScrollbarDown = -100;

//		for (int i=1 ; i<=1 ; i=i+numberOfPixelsToDragTheScrollbarDown) {
//		    try {
		        // this causes a gradual drag of the scroll bar, 10 units at a time
		        dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
		        Thread.sleep(1000L);
//		    } catch(Exception e1){}
//		} 
	}

}
