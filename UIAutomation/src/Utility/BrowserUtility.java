package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {
	public static WebDriver OpenBrowser(WebDriver driver, String browserName, String url) throws Exception{
	
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver  = new ChromeDriver();
		}else
			if(browserName.equals("IE")){
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver  = new InternetExplorerDriver();
		}else
			if(browserName.equals("Firefox")){
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver  = new FirefoxDriver();
		}else
		{
			driver=null;
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
}
