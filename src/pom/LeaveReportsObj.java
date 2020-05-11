package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveReportsObj {
	
	@FindBy(id="menu_leave_Reports")
	public static WebElement reports;
	
	@FindBy(id="menu_leave_viewLeaveBalanceReport")
	public static WebElement viewleave;
	

	
	@FindBy(id="leave_balance_report_type")
	public static WebElement generate;
	
	@FindBy(xpath="//*[@id=\"leave_balance_leave_type\"]/option[2]")
public static WebElement typeofleave;
	

	@FindBy(xpath="//*[@id=\"period\"]/option[6]")
	public static WebElement period;

	@FindBy(id="leave_balance_include_terminated")
	public static WebElement pastemp;

	@FindBy(id="viewBtn")
	public static WebElement view;
	

}
