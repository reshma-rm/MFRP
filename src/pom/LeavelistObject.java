package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavelistObject {
	
@FindBy(id="menu_leave_viewLeaveModule")
public static WebElement leave;

@FindBy(id="calFromDate")
public static WebElement fromdate;

@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
public static WebElement fromyear;

@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
public static WebElement frommonth;

@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]/a")
public static WebElement fromday;

@FindBy(id="calToDate")
public static WebElement todate;

@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
public static WebElement toyear;

@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
public static WebElement tomonth;

@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a")
public static WebElement toDay;

@FindBy(id="leaveList_chkSearchFilter_checkboxgroup_allcheck")
public static WebElement Allcheck;

@FindBy(id="leaveList_txtEmployee_empName")
public static WebElement empName;

@FindBy(id="leaveList_cmbSubunit")
public static WebElement Subunit;

@FindBy(id="btnSearch")
public static WebElement Search;

@FindBy(id="leaveList_cmbWithTerminated")
public static WebElement pastemployees;

@FindBy(id="btnSave")
public static WebElement btnSave;
}
