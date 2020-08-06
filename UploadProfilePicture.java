package webdriver;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class UploadProfilePicture {

	@Test
	void uploadProfilePicture() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		Login.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.ownprofileAvailable(driver);
		ReusableMethods.ownprofileimageUpload(driver);
	}

}
