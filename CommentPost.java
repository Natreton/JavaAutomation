package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class CommentPost {

	@Test
	void commentAvailablePost() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		Login.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.appPostDisplayed(driver);
		ReusableMethods.findImagePost(driver);
		ReusableMethods.commentFormDisplayed(driver);
		ReusableMethods.submitComment(driver, "Biraaaaaaaaa");
	}

}
//(//app-post-detail//div[@class='post-feed-img']//img)[1]