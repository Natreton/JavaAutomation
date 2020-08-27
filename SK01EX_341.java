package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SK01EX_341 {

	@Test
	void post_form_has_text_above() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.ownprofileAvailable(driver);
		ReusableMethods.findbuttonNewPost(driver);
		LocalisationMethods.find_headingthree(driver);
	}

}
