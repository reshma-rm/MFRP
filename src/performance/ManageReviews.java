package performance;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.PerformancePOM;

public class ManageReviews extends BaseWebDriver{
	static Logger logger=Logger.getLogger(ManageReviews.class);
	@Test
	public void manageReviews()  {

	
		String EmpName=properties.getProperty("EmployeeName");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		PropertyConfigurator.configure("log4j.properties");
		PageFactory.initElements(driver, PerformancePOM.class);

		/// PERFORMANCE MODULE

		PerformancePOM.perform.click();
		PerformancePOM.manage.click();
		PerformancePOM.kpival.click();
		PerformancePOM.add.click();
		PerformancePOM.name.sendKeys(EmpName +Keys.ENTER);
		logger.info("Performance module is working");
	}
}