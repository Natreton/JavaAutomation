package webdriver;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class LoginSuccessfull {

	@Test
	public void successfullLogin() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		Login.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		
	}
}
