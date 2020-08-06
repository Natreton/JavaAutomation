package webdriver;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class AccessOtherUserProfile {

				@Test
				void byUserNameFromPost() {
					WebDriver driver = ReusableMethods.initializeWebDriver();
					ReusableMethods.takeiSkillourl(driver);
					ReusableMethods.findLogin(driver);
					Login.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
					ReusableMethods.appPostDisplayed(driver);
					OtherUsersProfile.accessbyName(driver);
				}

}
