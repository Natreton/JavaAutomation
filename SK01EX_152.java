package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SK01EX_152 {

	@Test
	void other_users_profile_without_follow() throws InterruptedException {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.successfullLogin(driver, "qkpustinqk", "PUSTINQKQK1");
		ReusableMethods.listofavailableUsers(driver);
		Thread.sleep(5000);
		ReusableMethods.findImage_listofavailableUsers(driver);
	}

}
