package testsuites;

import org.testng.annotations.AfterSuite;

import baseDriverClass.BaseWebDriver;

public class CloseSite extends BaseWebDriver{

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

}
