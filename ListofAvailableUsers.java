package webdriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class ListofAvailableUsers {

	@Test
	public void listofavailableUsers_afterFirstLogin() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		Login.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.listofavailableUsers(driver);
		
		
	}

}
