package Keywords;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import ActionUtilities.ExcelRead;
import HomePage.HomePage;



public class Test {
public static void main(String[] args) throws Exception {
		
//		System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
//	     ChromeOptions cOptions = new ChromeOptions();
//
//	    cOptions.addArguments("disable-infobars");
//
//	  WebDriver  driver = new ChromeDriver(cOptions);
//	  
//	  
//	  driver.get("https://proxima-ln4.e-emphasys.com:8441/webui/servlet/login");
//	 // driver.manage().window().maximize();
//	  Runtime.getRuntime().exec(".//LogineXtend1.exe");
////	  driver.manage().window().setPosition(new Point(-2000, 0));
//	  Thread.sleep(5000);
//	  driver.manage().window().maximize();
//	  
//	  System.out.println("done"); 
//	  Thread.sleep(5000);
//	 //Open session-------------------------------
//		HomePage more = PageFactory.initElements(driver, HomePage.class);
//		more.More.click();
//		more.options.click();
//		more.RunProgram.click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("dlg-run_program-input-widget")).sendKeys("tfgld4510m000");
//		Thread.sleep(2000);
//		more.runprogramOK.click();
//		Thread.sleep(2000);
//		String tab =driver.findElement(By.xpath(".//*[contains(@class,'Tab Selected')]")).getAttribute("id");
//		System.out.println(tab);
//		char tabseq =tab.charAt(tab.length()-1);
//		int a = Character.getNumericValue(tabseq);
//		System.out.println(tabseq+"----"+a);
//		
//		
////		//------------------------------------------------------
////		Thread.sleep(2000);
////	  driver.findElement(By.xpath(".//*[contains(@id,'button-std-edit.find')]")).click();
////	  Thread.sleep(2000);
////	  driver.findElement(By.xpath(".//*[contains(@id,'tfgld418.tror-control-widget')]")).click();
////	  Thread.sleep(2000);
////	  driver.findElement(By.xpath(".//*[contains(@id,'tfgld418.tror-control-widget')]")).click();
////	  Thread.sleep(2000);
////	  List<WebElement> org = driver.findElements(By.xpath(".//*[@class='ListItem']"));
////		for(WebElement a:org)
////		{
////			if(a.getText().equalsIgnoreCase("Parts (Sales)"))
////			{	a.click();
////			     break;
////			}
////			
////		}
////		
////	  
////		driver.findElement(By.xpath(".//*[contains(@id,'tfgld418.orno-lookup-widget')]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath(".//*[contains(@id,'tfgld418.orno-lookup-widget')]")).sendKeys("PS0049369");
////		 Thread.sleep(2000);
////		 
////		 driver.findElement(By.xpath(".//*[contains(@id,'tfgld418.orno-lookup-widget')]")).sendKeys(Keys.ENTER);
////		 
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath(".//*[contains(@id,'tfgld418.pono-7-filter-value')]")).sendKeys("10");
////		 Thread.sleep(2000);
////		 
////		 
////		 driver.findElement(By.xpath(".//*[contains(@id,'filter-value-control-widget-label')]")).click();
////		 Thread.sleep(2000);
//////		 driver.findElement(By.xpath(".//*[contains(@id,'filter-value-control-widget-label')]")).click();
//////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath(".//*[text()='Issue']")).click();
////		 
////		 
////				 
////	    String amt = driver.findElement(By.xpath("(.//*[contains(@id,'grid-1-form.amount')][contains(@id,'widget')])[1]")).getText();
////	    System.out.println(amt);
//	
		
	    Object[][] object = ExcelRead.StepsFeed();
	    
	    for (int i = 0; i < 10; i++) 
     	{
    		//Loop over all the rows
    		
    		//Create a loop to print cell values in a row
    		for (int j = 0; j < 10; j++) 
    		{
    			//Print excel data in console
    			System.out.println(object[i][j].toString());
    			
    		}
		

     	}
		
	}

}
