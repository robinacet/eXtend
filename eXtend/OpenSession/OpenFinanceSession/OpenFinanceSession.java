package OpenFinanceSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OpenFinanceSession {
	
	static WebDriver driver;
	public static void openGPO()
	{
		 driver = ActionUtilities.ManageDrivers.GetDriver();
		HomePage.HomePage home = PageFactory.initElements(driver, HomePage.HomePage.class);
		FinancePages.GPOMultiOcc gpomulti = PageFactory.initElements(driver, FinancePages.GPOMultiOcc.class);
		
		home.Financeandacc.click();
		home.AccountPayable.click();
		home.GeneralPO.click();
		home.GeneralPurchaseOrder.click();
		gpomulti.newGPO.click();
		System.out.println("GPO session Opened successfully");
		
	}

	public static void openIntegrationTransactions() throws Exception
	{
		
		driver = ActionUtilities.ManageDrivers.GetDriver();
		HomePage.HomePage home1 = PageFactory.initElements(driver, HomePage.HomePage.class);
		
		
		home1.Financeandacc.click();
		home1.IntegrationWithOtherModules.click();
		home1.IntegrationInquiriesNReports.click();
		home1.IntergrationTransaction.click();
		
	}

}
