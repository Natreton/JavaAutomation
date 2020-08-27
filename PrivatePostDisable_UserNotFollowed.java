package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class PrivatePostDisable_UserNotFollowed {

	@Test
	void privatepost_disabled() throws InterruptedException {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.inputSearchField(driver, "Emile Hutton");
		Thread.sleep(5000);
		LocalisationMethods.find_SearchName(driver);
		LocalisationMethods.find_dropdownSearchName(driver);
		LocalisationMethods.find_buttonFollow(driver);
		LocalisationMethods.find_filterprivateDisabled(driver);
	}

}
