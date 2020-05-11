package pimmodule;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.ReportObject;

public class Reports extends BaseWebDriver{
	@Test
	public void reportMod() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver,ReportObject.class);
		
		ReportObject.pimbutton.click();
		ReportObject.report.click();
		ReportObject.addbutton1.click();
		ReportObject.reportname.sendKeys("Report1");
		Select report=new Select(ReportObject.reportcriteria);
		report.selectByVisibleText("Employee Name");
		Select repcomparision=new Select(ReportObject.repcomp);
		repcomparision.selectByValue("1");
		Select groups=new Select(ReportObject.disgrps);
		groups.selectByVisibleText("Personal");
		ReportObject.adddis.click();
		logger.info("Successfully Added");

		ReportObject.checkbox1.click();
		ReportObject.savebttn.click();
		logger.info("Saved Successfully");

	}


}
