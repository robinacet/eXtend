package Keywords;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ActionUtilities.ManageDrivers;

public class getText {
	
	public static void getTheText(String Locator,String stepNumber) throws IOException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		String text = driver.findElement(By.id(Locator)).getAttribute("value");
		System.out.println("Your Data is "+text);
		int row= getnumber(stepNumber);
		
		ActionUtilities.ExcelWrite.WriteTheExcel(text, row);
	}
	
	public static int getnumber(String Stepnumber)
	{
	
	char[] y =Stepnumber.toCharArray();
	 
	 String x ="";
	  
	  for(int i=0;i<y.length;i++)
	  {
		  if(y[i]!='.')
		  
			  x=x+y[i];
			  
		  else break;
		  
			    
	  }
	 
	  
	  
	  int b =Integer.parseInt(x);
	  
	return b;
	}

	
}
