package FinancePages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import ActionUtilities.ManageDrivers;
import AppKeywords.getFinTransAmt;
import Keywords.SendText;
import Keywords.click;
import Keywords.getMauc;
import Keywords.getText;
import Keywords.openSession;

public class tp {

	
	

	@Test
	
	public static void CheckTheExecutionModex() throws Exception
	{
		WebDriver driver= ManageDrivers.GetDriver();
		ManageDrivers.OpenUrl("Chrome", "proxima-ln4.e-emphasys.com:8441/webui/servlet/login", "rgajbhiye", "Robin$123");
		//getFinTransAmt.getFinTransAmount("Parts (Sales)", "PS0049227", "20.00", "issue","0.00");
		
		
	}
		  
		
	
	
	
}
