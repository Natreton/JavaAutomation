package webdriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FilterClass {

	@Test
	public void filterownProfile() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.ownprofileAvailable(driver);
		FilterMethod.findFilter(driver);
		FilterMethod.displayFilter(driver);
	}

}
