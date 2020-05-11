package leave;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import baseDriverClass.BaseWebDriver;
import pom.LeaveReportsObj;

public class Leavereports extends BaseWebDriver {

	static Logger logger=Logger.getLogger(Leavereports.class);
	@Test
	public void leaveRep() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		PropertyConfigurator.configure("log4j.properties");	  

		PageFactory.initElements(driver,LeaveReportsObj.class);


		LeaveReportsObj.reports.click();
		LeaveReportsObj.viewleave.click();

		Select select2=new Select(LeaveReportsObj.generate);
		select2.selectByValue("1");
		LeaveReportsObj.typeofleave.click();
		LeaveReportsObj.period.click();
		LeaveReportsObj.pastemp.click();
		LeaveReportsObj.view.click();
		logger.info("Added leave");
	}

}
