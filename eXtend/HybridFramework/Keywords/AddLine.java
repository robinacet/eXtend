package Keywords;

import org.openqa.selenium.WebDriver;
import ActionUtilities.ManageDrivers;

public class AddLine {
	
	
	public static void AddTheLine(String TestData1, String TestData2, String TestData3) throws InterruptedException
	{
		int pos = getText.getnumber(TestData1)-1;
	
		WebDriver driver= ManageDrivers.GetDriver();
		
		click.clickTheButton("tdtre4101s002-2-button-std-file.new");
		
		String partname ="tdtre4101s002-2-grid-1-tdsls401.item.segment.2-82-"+pos +"-widget";
		String qty ="tdtre4101s002-2-grid-1-tdsls401.oqua-93-"+pos +"-widget";
		
		System.out.println(partname);
		//click.clickTheButton(partname);
		//click.clickTheButton(partname);
		
	
		SendText.SendTheText(partname, TestData2);
		
		
		click.clickTheButton(qty);
		
		
		SendText.SendTheText(qty, TestData3);
	
	
		click.clickTheButton("tdtre4101m002-1-button-std-file.save");
		
		
		System.out.println("Entered Line "+TestData1+TestData2);
		
		
		
		
		
		
		
		
		
	}

}
