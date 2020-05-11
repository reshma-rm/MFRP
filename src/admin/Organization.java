package admin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseDriverClass.BaseWebDriver;
import pom.OrganizationObj;

public class Organization extends BaseWebDriver{

	@Test
	public void Organize() {

		//Loading  the properties file

		String locationName=properties.getProperty("GiveName");
		String countryName=properties.getProperty("GiveCountry");
		String stateName=properties.getProperty("GiveState");
		String cityName=properties.getProperty("GiveCity");
		String locationAddress=properties.getProperty("GiveAddress");
		String locationPinCode=properties.getProperty("GivePinCode");
		String locationPhNo=properties.getProperty("GivePhoneNo");
		String locationsearch=properties.getProperty("Searchlocation");
		String searchCity=properties.getProperty("SearchCity");
		String searchCountry=properties.getProperty("SearchCountry");
		
		PageFactory.initElements(driver,OrganizationObj.class);
		//Adding Location in Organization part
		OrganizationObj.organization.click();
		OrganizationObj.location.click();
		OrganizationObj.addbtn.click();
		OrganizationObj.locname.sendKeys(locationName);
		Select select=new Select(OrganizationObj.country);
		select.selectByVisibleText(countryName);
		OrganizationObj.state.sendKeys(stateName);	
		OrganizationObj.city.sendKeys(cityName);
		OrganizationObj.address.sendKeys(locationAddress+Keys.TAB);
		OrganizationObj.zipcode.sendKeys(locationPinCode);
		OrganizationObj.phone.sendKeys(locationPhNo);
		OrganizationObj.Savebtn.click();
		logger.info("Added new location successfully");

		//Searching from location list
		OrganizationObj.Location_name.sendKeys(locationsearch);
		OrganizationObj.Location_city.sendKeys(searchCity);
		Select select1=new Select(OrganizationObj.loccountry);
		select1.selectByVisibleText(searchCountry);
		logger.info("Search location is successful");
		OrganizationObj.Reset.click();
		logger.info("Reset in loaction search is done ");
	}


}
