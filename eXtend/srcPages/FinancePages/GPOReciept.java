package FinancePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GPOReciept {

	@FindBy(how=How.ID,using="ttstpsplopen-6-devc-1-lookup-widget")
	
	public WebElement EnterDevice;
	
	@FindBy(how=How.ID,using="ttstpsplopen-6-button-form-exec.cont.process")
	public WebElement DeviceWinContinue;
	
	@FindBy(how=How.ID,using="dlg-tdpur4501m300-5-input-button-0")
	public WebElement DeviceMsgOK;
	
	
	@FindBy(how=How.ID,using="tdpur4501m300-5-grid-1-tdpur401.rcno-15-0-widget")
	public WebElement ReceiptNumber;
	
	@FindBy(how=How.ID,using="tdpur4501m300-5-grid-1-drilldown-0")
	public WebElement OpenRecieptSingleOcc;
	
	@FindBy(how=How.ID,using="tdpur4101s300-8-form.tot.qty-10")
	public WebElement ReceivedQty;
	
	@FindBy(how=How.ID,using="tdpur4101s300-8-button-std-file.save_and_close")
	public WebElement SaveNcloseSingleocc;
}
