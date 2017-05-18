package TestCases_GPO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Author: Robin Gajbhiye, date: 08 june 2016
@Listeners(ActionUtilities.ActionListeners.class)

public class CreateManualGPO {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void openGPO() throws Exception
	{
//Open application and navigate to GPO
	//	Utilities.ManageDrivers.OpenUrl("Chrome");
		OpenFinanceSession.OpenFinanceSession.openGPO();
	}
	

	
	@Test
	/* Steps:
	 * 1. Create GPO Header
	 * 2. Add a Cost Part
	 * 3. Receive Cost Part and Verify Received qty
	 * 4. open integration Transaction session, Verify General Cost(PUR) 
	 */
	public void createManGPO() throws Exception
	{
//setup
		driver= ActionUtilities.ManageDrivers.GetDriver();
		FinancePages.GPOHeader GPOheader = PageFactory.initElements(driver, FinancePages.GPOHeader.class);
		FinancePages.GPOLines GPOlines = PageFactory.initElements(driver, FinancePages.GPOLines.class);
		FinancePages.GPOReciept GPOreceipt = PageFactory.initElements(driver, FinancePages.GPOReciept.class);
		
//Create GPO Header
		GPOheader.BuyFromBPzoom.click();
		Thread.sleep(2000);
		GPOheader.FirstBPinList.click();
		GPOheader.okbuttoninbp.click();
		GPOheader.BuyFromBP.sendKeys(Keys.TAB);
		GPOheader.saveGPO.click();
		Thread.sleep(2000);
		String gponumber=GPOheader.GPONumber.getAttribute("value");
		System.out.println("GPO Created successfully: "+GPOheader.GPONumber.getAttribute("value"));
		GPOheader.Actions.click();
		GPOheader.OpenGPOLines.click();
		
//Create GPO Lines
		GPOlines.newGPOLine.click();
		Thread.sleep(2000);
//		GPOlines.itemZoom.click();
//		Thread.sleep(2000);
//		GPOlines.SelectFirstItem.click();
//		Thread.sleep(2000);
//		GPOlines.okselectitem.click();
		GPOlines.item.sendKeys("COST");
		GPOlines.item.sendKeys(Keys.TAB);
		GPOlines.suffix.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		GPOlines.ImportDoc.sendKeys("SDCASDDC");
		
		GPOlines.quantity.click();	
		//GPOlines.quantity.sendKeys("1");
		Thread.sleep(2000);
		GPOlines.quantity.sendKeys(Keys.TAB);	
		GPOlines.saveline.click();		
		GPOlines.saveNcloselineSingleocc.click();
		System.out.println("Item Sucessfully Added");
		
		
 // Recieve the Cost Part
		Thread.sleep(2000);
		GPOlines.SelectLine.click();
		GPOlines.Action.click();
		GPOlines.FullReceive.click();
		
		GPOreceipt.EnterDevice.sendKeys("D");
		GPOreceipt.DeviceWinContinue.click();
		GPOreceipt.DeviceMsgOK.click();
		Thread.sleep(2000);
		System.out.println("Receipt Number is: "+GPOreceipt.ReceiptNumber.getText());
		String amt =GPOlines.ReceivedAmount.getText();
		ActionUtilities.TakeScreenshot.TakeScrSht(gponumber);
//		System.out.println("Amount to be received is "+amt);
		GPOreceipt.OpenRecieptSingleOcc.click();
		System.out.println(GPOreceipt.ReceivedQty.getText());
		Assert.assertEquals(GPOreceipt.ReceivedQty.getText(), "1.0000");
		
		
		
		
//Check intergration transactions
		
		ActionUtilities.GetIntegrationTransaction a = new ActionUtilities.GetIntegrationTransaction();
		String actualamt =a.GetIntTransForPO(gponumber);
		Assert.assertEquals(actualamt, amt);
		System.out.println("Test case Passed, Correct General Cost(PUR) updated in Integration transactions");
		Thread.sleep(2000);
		ActionUtilities.TakeScreenshot.TakeScrSht(gponumber+"-1");
	}
	
@AfterMethod()
	
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(5000);
//       driver.quit();
		
	}
	
	
	
}
