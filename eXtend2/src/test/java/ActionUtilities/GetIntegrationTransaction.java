package ActionUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import OpenFinanceSession.OpenFinanceSession;

public class GetIntegrationTransaction {
	WebDriver driver;
	
	
	public String GetIntTransForPO(String po) throws Exception
	{
		
//		driver.close();
		
		OpenFinanceSession.openIntegrationTransactions();
		driver = ActionUtilities.ManageDrivers.GetDriver();
		FinancePages.IntegrationTransaction IntTran = PageFactory.initElements(driver, FinancePages.IntegrationTransaction.class);
		System.out.println("1");
				
		
		IntTran.search.click();
//		String searchwin = driver.getWindowHandle();
//		IntTran.search_TranOri.click();
//		System.out.println("1");
//		Thread.sleep(5000);
//		IntTran.Search_PartsPurchase.click();
//		System.out.println("1");
//		Thread.sleep(5000);
//		driver.switchTo().window(searchwin);
//        IntTran.search_TranPonumber.click();
//        System.out.println("1");
//        IntTran.Search_PartsPurchase.clear();
		IntTran.search_TranPonumber.click();
        IntTran.search_TranPonumber.sendKeys(po);
		Thread.sleep(2000);
		
		IntTran.search_ok.click();
		System.out.println("Amount in Int transactions is "+IntTran.amount.getText());
		return IntTran.amount.getText();
		
	}

}
