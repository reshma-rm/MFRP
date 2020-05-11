package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePOM {

//POM for WorkWeek
@FindBy(id="menu_leave_viewLeaveModule")
public static WebElement leaveButton;

@FindBy(id="menu_leave_Configure")
public static WebElement configureButton;

@FindBy(id="menu_leave_defineWorkWeek")
public static WebElement workWeekButton;

@FindBy(id="WorkWeek_day_length_Monday")
public static WebElement forMonday;

@FindBy(id="WorkWeek_day_length_Tuesday")
public static WebElement forTuesday;

@FindBy(id="WorkWeek_day_length_Wednesday")
public static WebElement forWednesday;

@FindBy(id="WorkWeek_day_length_Thursday")
public static WebElement forThursday;

@FindBy(id="WorkWeek_day_length_Friday")
public static WebElement forFriday;

@FindBy(id="WorkWeek_day_length_Saturday")
public static WebElement forSaturday;

@FindBy(id="WorkWeek_day_length_Sunday")
public static WebElement forSunday;

@FindBy(id="saveBtn")
public static WebElement editAndSave;

//POM for Holidays

@FindBy(id="menu_leave_viewHolidayList")
public static WebElement holidayButton;

@FindBy(xpath="//*[contains(@name, 'btnAdd')][contains(@value, 'Add')]")
public static WebElement holidayAdd;

@FindBy(id="holiday_description")
public static WebElement nameOfHoliday;

@FindBy(id="holiday_date")
public static WebElement dateOfHoliday;

@FindBy(id="holiday_reccurring")
public static WebElement repeatHoliday;

@FindBy(id="holiday_length")
public static WebElement fullDayHalf;

@FindBy(id="saveBtn")
public static WebElement saveHoliday;

@FindBy(id="btnCancel")
public static WebElement cancelAddHoliday;

//POM for HOliday Search

@FindBy(id="calFromDate")
public static WebElement fromDateHoliday;

@FindBy(id="calToDate")
public static WebElement toDateHoliday;

@FindBy(id="btnSearch")
public static WebElement searchHoliday;

//POM for Deleting Holiday
@FindBy(id="ohrmList_chkSelectAll")
public static WebElement choseToDelete;

@FindBy(xpath="//*[contains(@id, 'btnDelete')][contains(@name, 'btnDelete')]")
public static WebElement deleteHolidayList;

@FindBy(xpath="//*[contains(@id, 'dialogDeleteBtn')][contains(@value, 'Ok')]")
public static WebElement confirmDeleteHolidayList;


}
