package baseDriverClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;


public class BaseWebDriver {

	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger=Logger.getLogger(BaseWebDriver.class);
	public BaseWebDriver(){
		PropertyConfigurator.configure("log4j.properties");
		try {
			properties = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "./Config/config.properties");
			properties.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * log=new Properties(); FileInputStream logIP = null; try { logIP = new
		 * FileInputStream(System.getProperty("user.dir")+
		 * "./LogData/log4j.properties"); } catch (FileNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } try { log.load(logIP); }
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

	}

	public static void initialization(){

		String browserName = properties.getProperty("browser");
		String driverLocation=properties.getProperty("location");
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", driverLocation);	

		}	
	}
}

