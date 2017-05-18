package FinancePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GPOLines {
	
//	.//*[contains(@id,'menu-std:action-form-receive.full.quantity')]
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101m003-3-button-std-file.new']")
	public WebElement newGPOLine;
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101s002-4-tdpur401.idno-7-lookup-widget']")
	public WebElement ImportDoc;

	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101s002-4-tdpur401.item.segment.3-6']")
	public WebElement suffix;

	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101s002-4-tdpur401.item.segment.2-6-lookup-trigger-button-image']")
	public WebElement itemZoom;
	
	@FindBy(how=How.XPATH,using=".//*[contains(@id,'grid-1-select-0')]")
	public WebElement SelectFirstItem;
	
	@FindBy(how=How.XPATH,using="tcibd0501m000-5-button-std-file.save_and_close")
	public WebElement okselectitem;
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101s002-4-tdpur401.item.segment.2-6-lookup-widget']")
	public WebElement item;
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101s002-4-button-std-file.save']")
    public WebElement saveline;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101s002-4-tdpur401.oqua-11']")
    public WebElement quantity;
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101s002-4-button-std-file.save_and_close']")
    public WebElement saveNcloselineSingleocc;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101m003-3-button-std-file.save_and_close']")
    public WebElement saveNcloselineMMT;
	
	
	@FindBy(how=How.ID,using="tdext4101m003-3-grid-1-select-0")
    public WebElement SelectLine;
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4101m003-3-button-std:action']")
    public WebElement Action;
	
	@FindBy(how=How.XPATH,using="html/body/div[4]/div/div/div/table/tbody/tr[7]/td[2]/label")
    public WebElement FullReceive;
	
	
	@FindBy(how=How.ID,using="tdpur4501m300-5-grid-1-tdpur401.pric-12-0")
    public WebElement ReceivedAmount;
	
}
