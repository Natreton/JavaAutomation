package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SK01EX_149 {

	@Test
	 void rememberMe_functionality() throws InterruptedException {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.remember_me(driver, "GolemPustinqk", "pustinqkGOLEM123");
		Thread.sleep(5000);
		ReusableMethods.logoutfromSite(driver);
		Thread.sleep(3000);
		LocalisationMethods.find_singinButton(driver);
		ReusableMethods.findSearchField(driver);
	}

}
