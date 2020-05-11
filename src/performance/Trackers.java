package performance;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.KPInTrackerObj;

public class Trackers extends BaseWebDriver{
	static Logger logger=Logger.getLogger(Trackers.class);
	@Test
	public void trackers()  {


		String TRACKERNAME=properties.getProperty("trackername");
		String EMPLOYNAME=properties.getProperty("employname");
		PropertyConfigurator.configure("log4j.properties");
		PageFactory.initElements(driver, KPInTrackerObj.class);


		KPInTrackerObj.perf.click();
		KPInTrackerObj.con.click();
		KPInTrackerObj.tracks.click();
		KPInTrackerObj.tadd.click();
		KPInTrackerObj.tcancel.click();
		KPInTrackerObj.tadd.click();

		KPInTrackerObj.trackername.sendKeys(TRACKERNAME);
		KPInTrackerObj.employname.sendKeys(EMPLOYNAME);
		KPInTrackerObj.employname.sendKeys(Keys.ENTER);

		KPInTrackerObj.availreviewers.click();
		KPInTrackerObj.aadd.click();
		KPInTrackerObj.ssave.click();
		logger.info("Added tracker name successfully");
	}
}
