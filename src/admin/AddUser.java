package admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.AdminPOM;
import pom.LoginPOM;


public class AddUser extends BaseWebDriver{
	
	@Test
	public void addUser() throws IOException {
		
		String UserNameGiven=properties.getProperty("UserName");
		
	
		PageFactory.initElements(driver, LoginPOM.class);
		PageFactory.initElements(driver, AdminPOM.class);
		
		
		//Adding User Part
		AdminPOM.adminButtonAU.click();
		AdminPOM.clickAddAU.click();
		AdminPOM.cancelUserButtonAU.click();
		
		
	    //Reading from Excel File
		String excelPathADDUser=properties.getProperty("excelPath");
		FileInputStream excel = null;
		try {
			excel = new FileInputStream(excelPathADDUser);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook wb1 = null;
		try {
			wb1 = new XSSFWorkbook(excel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet1=wb1.getSheetAt(0); 
		for(int i=1; i<2; i++) {
			AdminPOM.clickAddAU.click();
			//Import UserRole
			Cell cellUserRole= sheet1.getRow(i).getCell(0);
			Select role=new Select(AdminPOM.userRoleAU);
			role.selectByVisibleText(cellUserRole.getStringCellValue());
			
			//Import User Name
			Cell cellUserName= sheet1.getRow(i).getCell(1);
			AdminPOM.empNameAU.sendKeys(cellUserName.getStringCellValue() +Keys.ENTER);
			
			//Import Employee Name
			Cell cellUsernameofEmp=sheet1.getRow(i).getCell(2);
			AdminPOM.userNameofEmpAU.sendKeys(cellUsernameofEmp.getStringCellValue());
			
			//Import Status
			Cell cellStatus=sheet1.getRow(i).getCell(3);
			Select status=new Select(AdminPOM.userStatusAU);
			status.selectByVisibleText(cellStatus.getStringCellValue());
			
			//Import Password
			Cell cellPassword=sheet1.getRow(i).getCell(4);
			AdminPOM.userPasswordAU.sendKeys(cellPassword.getStringCellValue());
			
			//Import Confirm Password
			Cell cellConfPassword=sheet1.getRow(i).getCell(5);
			AdminPOM.confirmPasswordAU.sendKeys(cellConfPassword.getStringCellValue());
			
			AdminPOM.saveButtonAU.click();
			logger.info("Added User successfully");
		}
		try {
			wb1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Search for user from List
		
		AdminPOM.searchWithUserNameAU.sendKeys(UserNameGiven);
		AdminPOM.searchUserclickAU.click();  
		logger.info("Search user done");
		AdminPOM.checkBoxAU.click();
		AdminPOM.deleteSearchAU.click();
		AdminPOM.OkButtonAU.click();
		logger.info("Deleted succesfully");
		AdminPOM.resetSearchAU.click();
		logger.info("Reset done");
		//driver.close();
		
	}
}
