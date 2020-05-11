package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {
	
	@FindBy(id="txtUsername")
	public static WebElement userName;
	@FindBy(id="txtPassword")
	public static WebElement password;
	@FindBy(id="btnLogin")
	public static WebElement loginButton;
	@FindBy(xpath="//*[text()=\"Forgot your password?\"]")
	public static WebElement forgotPassword;
	@FindBy(id="btnCancel")
	public static WebElement cancelButton;
	@FindBy(xpath="//*[@width=\"283\"][@alt=\"OrangeHRM\"]")
	public static WebElement logo;

}
