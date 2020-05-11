package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigLeaveObj {
	
	 @FindBy(xpath="//*[@id=\"menu_leave_viewLeaveModule\"]/b")
	    public static WebElement Leave;
	    
	    @FindBy(xpath="//*[@id=\"menu_leave_Configure\"]")
	    public static WebElement Leave_config;
	    
	    @FindBy(xpath="//*[@id=\"menu_leave_defineLeavePeriod\"]")
	    public static WebElement Leave_period;
	    
	    @FindBy(xpath="//*[@id=\"btnEdit\"]")
	    public static WebElement L_edit;
	    
	    @FindBy(xpath="//*[@id=\"leaveperiod_cmbStartMonth\"]")
	    public static WebElement L_startmonth;
	    
	    @FindBy(xpath="//*[@id=\"leaveperiod_cmbStartDate\"]")
	    public static WebElement L_startdate;
	    
	    @FindBy(xpath="//*[@id=\"btnEdit\"][@value=\"Save\"]")
	    public static WebElement L_save;
	    
	    @FindBy(xpath="//*[@id=\"btnReset\"]")
	    public static WebElement L_reset;
	    
	    @FindBy(xpath="//*[@id=\"menu_leave_leaveTypeList\"]")
	    public static WebElement Leavetype;
	    
	    @FindBy(xpath="//*[@id=\"btnAdd\"]")
	    public static WebElement LT_add;
	    
	    @FindBy(xpath="//*[@id=\"leaveType_txtLeaveTypeName\"]")
	    public static WebElement LT_name;
	    
	    @FindBy(xpath="//*[@id=\"saveButton\"]")
	    public static WebElement LT_save;
	    
	    @FindBy(xpath="//*[@id=\"backButton\"]")
	    public static WebElement LT_cancel;
	    
	    @FindBy(xpath="//*[@id=\"ohrmList_chkSelectRecord_1\"]")
	    public static WebElement LT_deltitem;

	    @FindBy(xpath="//*[@id=\"deleteConfModal\"]/div[3]/input[2]")
	    public static WebElement LTdelt_cancel;
	    
	    @FindBy(id="btnDelete")
	    public static WebElement LT_delete;
	    
	    
	    

}
