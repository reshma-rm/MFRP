package recruitment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.CandidateObjects;
import pom.VacanciesObj;

public class Vacancies extends BaseWebDriver{
	public XSSFRow row;
	public String datas;
	static Logger logger=Logger.getLogger(Vacancies.class);
@Test
	public void vacancies() {
	
		
			PropertyConfigurator.configure("log4j.properties");
			
			String col = properties.getProperty("VacancyCol"),excelPath=properties.getProperty("ExcelPath");
			int colIndex=Integer.parseInt(col);
			
			PageFactory.initElements(driver, VacanciesObj.class);
		
			PageFactory.initElements(driver, CandidateObjects.class);
		
			CandidateObjects.recruitmentbtn.click();
			VacanciesObj.Vacancy.click();
			VacanciesObj.AddBtn.click();
			
			
			
			File src= new File(excelPath);
			FileInputStream getBookPath = null;
			try {
				getBookPath = new FileInputStream(src);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            XSSFWorkbook excelBook = null;
			try {
				excelBook = new XSSFWorkbook(getBookPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			XSSFSheet sheet1=excelBook.getSheetAt(0);
			Iterator<Row>  rowIterator = sheet1.iterator();
			String vacancyName = null, hiringMGR = null, NoOfPosition = null, description = null, JobTitle = null;
			vacancyName = getExcelData(rowIterator,colIndex);
			hiringMGR = getExcelData(rowIterator,colIndex);
			NoOfPosition = getExcelData(rowIterator,colIndex);
			description = getExcelData(rowIterator, colIndex);
			JobTitle = properties.getProperty("Jobtitle");
			
			Select select=new Select(VacanciesObj.JobTitle);
			select.selectByVisibleText(JobTitle);;
			
			VacanciesObj.VacancyName.sendKeys(vacancyName);
			VacanciesObj.HMgr.sendKeys(hiringMGR);
			VacanciesObj.NOS.sendKeys(NoOfPosition);
			VacanciesObj.Description.sendKeys(description);
			
			Actions act=new Actions(driver);
			act.click(VacanciesObj.Active).build().perform();
			act.click(VacanciesObj.publish).build().perform();
			
			VacanciesObj.SaveBtn.click();
			logger.info("Added Vacancies successfully");
			try {
				excelBook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		public String getExcelData(Iterator<Row> rowIterator,int colIndex) {

			row = (XSSFRow) rowIterator.next();
			Cell cell = row.getCell(colIndex);
			datas=cell.getStringCellValue();
			return datas;
		}
		
	}


