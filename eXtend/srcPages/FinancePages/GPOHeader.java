package FinancePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GPOHeader {

	@FindBy(how=How.XPATH,using=".//*[contains(@id,'tdpur400.otbp-1-lookup-trigger-button')]")
	public WebElement BuyFromBPzoom;
//	.//*[contains(@id,'button-std-file.save')]
	
	@FindBy(how=How.XPATH,using=".//*[contains(@id,'tdpur400.otbp-1-lookup-widget')]")
	public WebElement BuyFromBP;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[2]/div[2]/div[5]/div/div[3]/div/div[1]/div[2]/div")
	public WebElement FirstBPinList;
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[1]/div[1]")
	public WebElement okbuttoninbp;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4100m001-1-button-std-file.save']")
	                             
	public WebElement saveGPO;
	
	
	
	
	@FindBy(how=How.XPATH,using=".//*[contains(@id,'tdpur400.orno-18-lookup-widget')]")
	public WebElement GPONumber;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='tdext4100m001-1-button-std:action']")
	public WebElement Actions;
	
	
	@FindBy(how=How.XPATH,using=".//*[contains(@id,'menu-std:action-form-to.lines-label')]")
	public WebElement OpenGPOLines;
	
}
