package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NatPageObject {
	  @FindBy(id="menu_admin_nationality")
	    public static WebElement nat ;
	    
	    @FindBy(id="btnAdd")
	    public static WebElement addd;
	    
	    @FindBy(id="nationality_name")
	    public static WebElement ntname ;
	    
	    @FindBy(id="btnSave")
	    public static WebElement save1;
	    
}
