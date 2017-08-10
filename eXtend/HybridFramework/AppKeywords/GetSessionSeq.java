package AppKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class GetSessionSeq {
	
	public static int GetTabSeq() throws InterruptedException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		Thread.sleep(2000);
		String tab =driver.findElement(By.xpath(".//*[contains(@class,'Tab Selected')]")).getAttribute("id");
		System.out.println(tab);
		char tabseq =tab.charAt(tab.length()-1);
		int a = Character.getNumericValue(tabseq);
	
		return a;
	}

}
