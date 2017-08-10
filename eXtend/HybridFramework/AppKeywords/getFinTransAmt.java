package AppKeywords;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ActionUtilities.ManageDrivers;
import Keywords.SendText;
import Keywords.click;
import Keywords.getText;
import Keywords.openSession;

public class getFinTransAmt {
	
	
	public static void getFinTransAmount(String stepnumber,String origin,String OrderNo, String position,String FinTrans) throws InterruptedException, IOException
	{
		String amt = null;
		WebDriver driver= ManageDrivers.GetDriver();
		openSession.openTheSession("tfgld4510m000");
		int ss = GetSessionSeq.GetTabSeq();
		click.clickTheButton("tfgld4510m000-"+ss+"-button-std-edit.find");
		click.clickTheButton("tfgld4510m000-"+(ss+1)+"-tfgld418.tror-control-trigger-button");
	Thread.sleep(2000);
		click.clickTheButton("tfgld4510m000-"+(ss+1)+"-tfgld418.tror-control-trigger-button");
		List<WebElement> org = driver.findElements(By.xpath(".//*[@class='ListItem']"));
		for(WebElement a:org)
		{
			if(a.getText().equalsIgnoreCase(origin))
			{	a.click();
			     break;
			}
			
			
		}
			
		click.clickTheButton("tfgld4510m000-"+(ss+1)+"-tfgld418.orno-lookup-widget");
		SendText.SendTheText("tfgld4510m000-"+(ss+1)+"-tfgld418.orno-lookup-widget", OrderNo);
		
		driver.findElement(By.xpath(".//*[contains(@id,'tfgld418.orno-lookup-widget')]")).sendKeys(Keys.ENTER);
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[contains(@id,'tfgld418.pono-"+ss+"-filter-value')]")).sendKeys(position);
	 Thread.sleep(2000);
	 
	 
	 driver.findElement(By.xpath(".//*[contains(@id,'filter-value-control-widget-label')]")).click();
	 Thread.sleep(2000);
//	 driver.findElement(By.xpath(".//*[contains(@id,'filter-value-control-widget-label')]")).click();
//	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[text()='Issue']")).click();
	 
	 
			 
   String amount = driver.findElement(By.xpath("(.//*[contains(@id,'grid-1-form.amount')][contains(@id,'widget')])[1]")).getText();
   System.out.println(amount);
		
		
		click.clickTheButton("tfgld4510m000-"+ss+"-button-std-file.save_and_close");
        int row= getText.getnumber(stepnumber);
		
		ActionUtilities.ExcelWrite.WriteTheExcel(amount, row);
		
	}

}
