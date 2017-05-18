package OpenMoreSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ActionUtilities.ManageDrivers;
import HomePage.HomePage;
import HomePage.ttaad4500Page;

public class OpenRunProgram {
	
	public static void OpenRunPro(String sessionid) throws InterruptedException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		HomePage more = PageFactory.initElements(driver, HomePage.class);
		more.More.click();
		more.options.click();
		more.RunProgram.click();
		System.out.println("0");
		Thread.sleep(5000);
		WebElement frame1 = driver.findElement(By.className("gwt-Frame"));
		int frame =1;
		driver.switchTo().frame(frame1);
		System.out.println("1");
		more.entersessionname.sendKeys(sessionid);
		System.out.println("2");
		more.runprogramOK.click();
		
	}
	
	public static void Openttaad4500(String Package, String Module,String table,String company) throws InterruptedException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		ttaad4500Page ttaad4500 = PageFactory.initElements(driver, ttaad4500Page.class);
		OpenRunPro("ttaad4500");
		ttaad4500.Package.sendKeys(Package);
		ttaad4500.module.sendKeys(Module);
		ttaad4500.company.sendKeys(company);
		ttaad4500.table.sendKeys(table);
		ttaad4500.table.submit();
		
	}
	

}
