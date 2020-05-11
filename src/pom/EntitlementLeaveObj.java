package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntitlementLeaveObj {
	@FindBy(xpath="//*[@id=\"menu_leave_viewLeaveModule\"]/b")
	public static WebElement Leave;

	@FindBy(id="menu_leave_Entitlements")
	public static WebElement Entitlement;

	@FindBy(id="menu_leave_addLeaveEntitlement")
	public static WebElement AddEntitlement;


	@FindBy(id="entitlements_employee_empName")
	public static WebElement Employee;

	@FindBy(name="entitlements[leave_type]")
	public static WebElement LeaveType;


	@FindBy(id="period")
	public static WebElement Period;

	@FindBy(name="entitlements[entitlement]")
	public static WebElement Entitle;

	@FindBy(id="btnSave")
	public static WebElement SAve;

	/*
	* @FindBy(xpath="/html/body/div[4]/ul/li") public static WebElement john;
	*/


	@FindBy(id="ohrmList_chkSelectAll")
	public static WebElement Check;

	@FindBy( id="btnDelete")
	public static WebElement delete;

	@FindBy(id="dialogDeleteBtn")
	public static WebElement OK;



	@FindBy(id="btnAdd")
	public static WebElement Add;

	@FindBy(xpath="//*[@id=\"entitlements_filters_bulk_assign\"]")
	public static WebElement checkbox;




	@FindBy(id="btnCancel")
	public static WebElement cancel;

	@FindBy(name="entitlements[filters][location]")
	public static WebElement Location;

	@FindBy(id="entitlements_filters_subunit")
	public static WebElement SubUnit;

	@FindBy(id="entitlements_leave_type")
	public static WebElement Leavetype;



	@FindBy(id="period")
	public static WebElement LeavePeriod;


	@FindBy(name="entitlements[entitlement]")
	public static WebElement LeaveEntitlement;

	@FindBy(id="dialogConfirmBtn")
	public static WebElement Confirm;


	@FindBy(id="menu_leave_viewLeaveEntitlements")
	public static WebElement EmployeEntitlement;


	@FindBy(id="searchBtn")
	public static WebElement Search;



	
	
	
	
	
	
}
