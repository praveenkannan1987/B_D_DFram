package BroadcastStepDef;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import Utility.BrowserUtility;
import Utility.PropertiesFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleDef {
	public static WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();
	
	@Given("^Open Chrome browser and enter URL$")
	public void opandent() throws Exception{
		Properties prop=obj.getProperty();
		BrowserUtility.OpenBrowser(driver, prop.getProperty("browserName"), prop.getProperty("broadcastQA1URL"));
		Thread.sleep(3000);
	}
	
	@When("^Enter Search creteria$")
	public void entersearch() throws Exception{
		//driver.findElement(By.id("Search")).sendKeys("Hello");
		Thread.sleep(3000);
	}
	
	@Then("^Click on search button$")
	public void quit() throws Exception{
		driver.quit();
	}
}
