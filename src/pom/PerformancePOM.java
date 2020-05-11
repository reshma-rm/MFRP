package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class PerformancePOM {

	@FindBy(id="menu__Performance")
	public static WebElement perform;

	@FindBy(id="menu_performance_Configure")
	public static WebElement config;

	@FindBy(id="menu_performance_searchKpi")
	public static WebElement kpi;

	@FindBy(id="btnAdd")
	public static WebElement add;

	@FindBy(id="menu_performance_ManageReviews")
	public static WebElement manage;


	@FindBy(id="menu_performance_searchPerformancReview")
	public static WebElement kpival;

	@FindBy(id="saveReview360Form_employee")
	public static WebElement name;

}
