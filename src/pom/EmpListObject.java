package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmpListObject {
	@FindBy(id="menu_pim_viewPimModule")
	public static WebElement pimbutton;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public static WebElement Emplist;
	
	@FindBy(id="ohrmList_chkSelectRecord_7")
	public static WebElement chklist;
	
	@FindBy(id="btnDelete")
	public static WebElement Delete;
	
	@FindBy(xpath="//*[@id=\"deleteConfModal\"]/div[3]/input[2]")
	public static WebElement cancel;
	

	@FindBy(id="btnAdd")
	public static WebElement btnAdd;
	
	@FindBy(id="firstName")
	public static WebElement firstname;
	
	@FindBy(id="lastName")
	public static WebElement lastname;
	
	@FindBy(id="photofile")
	public static WebElement choosefile;
	
	@FindBy(id="chkLogin")
	public static WebElement checkLogin;
	
	@FindBy(id="user_name")
	public static WebElement Username;
	
	@FindBy(id="user_password")
	public static WebElement Password;
	
	@FindBy(id="re_password")
	public static WebElement cnfmPassword;

	@FindBy(id="status")
	public static WebElement status;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement Savee;
	
	@FindBy(id="empsearch_employee_name_empName")
	public static WebElement empName;
	
	@FindBy(id="empsearch_id")
	public static WebElement empsearchid;
	
	@FindBy(xpath="//*[@id=\"empsearch_employee_status\"]/option[4]")
	public static WebElement empstatus;
	
	@FindBy(xpath="//*[@id=\"empsearch_termination\"]/option[1]")
	public static WebElement currentemp;
	
	@FindBy(id="empsearch_supervisor_name")
	public static WebElement supervisorname;
	
	@FindBy(id="empsearch_job_title")
	public static WebElement empjobtitle;
	
	@FindBy(id="empsearch_sub_unit")
	public static WebElement sub_unit;
	
	@FindBy(id="searchBtn")
	public static WebElement search;
	
	@FindBy(id="resetBtn")
	public static WebElement reset;
}
