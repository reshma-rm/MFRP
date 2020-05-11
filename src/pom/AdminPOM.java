package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPOM {
//Adding User
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]")
	public static WebElement adminButtonAU;
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewSystemUsers\"]")
	public static WebElement userButtonAU;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement clickAddAU;
	
	@FindBy(xpath="//*[@id=\"systemUser_userType\"]")
	public static WebElement userRoleAU;
	
	@FindBy(xpath="//*[@id=\"systemUser_employeeName_empName\"]")
	public static WebElement empNameAU;
	
	@FindBy(xpath="//*[@id=\"systemUser_userName\"]")
	public static WebElement userNameofEmpAU;
	
	@FindBy(xpath="//*[@id=\"systemUser_status\"]")
	public static WebElement userStatusAU;
	
	@FindBy(xpath="//*[@id=\"systemUser_password\"]")
	public static WebElement userPasswordAU;
	
	@FindBy(xpath="//*[@id=\"systemUser_confirmPassword\"]")
	public static WebElement confirmPasswordAU;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement saveButtonAU;
	
	@FindBy(xpath="//*[@id=\"btnCancel\"]")
	public static WebElement cancelUserButtonAU;
	
	@FindBy(id="searchBtn")
	public static WebElement searchUserclickAU;
	
	@FindBy(id="searchSystemUser_userName")
	public static WebElement searchWithUserNameAU;
	
	@FindBy(xpath="//*[contains(@class, 'delete')][contains(@id, 'btnDelete')]")
	public static WebElement deleteSearchAU;
	
	@FindBy(id="ohrmList_chkSelectAll")
	public static WebElement checkBoxAU;
	
	@FindBy(id="dialogDeleteBtn")
	public static WebElement OkButtonAU;
	
	@FindBy(id="resetBtn")
	public static WebElement resetSearchAU;
	
	
	
	
	
	
	
	
}

