package recruitment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import objectsRepository.CandidatesObj;
import pom.LoginPOM;

public class Candidates extends BaseWebDriver{
	public static XSSFRow row;
	public static String datas = null;
	static Logger logger=Logger.getLogger(Candidates.class);
	@Test
	public void candidateDetails() {


		  FileInputStream stream = null; 
		  try { 
			  stream = new FileInputStream("C:\\Users\\Balaji\\Desktop\\Vaish\\Eclipse\\MFRPOrangeHRMnew\\Config\\config.properties"); 
			  } catch (FileNotFoundException e) { 
             e.printStackTrace(); 
           } 
		  Properties properties=new Properties(); 
		  try { 
			  properties.load(stream); 
			  } catch(IOException e) { 
				  e.printStackTrace();
			  }

		PropertyConfigurator.configure("C:\\Users\\Balaji\\Desktop\\Vaish\\Eclipse\\MFRPOrangeHRMnew\\LogData\\log4j.properties");


		FileInputStream path = null;
		try {
			path = new FileInputStream("C:\\Users\\Balaji\\Desktop\\Vaish\\Eclipse\\MFRPOrangeHRMnew\\Config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String col = prop.getProperty("CandidatesCol"),excelPath=prop.getProperty("ExcelPath")
				,resumePath=prop.getProperty("ResumePath");
		int colIndex=Integer.parseInt(col);

		PageFactory.initElements(driver, CandidatesObj.class);
	
		CandidatesObj.recruitmentbtn.click();

		CandidatesObj.addUseR.click();

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
		String username1 = null, username2 = null, username3 = null, emailID = null, contactNO = null, keyWord = null, comments = null;
		try {
			username1 = getExcelData(rowIterator,colIndex);
			username2 = getExcelData(rowIterator,colIndex);
			username3 = getExcelData(rowIterator,colIndex);
			emailID = getExcelData(rowIterator, colIndex);
			contactNO = getExcelData(rowIterator, colIndex);
			keyWord = getExcelData(rowIterator, colIndex);
			comments = getExcelData(rowIterator, colIndex);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CandidatesObj.userNamE.sendKeys(username1+KeyEvent.VK_TAB+username2+KeyEvent.VK_TAB+username3);
		CandidatesObj.emailBox.sendKeys(emailID);
		CandidatesObj.contactNo.sendKeys(contactNO);

		Select select=new Select(CandidatesObj.setVacancy);
		select.selectByIndex(0);

		CandidatesObj.keyWords.sendKeys(keyWord);
		CandidatesObj.commentBox.sendKeys(comments);
		CandidatesObj.dateBox.clear();

		Actions act =new Actions(driver);
		act.click(CandidatesObj.addResume).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		StringSelection stringSelection = new StringSelection(resumePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
		Robot robo = null;
		try {
			robo = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		LocalDate pDate=java.time.LocalDate.now();
		String today=pDate.toString();
		CandidatesObj.dateBox.sendKeys(today);

		act.click(CandidatesObj.consentCheckBox).build().perform();
		try {
			excelBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CandidatesObj.saveBtn.click();
		logger.info("Added candidate successfully");
	}

	public String getExcelData(Iterator<Row> rowIterator,int colIndex) throws IOException {

		row = (XSSFRow) rowIterator.next();
		Cell cell = row.getCell(colIndex);

		cell.setCellType(CellType.STRING);
		//String data0= cell.getStringCellValue();

		datas=cell.getStringCellValue();
		return datas;
	}

}
