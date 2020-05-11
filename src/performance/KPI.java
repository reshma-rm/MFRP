package performance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.KPInTrackerObj;

public class KPI extends BaseWebDriver {
	@Test
	public void kpi() {

		 

		PageFactory.initElements(driver, KPInTrackerObj.class);

		//PERFORMANCE MODULE
		//CONFIGURE PART

		//To click on perfromance button
		KPInTrackerObj.perf.click();

		//To click on configure button
		KPInTrackerObj.con.click();

		//To click on KPI buttom
		KPInTrackerObj.kpis.click();

		//To Add employees
		KPInTrackerObj.add.click();


		//Propety file Configurations 
		String KPI=properties.getProperty("kpi");
		String MAX=properties.getProperty("maxrating");
		String MIN=properties.getProperty("minrating");


		//To select the value in "Job Title"
		
		Select select1=new Select(KPInTrackerObj.jobtitle);
		select1.selectByVisibleText("Sales Executive");


		//To enter Key Performance Indicator value
	    
		KPInTrackerObj.kpi.sendKeys(Keys.CLEAR+KPI+Keys.ENTER);

		//To enter Minimum Rating value
		KPInTrackerObj.minrating.clear();
		KPInTrackerObj.minrating.sendKeys(MIN);

		//To enter Minimum Rating value
		KPInTrackerObj.maxrating.clear();
		KPInTrackerObj.maxrating.sendKeys(MAX);
		KPInTrackerObj.mdc.click();

		// To save
		KPInTrackerObj.save.click();

        //To search by job title after saving details
		Select select2=new Select(KPInTrackerObj.job);
		select2.selectByVisibleText("Sales Executive");
		
		//To search after saving the detils
		KPInTrackerObj.search.click();


		logger.info("KPI Added");

	}
}