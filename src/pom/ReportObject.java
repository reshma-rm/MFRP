package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportObject {
	@FindBy(id="menu_pim_viewPimModule")
	public static WebElement pimbutton;
	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	public static WebElement report;
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement addbutton1;
	@FindBy(id="report_report_name")
	public static WebElement reportname;
	@FindBy(id="report_criteria_list")
	public static WebElement reportcriteria;
	@FindBy(id="report_include_comparision")
	public static WebElement repcomp;
	@FindBy(id="report_display_groups")
	public static WebElement disgrps;
	@FindBy(id="display_group_1")
	public static WebElement checkbox1;
	@FindBy(id="btnAddDisplayGroup")
	public static WebElement adddis;
	@FindBy(id="btnSave")
	public static WebElement savebttn;
}
