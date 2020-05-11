package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AssignLeaveObj {
	 @FindBy(how=How.ID,using="menu_leave_viewLeaveModule")
		public static WebElement leavebutton;
	  
		@FindBy(id="menu_leave_assignLeave")
		public static WebElement assignleave;
	 
		@FindBy(id="assignleave_txtEmployee_empName")
		public static WebElement empname;
		
		@FindBy(id="assignleave_txtLeaveType")
		public static WebElement leavetype;
	
		@FindBy(id="assignleave_txtFromDate")
		public static WebElement fromdate;
		
		@FindBy(id="assignleave_txtToDate")
		public static WebElement todate;
		
		@FindBy(xpath="//a[@title=\"Next\"]")
		public static WebElement nextbutton;
		
		@FindBy(id="assignleave_partialDays")
		public static WebElement partialdays;
	
		@FindBy(id="assignBtn")
		public static WebElement assignbutton;
		
		@FindBy(id="confirmOkButton")
		public static WebElement clickok;
	}
