package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobPageObjects {
	
	@FindBy(id="menu_admin_viewAdminModule")
	public static WebElement adminButton;
	
	@FindBy(id="menu_admin_Job")
	public static WebElement job;

	@FindBy(id="menu_admin_viewJobTitleList")
	public static WebElement jobTitles;

	@FindBy(name="btnAdd")
	public static WebElement add;
	
	@FindBy(id="jobTitle_jobTitle")
	public static WebElement jobTitle;

	@FindBy(id="jobTitle_jobDescription")
	public static WebElement Description ;

	@FindBy(id="jobTitle_jobSpec")
	public static WebElement specification;

	@FindBy(id="jobTitle_note")
	public static WebElement Note ;

	@FindBy(id="btnSave")
	public static WebElement Save ;
	
	@FindBy(id="menu_admin_viewPayGrades")
	public static WebElement payGrades ;
	
	@FindBy(id="btnAdd")
	public static WebElement Add ;
	
	@FindBy(id="payGrade_name")
	public static WebElement payname  ;
	
	@FindBy(id="btnSave")
	public static WebElement savebtn ;
	
	@FindBy(id="btnAddCurrency")
	public static WebElement AddCurrency;
	
	@FindBy(id="payGradeCurrency_currencyName")
	public static WebElement currency;
	
	@FindBy(id="btnSaveCurrency")
	public static WebElement SaveCurrency;
	
	@FindBy(xpath="//*[@id=\"menu_admin_employmentStatus\"]") 
	public static WebElement empstatus;

    @FindBy(id="btnAdd")
    public static WebElement add1 ;

    @FindBy(id="empStatus_name")
    public static WebElement empnme ;
    
    @FindBy(id="btnSave")
    public static WebElement save1 ;
  
}
