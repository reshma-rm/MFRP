package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualificationsObj {
	 @FindBy(id="menu_admin_Qualifications")
	    public static WebElement qualification;
	    
	    @FindBy(id="menu_admin_viewSkills")
	    public static WebElement skills;

	    @FindBy(id="btnAdd")
	    public static WebElement add2 ;

	    @FindBy(id="skill_name")
	    public static WebElement skname;

	    @FindBy(id="skill_description")
	    public static WebElement skdesc ;
	    
	    @FindBy(name="btnSave")
	    public static WebElement savee;
	    
	    @FindBy(id="menu_admin_viewEducation")
	    public static WebElement edc ;
	    
	    @FindBy(id="btnAdd")
	    public static WebElement btad;
	    
	    @FindBy(id="education_name")
	    public static WebElement level;
	    
	    @FindBy(id="btnSave")
	    public static WebElement btsavee;
	    
	    @FindBy(id="btnSave")
	    public static WebElement btsav;
	    
}
