package PartsPurchasePages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//Author: Robin Gajbhiye, Date:04June2016

public class EasyPurchaseOrderMultiocc {
	
	@FindBy(how=How.XPATH,using=".//*[contains(@id,'button-std-file.new')]")
	public WebElement newbutton;
	
	@FindBy(how=How.XPATH,using=".//*[contains(@id,'tdpur400.orno-2-filter-value')]")
	public WebElement PONumberFilter;
	                   
	@FindBy(how=How.XPATH,using=".//*[contains(@id,'tdpur400.orno-1-0-widget')]")
	public WebElement PONumber;
	

}
