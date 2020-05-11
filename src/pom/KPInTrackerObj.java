package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KPInTrackerObj {

@FindBy(xpath="//*[@id=\"menu__Performance\"]/b")
public static WebElement perf;

@FindBy(xpath="//*[@id=\"menu_performance_Configure\"]")
public static WebElement con;

@FindBy(xpath="//*[@id=\"menu_performance_searchKpi\"]")
public static WebElement kpis;

@FindBy(name="btnAdd")
public static WebElement add;

@FindBy(xpath="//*[@id=\"btnCancel\"]")
public static WebElement cancel;

@FindBy(name="saveBtn")
public static WebElement save;

@FindBy(id="defineKpi360_jobTitleCode")
public static WebElement jobtitle;

@FindBy(id="defineKpi360_keyPerformanceIndicators")
public static WebElement kpi;

@FindBy(xpath="//*[@id=\"defineKpi360_minRating\"]")
public static WebElement minrating;

@FindBy(xpath="//*[@id=\"defineKpi360_maxRating\"]")
public static WebElement maxrating;

@FindBy(xpath="//*[@id=\"defineKpi360_makeDefault\"]")
public static WebElement mdc;


@FindBy(id="kpi360SearchForm_jobTitleCode")
public static WebElement job;

@FindBy(name="searchBtn")
public static WebElement search;

@FindBy(xpath="//*[@id=\"ohrmList_chkSelectRecord_1\"]")
public static WebElement del;

@FindBy(xpath="//*[@id=\"btnDelete\"]")
public static WebElement delete;

@FindBy(xpath="//*[@id=\"dialogDeleteBtn\"]")
public static WebElement ok;

@FindBy(xpath="//*[@id=\"menu_performance_addPerformanceTracker\"]")
public static WebElement tracks;

@FindBy(id="btnAdd")
public static WebElement tadd;

@FindBy(id="btnCancel")
public static WebElement tcancel;

@FindBy(name="addPerformanceTracker[tracker_name]")
public static WebElement trackername;

@FindBy(name="addPerformanceTracker[employeeName][empName]")
public static WebElement employname;

@FindBy(xpath="//*[@id=\"addPerformanceTracker_availableEmp\"]/option[2]")
public static WebElement availreviewers;

@FindBy(xpath="//*[@id=\"btnAssignEmployee\"]")
public static WebElement aadd;

@FindBy(id="btnSave")
public static WebElement ssave;
}

