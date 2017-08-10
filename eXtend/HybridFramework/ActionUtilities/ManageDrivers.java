package ActionUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;

//Author: Robin Gajbhiye, Date:04June2016

public class ManageDrivers {
	
	public static WebDriver driver;
	
	public static WebDriver OpenUrl(String browser,String url, String username, String password) throws Exception
	{
//		File pro = new File(".//configuration//config.property");
//		FileInputStream fs = new FileInputStream(pro);
//		Properties pr = new Properties();
//		pr.load(fs);
//		String username =pr.getProperty("username");
//		String password =pr.getProperty("password");
//		String url =pr.getProperty("url");
		
		
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
			driver =LaunchChrome(url,username,password);
		}
		if (browser.equalsIgnoreCase("FireFox"))
		{
			driver = LaunchFirefox(url,username,password);
		}
		if (browser=="IE")
		{
			driver = LaunchIE(url,username,password);
		}
		
		
		
		
		
		
		return driver;
		
	}

	public static WebDriver LaunchIE(String url,String username, String password) {
		
		
		
		
		return null;
	}

	private static WebDriver LaunchFirefox(String url,String username, String password) {
		System.out.println("Opening FF");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Opening FF");
		driver.get("https://"+username+":"+password+"@"+url);
		driver.manage().window().maximize();
		return driver;
	}

	private static WebDriver LaunchChrome(String url,String username, String password) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
	     ChromeOptions cOptions = new ChromeOptions();

	    cOptions.addArguments("disable-infobars");

	  WebDriver  driver = new ChromeDriver(cOptions);
	  
	  driver.get(url);
	  
     Runtime.getRuntime().exec(".//LogineXtend1.exe");
     Thread.sleep(5000);

     driver.manage().window().maximize();
     
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		
		return driver;
	}

	
	public static WebDriver GetDriver()
	{
		return driver;
	}
	
	

}
