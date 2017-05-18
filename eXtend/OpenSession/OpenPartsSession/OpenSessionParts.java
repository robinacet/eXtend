package OpenPartsSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ActionUtilities.ManageDrivers;
import HomePage.HomePage;
import PartsPurchasePages.EasyPurchaseOrderMultiocc;

//Author: Robin Gajbhiye, Date:04June2016

public class OpenSessionParts {
	
//	public static  WebDriver driver;
	
	
	
	public static void OpenPartsPurchaseOrder()
	{
//		ManageDrivers.OpenUrl("Chrome", "http://anarvekar:eXtendIntegration@192.168.25.245:8312/webui/servlet/login?default");
		//This Method will open Parts Purchase Order
		WebDriver driver= ManageDrivers.GetDriver();
		HomePage Homepg = PageFactory.initElements(driver, HomePage.class);
		PartsPurchasePages.EasyPurchaseOrderMultiocc POmultiocc =PageFactory.initElements(driver, EasyPurchaseOrderMultiocc.class);
		
				
		Homepg.PartsManagement.click();
		Homepg.PurchaseControl.click();
		Homepg.PartsPurchase.click();
		Homepg.PartPurchaseOrder.click();
		Homepg.EasyPurchaseOrder.click();
		
		POmultiocc.newbutton.click();
		
		System.out.println("Parts Purchase order Sucessfully opened");
	}
	
	public static void OpenPartsPurchaseOrderMultiocc()
	{
		WebDriver driver= ManageDrivers.GetDriver();
		HomePage Homepg = PageFactory.initElements(driver, HomePage.class);
		PartsPurchasePages.EasyPurchaseOrderMultiocc POmultiocc =PageFactory.initElements(driver, EasyPurchaseOrderMultiocc.class);
		
				
		Homepg.PartsManagement.click();
		Homepg.PurchaseControl.click();
		Homepg.PartsPurchase.click();
		Homepg.PartPurchaseOrder.click();
		Homepg.EasyPurchaseOrder.click();
		
		
		
		System.out.println("Parts Purchase order multiocc Sucessfully opened");
	}

}
