package Keywords;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ActionUtilities.ManageDrivers;
import AppKeywords.GetSessionSeq;

public class getMauc {
	
	public static void gettheMAUC(String stepNumber, String Part, String warehouse, String sessionSeq) throws InterruptedException, IOException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		openSession.openTheSession("whina1512m000");
		int sesSeq = GetSessionSeq.GetTabSeq();
		String session = "whina1512m000-";
		String find = session+sesSeq+"-button-std-edit.find";
		String part1 = session+(sesSeq+1)+"-whinr112.item.segment.2-lookup-widget";
		String warehouse1 = session+(sesSeq+1)+"-whinr112.cwar-lookup-widget";
		String okbutton = session+(sesSeq+1)+"-button-std-file.save_and_close";
		String scrollToLast = session+sesSeq+"-grid-1-scroll-last";
		String action = session+sesSeq+"-button-std:action";
		String maucsession = session+sesSeq+"-menu-std:action-form-exec.user.2-label";
		
		
		
		click.clickTheButton(find);
		click.clickTheButton(part1);
		SendText.SendTheText(part1, Part);
		
		click.clickTheButton(warehouse1);
		SendText.SendTheText(warehouse1, warehouse);
		
		click.clickTheButton(okbutton);
		click.clickTheButton(scrollToLast);
		List<WebElement> avc =driver.findElements(By.xpath(".//*[contains(@id,'whina1512m000-"+sesSeq+"-grid-1-select')]"));
		System.out.println(avc.size());
		avc.get(avc.size()-1).click();
		click.clickTheButton(action);
		click.clickTheButton(maucsession);
		List<WebElement> maucs = driver.findElements(By.xpath(".//*[contains(@id,'whina1513m000-"+(sesSeq+2)+"-grid-1-whinr113.cpcp-9-')][contains(@id,'widget')]"));
		int index =0;
		String mauc ="";
		for(WebElement e:maucs)
		{
			String a=e.getText();
			if(a.equalsIgnoreCase("MAT000"))
				 mauc =driver.findElement(By.id("whina1513m000-"+(sesSeq+2)+"-grid-1-whinr113.mauc-12-"+index+"-widget")).getText();
			else
				index++;
				
				
		}
		
		
		
		
		
		int row= getText.getnumber(stepNumber);
		System.out.println("MAUC for parts"+Part+" is "+mauc);
		ActionUtilities.ExcelWrite.WriteTheExcel(mauc, row);
		
		
		
		
		
		
	}
	

}
