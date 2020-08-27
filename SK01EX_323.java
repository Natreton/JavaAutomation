package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

//CANT BE AUTOMATED
class SK01EX_323  {

	@Test
	void unregistered_user_cantlike() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		//ReusableMethods.findLogin(driver);
		//LoginMethod.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.appPostDisplayed(driver);
		ReusableMethods.findImagePost(driver);
		ReusableMethods.findLikeButton(driver);
	}

}
