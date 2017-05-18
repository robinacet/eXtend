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
	
	
	public static void getFinTransAmount(String stepnumber,String origin,String OrderNo, String position,String FinTrans, String SesSeq) throws InterruptedException, IOException
	{
		String amt = null;
		WebDriver driver= ManageDrivers.GetDriver();
		openSession.openTheSession("tfgld4510m000");
		int ss = getText.getnumber(SesSeq);
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
		
		click.clickTheButton("tfgld4510m000-"+(ss+1)+"-button-std-file.save_and_close");
		SendText.SendTheText("tfgld4510m000-"+ss+"-grid-1-tfgld418.pono-7-filter-value", position);
		driver.findElement(By.id("tfgld4510m000-"+ss+"-grid-1-tfgld418.pono-7-filter-value")).sendKeys(Keys.TAB);
		List<WebElement> alldata = driver.findElements(By.xpath(".//*[contains(@id,'tfgld4510m000-"+ss+"-grid-1-')][contains(@id,'widget')]"));
		for(int i=0;i<=alldata.size();i++)
		{
			String data =alldata.get(i).getText();;
			if(!alldata.get(i).getText().equalsIgnoreCase(""))
			{
				
			if(position.contains(data))
					{
				     if(FinTrans.equalsIgnoreCase(alldata.get(i+1).getText()))
				     {
				    	amt= alldata.get(i+8).getText();
				    	System.out.println(amt);
				    	break;
				     }
				
					}
			}
	
		}
		
		
		click.clickTheButton("tfgld4510m000-"+ss+"-button-std-file.save_and_close");
        int row= getText.getnumber(stepnumber);
		
		ActionUtilities.ExcelWrite.WriteTheExcel(amt, row);
		
	}

}
