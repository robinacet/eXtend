package PartsPurchasePages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//Author: Robin Gajbhiye, Date:04June2016

public class PurchaseOrderHeader {
	
	@FindBy(how=How.ID,using="tdpur4103m000-1-button-std-file.save")
	public WebElement save;
		
	@FindBy(how=How.ID,using="tdpur4103m000-1-tdpur400.otbp-2-lookup-widget")
	public WebElement BuyFromBP;
	
	@FindBy(how=How.ID,using="tdpur4103m000-1-tdpur400.orno-19-lookup-widget")
	public WebElement PurchaseOrder;
	
	
	
	

}
