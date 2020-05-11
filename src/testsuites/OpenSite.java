package testsuites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import baseDriverClass.BaseWebDriver;

public class OpenSite extends BaseWebDriver{
	
	static Logger logger=Logger.getLogger(OpenSite.class);
	@BeforeSuite
	public void launchBrowser() {

		 //String driverLocation=properties.getProperty("DriverLocation"); 
		 String	 Link=properties.getProperty("mainURL");
		 PropertyConfigurator.configure("config.properties");
		 //System.setProperty("webdriver.chrome.driver",driverLocation);
		 
		 driver=new ChromeDriver();
		 
		Link=properties.getProperty("mainURL");
		driver.navigate().to(Link);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		logger.info("OrangeHRM is opened");
	}
}
