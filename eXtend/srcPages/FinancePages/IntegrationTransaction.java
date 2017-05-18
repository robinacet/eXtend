package FinancePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IntegrationTransaction {
	
	@FindBy(how=How.ID,using="tfgld4510m000-0-button-std-edit.find")
	public WebElement search;
	
	@FindBy(how=How.ID,using="tfgld4510m000-1-tfgld418.tror-control-widget")
	public WebElement search_TranOri;
	
	@FindBy(how=How.ID,using="tfgld4510m000-1-tfgld418.orno-lookup-widget")
	public WebElement search_TranPonumber;
	
	@FindBy(how=How.ID,using="tfgld4510m000-1-button-std-file.save_and_close")
	public WebElement search_ok;

	@FindBy(how=How.ID,using="tfgld4510m000-0-tfgld418.orno-6-lookup-widget")
	public WebElement ordernumber;
	
	@FindBy(how=How.ID,using="tfgld4510m000-0-grid-1-form.amount-12-0-widget")
	public WebElement amount;
	
	@FindBy(how=How.ID,using="item_31")
	public WebElement Search_PartsPurchase;
}
