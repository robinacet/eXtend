package ActionUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		if (browser=="FireFox")
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
		WebDriver driver = new FirefoxDriver();
		driver.get(username+":"+password+"@"+url);
		driver.manage().window().maximize();
		return driver;
	}

	private static WebDriver LaunchChrome(String url,String username, String password) {
		
		System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("opening url  "+"https://"+username+":"+password+"@"+url);
		driver.get("https://"+username+":"+password+"@"+url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		return driver;
	}

	
	public static WebDriver GetDriver()
	{
		return driver;
	}
	
	

}
