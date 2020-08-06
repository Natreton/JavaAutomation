package webdriver;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Logout {

	@Test
	public void logOut() throws InterruptedException {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		Login.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		Thread.sleep(5000);
		ReusableMethods.logoutfromSite(driver);
		
	}
}
