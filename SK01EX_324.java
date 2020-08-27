package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SK01EX_324 {

	@Test
	void post_form_attribute_caption_field() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.ownprofileAvailable(driver);
		ReusableMethods.findbuttonNewPost(driver);
		LocalisationMethods.find_captionField(driver);
	}

}
