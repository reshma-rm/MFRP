package leave;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.EntitlementLeaveObj;

public class Entitlements extends BaseWebDriver{
	
	@Test
	public void entIcon() {

		
		PageFactory.initElements(driver, EntitlementLeaveObj.class);

		String Employe=properties.getProperty("employe");
		String Entitlement=properties.getProperty("Entitlement");

		EntitlementLeaveObj.Leave.click();

		Actions hover2=new Actions(driver);
		hover2.moveToElement(EntitlementLeaveObj.Entitlement).build().perform();
		EntitlementLeaveObj.AddEntitlement.click();

		EntitlementLeaveObj.cancel.click();

		EntitlementLeaveObj.Leave.click();

		Actions hover=new Actions(driver);
		hover.moveToElement(EntitlementLeaveObj.Entitlement).build().perform();
		EntitlementLeaveObj.AddEntitlement.click();

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf( EntitlementLeaveObj.Employee));
		
		EntitlementLeaveObj.Employee.click();
		EntitlementLeaveObj.Employee.clear();
		EntitlementLeaveObj.Employee.sendKeys(Employe);
		wait.until(ExpectedConditions.elementToBeClickable( EntitlementLeaveObj.Employee));
		EntitlementLeaveObj.Employee.sendKeys(Keys.ENTER );

		Select select=new Select(EntitlementLeaveObj.LeaveType);
		select.selectByValue("1");

		Select select1=new Select(EntitlementLeaveObj.Period);
		select1.selectByIndex(6);


		EntitlementLeaveObj.Entitle.sendKeys(Entitlement);


		EntitlementLeaveObj.SAve.click();
		logger.info("entitlement added");
		


	}

}