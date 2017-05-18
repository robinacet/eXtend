package HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//Author: Robin Gajbhiye, Date:04June2016
//Robin
public class HomePage {
	
	
	//--------------------------------------PARTS MANAGEMENT----------------------------------------------------------//

	@FindBy(how=How.ID,using="appnav-item-mtdext00000020")
	public WebElement PartsManagement;
	
	@FindBy(how=How.ID,using="appnav-item-mtdext00000020-menu-mtdext00000033-Sales-Control")
	public WebElement SalesControl;
	
	@FindBy(how=How.ID,using="appnav-item-mtdext00000020-menu-mtdext00000033-Sales-Control-mtdext00000022-Sales-Orders")
	public WebElement SalesOrders;
	
	@FindBy(how=How.ID,using="appnav-item-mtdext00000020-menu-mtdext00000033-Sales-Control-mtdext00000022-Sales-Orders-tdsls4500m002")
	public WebElement PartsSaleOrders;
	
	@FindBy(how=How.ID,using="appnav-item-mtdext00000020-menu-mtdext00000034-Purchase-Control-label")
	public WebElement PurchaseControl;
	
	@FindBy(how=How.ID,using="appnav-item-mtdext00000020-menu-mtdext00000034-Purchase-Control-mtdext00000026-Parts-Purchase")
	public WebElement PartsPurchase;
	
	@FindBy(how=How.ID,using="appnav-item-mtdext00000020-menu-mtdext00000034-Purchase-Control-mtdext00000026-Parts-Purchase-mtdext00000032-Purchase-Order-label")
	public WebElement PartPurchaseOrder;
	
	@FindBy(how=How.ID,using="appnav-item-mtdext00000020-menu-mtdext00000034-Purchase-Control-mtdext00000026-Parts-Purchase-mtdext00000032-Purchase-Order-tdpur4503m000")
	public WebElement EasyPurchaseOrder;
	
	//---------------------------------------MORE --------------------------------------------------------------------//
	
	@FindBy(how=How.ID,using="-overflow")
	public WebElement More;
	
	@FindBy(how=How.XPATH,using=".//*[@id='-overflowmenu-options-Options']/td[2]")
	public WebElement options;
	
	@FindBy(how=How.XPATH,using=".//*[@id='-overflowmenu-options-Options-run_program']/td[2]")
	public WebElement RunProgram;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='dlg-run_program-input-widget']")
	public WebElement entersessionname;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='dlg-run_program-button-0']")
	public WebElement runprogramOK;
	
	
	//------------------------------------------------Finance------------------------------------------------------------------//
	@FindBy(how=How.ID,using="appnav-item-mtfext000")
	public WebElement Financeandacc;
	
	@FindBy(how=How.ID,using="appnav-item-mtfext000-menu-mtfextacp000-Accounts-Payable-label")
	public WebElement AccountPayable;
	
	@FindBy(how=How.ID,using="appnav-item-mtfext000-menu-mtfextacp000-Accounts-Payable-mtfextacp006-General-PO")
	public WebElement GeneralPO;
	
	@FindBy(how=How.ID,using="appnav-item-mtfext000-menu-mtfextacp000-Accounts-Payable-mtfextacp006-General-PO-tdext4500m000")
	public WebElement GeneralPurchaseOrder;
	
	@FindBy(how=How.ID,using="appnav-item-mtfext000-menu-mtfextint000-Integration-with-Other-Modules-label")
	public WebElement IntegrationWithOtherModules;
	
	@FindBy(how=How.ID,using="appnav-item-mtfext000-menu-mtfextint000-Integration-with-Other-Modules-mtfextint002-Integration-Inquiries-&-Reports-label")
	public WebElement IntegrationInquiriesNReports ;
	
	@FindBy(how=How.ID,using="appnav-item-mtfext000-menu-mtfextint000-Integration-with-Other-Modules-mtfextint002-Integration-Inquiries-&-Reports-tfgld4510m000-label")
	public WebElement IntergrationTransaction ;
}
