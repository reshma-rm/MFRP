package admin;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.NatPageObject;

public class Nationality extends BaseWebDriver{
	

	@Test
	public void NatIcons() {
		
		//Loading  the properties file
				
		String nationName=properties.getProperty("Add_Nationality");
		  
		PageFactory.initElements(driver,NatPageObject.class);
        //Adding Nationality
		NatPageObject.nat.click();
		NatPageObject.addd.click();
		NatPageObject.ntname.sendKeys(nationName);
		NatPageObject.save1.click();
		logger.info("Nationality added successfully");
	}
}
