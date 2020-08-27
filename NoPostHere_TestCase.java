package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class NoPostHere_TestCase {

	@Test
	void findAttributes_NoPost() throws InterruptedException {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.inputSearchField(driver, "Emile Hutton");
		Thread.sleep(5000);
		LocalisationMethods.find_SearchName(driver);
		LocalisationMethods.find_dropdownSearchName(driver);
		LocalisationMethods.find_NoPostHereElements(driver);
	}

}
