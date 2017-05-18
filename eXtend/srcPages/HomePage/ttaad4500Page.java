package HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//Author: Robin Gajbhiye, Date:04June2016
public class ttaad4500Page {
	
	
	
	@FindBy(how=How.ID,using="ttaad4500    -11-cpac-lookup-widget")
	public WebElement Package;
	
	@FindBy(how=How.ID,using="ttaad4500    -11-cmod-lookup-widge")
	public WebElement module;
	
	@FindBy(how=How.ID,using="ttaad4500    -11-flno-lookup-widget")
	public WebElement table;
	
	@FindBy(how=How.ID,using="ttaad4500    -11-comp-lookup-widget")
	public WebElement company;
	

	

	
	
}
