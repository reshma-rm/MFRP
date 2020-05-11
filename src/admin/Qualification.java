package admin;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.QualificationsObj;

public class Qualification extends BaseWebDriver{
	@Test
	public void qualIcons() {
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		String skillGiven=properties.getProperty("SkillName");
		String skillDesc=properties.getProperty("SkillDescription");
		
		
		 PageFactory.initElements(driver,QualificationsObj.class);
		 
		 //Adding skills
		 QualificationsObj.qualification.click();
		 QualificationsObj.skills.click();
		 QualificationsObj.add2.click();
		 QualificationsObj.skname.sendKeys(skillGiven);
		 QualificationsObj.skdesc.sendKeys(skillDesc);
		 QualificationsObj.savee.click();
		 logger.info("New Skill added successfully");
		 QualificationsObj.qualification.click();
		 
	}
}
