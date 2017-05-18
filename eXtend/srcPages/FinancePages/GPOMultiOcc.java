package FinancePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GPOMultiOcc {
	
	@FindBy(how=How.XPATH,using=".//*[contains(@id,'new')]")
	public WebElement newGPO;

}
