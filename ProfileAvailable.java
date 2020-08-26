package webdriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ProfileAvailable {

	@Test
	public void gotouserOwnProfile() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		Login.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.findProfileLink(driver);
		ReusableMethods.ownprofileAvailable(driver);
	}

}
