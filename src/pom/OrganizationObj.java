package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationObj {

	@FindBy(xpath="//*[@id=\"menu_admin_Organization\"]")
	public static WebElement organization;
	
	@FindBy(id="menu_admin_viewLocations")
	public static WebElement location;
	
	@FindBy(id="btnAdd")
	public static WebElement addbtn;
	
	@FindBy(id="location_name")
	public static WebElement locname;
	
	@FindBy(id="location_country")
	public static WebElement country;
	
	@FindBy(id="location_province")
	public static WebElement state;
	
	@FindBy(id="location_city")
	public static WebElement city;
	
	@FindBy(id="location_address")
	public static WebElement address;
	
	@FindBy(id="location_zipCode")
	public static WebElement zipcode;
	
	@FindBy(id="location_phone")
	public static WebElement phone;
	
	@FindBy(id="btnSave")
	public static WebElement Savebtn;
	
	@FindBy(id="searchLocation_name")
	public static WebElement Location_name;
	
	@FindBy(id="searchLocation_city")
	public static WebElement Location_city;
	
	
	@FindBy(id="searchLocation_country")
	public static WebElement loccountry;
	
	@FindBy(id="btnReset")
	public static WebElement Reset;
	
		

}
