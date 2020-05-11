package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMConfig {
	@FindBy(id="menu_pim_viewPimModule")
	public static WebElement pimbutton;
	
	@FindBy(id="menu_pim_Configuration")
	public static WebElement configuration;
	
	@FindBy(id="menu_pim_configurePim")
	public static WebElement optfield;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement Edit;
	
	@FindBy(id="configPim_chkDeprecateFields")
	public static WebElement depfield;
	
	@FindBy(id="configPim_chkShowSSN")
	public static WebElement ssnbtn;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement savebutton;
	
	@FindBy(id="menu_pim_listCustomFields")
	public static WebElement customfield;
	
	@FindBy(id="buttonAdd")
	public static WebElement buttonAdd;
	
	@FindBy(id="customField_name")
	public static WebElement fieldname;

	@FindBy(id="customField_screen")
	public static WebElement screen ;
	
	@FindBy(id="customField_type")
	public static WebElement fieldtype;
	
	@FindBy(id="btnSave")
	public static WebElement savebtn1;
	
	@FindBy(xpath="//*[@id=\"buttonAdd\"]")
	public static WebElement addBtn;
	
	@FindBy(id="customField_extra_data")
	public static WebElement selopt;
	
	@FindBy(id="btnSave")
	public static WebElement btnSave;
	
	@FindBy(xpath="//*[@id=\"allCheck\"]")
	public static WebElement allcheck;
	
	@FindBy(id="buttonRemove")
	public static WebElement buttonRemove;
	
	@FindBy(xpath="//*[@id=\"deleteConfModal\"]/div[3]/input[2]")
	public static WebElement btncancel;
    
	@FindBy(id="menu_admin_pimCsvImport")
	public static WebElement dataimport;
	
	@FindBy(xpath="//*[@id=\"frmPimCsvImport\"]/fieldset/ul/li[7]/a")
	public static WebElement download;
	
	@FindBy(xpath="//*[@id=\"pimCsvImport_csvFile\"]")
	public static WebElement choose;
	
	@FindBy(id="btnSave")
	public static WebElement upload;
	
	@FindBy(id="menu_pim_viewReportingMethods")
	public static WebElement reportmeth;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement addbtn1;
	
	@FindBy(id="reportingMethod_name")
	public static WebElement reportmethname;
	
	@FindBy(id="btnSave")
	public static WebElement saveebtn;
	
	@FindBy(id="menu_pim_viewTerminationReasons")
	public static WebElement termination;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement adddbtn;
	
	@FindBy(id="terminationReason_name")
	public static WebElement term_reason;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement termsave;
	
	@FindBy(id="btnCancel")
	public static WebElement cancel;
	
}
