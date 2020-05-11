package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VacancyObj {
	@FindBy(id = "menu_recruitment_viewJobVacancy" )
	public static WebElement Vacancy;
	
	@FindBy(id = "btnAdd" )
	public static WebElement AddBtn;
	
	@FindBy(id = "btnSave" )
	public static WebElement SaveBtn;
	
	@FindBy(id = "addJobVacancy_jobTitle" )
	public static WebElement JobTitle;
	
	@FindBy(id = "addJobVacancy_name" )
	public static WebElement VacancyName;
	
	@FindBy(id = "addJobVacancy_hiringManager" )
	public static WebElement HMgr;
	
	@FindBy(id = "addJobVacancy_noOfPositions" )
	public static WebElement NOS;
	
	@FindBy(id = "addJobVacancy_description" )
	public static WebElement Description;
	
	@FindBy(id = "addJobVacancy_status" )
	public static WebElement Active;
	
	@FindBy(id = "addJobVacancy_publishedInFeed" )
	public static WebElement publish;

}
