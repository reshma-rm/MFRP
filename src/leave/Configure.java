package leave;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.ConfigLeaveObj;
import pom.LeavePOM;

public class Configure extends BaseWebDriver{
	
	@Test
	public void login() {


		
		String MondayVal=properties.getProperty("Monday");
		String TuesdayVal=properties.getProperty("Tuesday");
		String WednesdayVal=properties.getProperty("Wednesday");
		String ThursdayVal=properties.getProperty("Thursday");
		String FridayVal=properties.getProperty("Friday");
		String SaturdayVal=properties.getProperty("Saturday");
		String SundayVal=properties.getProperty("Sunday");

		String holidayName=properties.getProperty("HolidayName");
		String holidayDate=properties.getProperty("HolidayDate");
		String repeatsOrNot=properties.getProperty("Repeats");
		String fullHalf=properties.getProperty("FullOrHalf");

		String startDate=properties.getProperty("StartDate");
		String endDate=properties.getProperty("EndDate");


		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		
		PageFactory.initElements(driver, LeavePOM.class);

		
		//WorkWeek Part
		LeavePOM.leaveButton.click();
		LeavePOM.configureButton.click();
		LeavePOM.workWeekButton.click();

		//Check if all elements are disabled
		Boolean mondayEnabled=LeavePOM.forMonday.isEnabled();
		logger.info(mondayEnabled);
		Boolean tuesdayEnabled=LeavePOM.forTuesday.isEnabled();
		logger.info(tuesdayEnabled);
		Boolean wednesdayEnabled=LeavePOM.forWednesday.isEnabled();
		logger.info(wednesdayEnabled);
		Boolean thursdayEnabled=LeavePOM.forThursday.isEnabled();
		logger.info(thursdayEnabled);
		Boolean fridayEnabled=LeavePOM.forFriday.isEnabled();
		logger.info(fridayEnabled);
		Boolean saturdayEnabled=LeavePOM.forSaturday.isEnabled();
		logger.info(saturdayEnabled);
		Boolean sundayEnabled=LeavePOM.forSunday.isEnabled();
		logger.info(sundayEnabled);
		String buttonStatus=LeavePOM.editAndSave.getAttribute("value");
		logger.info("The button is " +buttonStatus);

		//Editing the work days
		LeavePOM.editAndSave.click();
		String buttonStatusAfterClick=LeavePOM.editAndSave.getAttribute("value");
		logger.info("The button after clicking is " +buttonStatusAfterClick);

		Select monday=new Select(LeavePOM.forMonday);
		monday.selectByVisibleText(MondayVal);
		Select tuesday=new Select(LeavePOM.forTuesday);
		tuesday.selectByVisibleText(TuesdayVal);
		Select wednesday=new Select(LeavePOM.forWednesday);
		wednesday.selectByVisibleText(WednesdayVal);
		Select thursday=new Select(LeavePOM.forThursday);
		thursday.selectByVisibleText(ThursdayVal);
		Select friday=new Select(LeavePOM.forFriday);
		friday.selectByVisibleText(FridayVal);
		Select saturday=new Select(LeavePOM.forSaturday);
		saturday.selectByVisibleText(SaturdayVal);
		Select sunday=new Select(LeavePOM.forSunday);
		sunday.selectByVisibleText(SundayVal);

		LeavePOM.editAndSave.click();
		logger.info("Successfully updated");

		//Holiday Adding Part
		LeavePOM.configureButton.click();
		LeavePOM.holidayButton.click();
		LeavePOM.holidayAdd.click();

		LeavePOM.nameOfHoliday.sendKeys(holidayName);
		LeavePOM.dateOfHoliday.clear();
		LeavePOM.dateOfHoliday.sendKeys(holidayDate+Keys.ENTER);
		if(repeatsOrNot=="Yes") 
			LeavePOM.repeatHoliday.click();
		Select dayLength=new Select(LeavePOM.fullDayHalf);
		dayLength.selectByVisibleText(fullHalf);
		LeavePOM.saveHoliday.click();
		logger.info("Holiday is added");

		LeavePOM.holidayAdd.click();
		LeavePOM.cancelAddHoliday.click();
		logger.info("Cancelling the add holiday option is successfull");

		LeavePOM.fromDateHoliday.clear();
		LeavePOM.fromDateHoliday.sendKeys(startDate +Keys.ENTER);
		LeavePOM.toDateHoliday.sendKeys(endDate +Keys.ENTER);
		LeavePOM.searchHoliday.click();
		logger.info("Holiday search is successful");


		//Deleting Holiday list
		LeavePOM.choseToDelete.click();
		LeavePOM.deleteHolidayList.click();
		LeavePOM.confirmDeleteHolidayList.click();
		logger.info("Deleted the Holiday List Successfully");







	}

}
