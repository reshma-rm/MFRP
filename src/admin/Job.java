package admin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import baseDriverClass.BaseWebDriver;
import pom.JobPageObjects;

public class Job extends BaseWebDriver{
	@Test
	public void JobIcons() {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		String jobTitle=properties.getProperty("JobTitle");
		String jobDescrip=properties.getProperty("JobDescription");
		String specFileLocation=properties.getProperty("JobSpecificationFileLocation");
		String noteColumn=properties.getProperty("Note");
		String nameforPaygrade=properties.getProperty("Name");
		String addCurrency=properties.getProperty("Currency");
		String empNameStatus=properties.getProperty("Name(forEmploymentStatus)");

		PageFactory.initElements(driver,JobPageObjects.class);
		JobPageObjects.adminButton.click();
		JobPageObjects.job.click();
		JobPageObjects.jobTitles.click();
		JobPageObjects.add.click();
		JobPageObjects.jobTitle.sendKeys(jobTitle);
		JobPageObjects.Description.sendKeys(jobDescrip +Keys.TAB);

		Actions mouseAction= new Actions(driver);
		mouseAction.moveToElement(JobPageObjects.specification).click(JobPageObjects.specification).build().perform();

		String file=(specFileLocation);
		StringSelection string= new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		JobPageObjects.Note.sendKeys(noteColumn);;
		JobPageObjects.Save.click();
		logger.info("Saved Job Title Successfully");

		//For Pay grades part
		JobPageObjects.job.click();
		JobPageObjects.payGrades.click();
		JobPageObjects.Add.click();
		JobPageObjects.payname.sendKeys(nameforPaygrade);
		JobPageObjects.savebtn.click();
		JobPageObjects.AddCurrency.click();
		JobPageObjects.currency.sendKeys(addCurrency);
		JobPageObjects.SaveCurrency.click();
		logger.info("Saved currency Successfully");
		driver.navigate().refresh();

		//For Employment status
		JobPageObjects.job.click();
		JobPageObjects.empstatus.click();
		JobPageObjects.add1.click();
		JobPageObjects.empnme.sendKeys(empNameStatus);
		JobPageObjects.save1.click();
		logger.info("Employment status added successfully");
	}  

}
