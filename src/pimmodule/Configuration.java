package pimmodule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.PIMConfig;

public class Configuration extends BaseWebDriver{
	
	@Test
	public  void configMod() {
		//Searching employee details and add if we want

		String Field_Custom_Name=properties.getProperty("Field_Name");
		String Custom_Custom_Name=properties.getProperty("Custom_Name");
		String Report_Custom_Name=properties.getProperty("Report_Name");
		String Reg_Custom_Name=properties.getProperty("Reg_Name");
		String Request_Custom_Name=properties.getProperty("Request_Name");
		
		PageFactory.initElements(driver,PIMConfig.class);

		PIMConfig.pimbutton.click();
		PIMConfig.configuration.click();
		PIMConfig.optfield.click();
		PIMConfig.Edit.click();
		PIMConfig.depfield.click();
		PIMConfig.ssnbtn.click();
		PIMConfig.savebutton.click();
		logger.info("Successfully Edited");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PIMConfig.pimbutton.click();
		PIMConfig.configuration.click();
		//addding custom field
		PIMConfig.customfield.click();
		PIMConfig.buttonAdd.click();
		PIMConfig.fieldname.click();
		PIMConfig.fieldname.sendKeys(Field_Custom_Name);
		Select select=new Select(PIMConfig.screen);
		select.selectByVisibleText("Qualifications");
		Select select1=new Select(PIMConfig.fieldtype);
		select1.selectByValue("0");
		PIMConfig.savebtn1.click();
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,20); WebElement
		 * w1=wait.until(ExpectedConditions.elementToBeClickable(PIMConfig.addBtn));
		 * w1.click();
		 */
	
		
		
		PIMConfig.configuration.click();
		PIMConfig.dataimport.click();
		PIMConfig.download.click();
		logger.info("Downloaded data import successfully");

		//Adding report
		PIMConfig.configuration.click();
		PIMConfig.reportmeth.click();
		PIMConfig.addbtn1.click();
		PIMConfig.reportmethname.sendKeys(Report_Custom_Name);
		PIMConfig.saveebtn.click();
		//termination 
		PIMConfig.configuration.click();
		PIMConfig.termination.click();
		PIMConfig.adddbtn.click();
		PIMConfig.term_reason.sendKeys(Reg_Custom_Name);
		PIMConfig.termsave.click();
		logger.info("termination saved");
	}


}


