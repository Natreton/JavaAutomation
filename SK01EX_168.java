package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SK01EX_168 {

	@Test
	void filter_posts_functionality() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.appPostDisplayed(driver);
		ReusableMethods.find_profile_image_post(driver);
		FilterMethod.displayFilterAll(driver);
		FilterMethod.displayFilterPublic(driver);
		FilterMethod.displayFilterPrivate(driver);
		
	}

}
