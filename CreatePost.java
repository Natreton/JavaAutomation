package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePost {
			
			@Test
			public void createPostPublic() throws InterruptedException {
				WebDriver driver = ReusableMethods.initializeWebDriver();
				ReusableMethods.takeiSkillourl(driver);
				ReusableMethods.findLogin(driver);
				Login.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
				ReusableMethods.ownprofileAvailable(driver);
				ReusableMethods.findbuttonNewPost(driver);
				Thread.sleep(5000);
				//ReusableMethods.findBrowseButton(driver);
				//ReusableMethods.findFieldsmth(driver);
				ReusableMethods.findUpload(driver);
				Thread.sleep(5000);
				ReusableMethods.findCaptionField(driver,"asd");
				ReusableMethods.buttonCreatePost(driver);
			}
}
