package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SK01EX_134 {
	
	//The test will PASS only if other users have made private posts
	@Test
	void private_post_functionality() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		OtherUsersProfileMethod.accessbyName(driver);
		FilterMethod.findFilter(driver);
		OtherUsersProfileMethod.find_other_user_private_image(driver);
		
	}

}
