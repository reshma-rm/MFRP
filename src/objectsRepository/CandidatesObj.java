package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CandidatesObj {
	@FindBy(how =How.ID, using = "btnAdd")
	public static WebElement addUseR;
	
	@FindBy(how =How.XPATH, using = "//b[text()=\"Recruitment\"]")
	public static WebElement recruitmentbtn;
	
	@FindBy(id = "addCandidate_firstName")
	public static WebElement userNamE;
	
	@FindBy(id = "addCandidate_email")
	public static WebElement emailBox;
	
	@FindBy(id = "addCandidate_contactNo")
	public static WebElement contactNo;
	
	@FindBy(id = "addCandidate_vacancy")
	public static WebElement setVacancy;
	
	@FindBy(id = "addCandidate_resume")
	public static WebElement addResume;
	
	@FindBy(id = "addCandidate_keyWords")
	public static WebElement keyWords;
	
	@FindBy(id = "addCandidate_comment")
	public static WebElement commentBox;
	
	@FindBy(id = "addCandidate_appliedDate")
	public static WebElement dateBox;
	
	@FindBy(id = "addCandidate_consentToKeepData")
	public static WebElement consentCheckBox;
	
	@FindBy(id = "btnSave" )
	public static WebElement saveBtn;



}
