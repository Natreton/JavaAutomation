package webdriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class RegistrationNewUser {

	@Test
	public void registrationNewUser() {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		ReusableMethods.findRegister(driver);
		Registration.fillRegistrationForm(driver, "GolemPustinqk", "pustinqk@abv.bg", "12/20/2000" , 
				"pustinqkGOLEM123", "pustinqkGOLEM123", "Pustinqk"  );
	}
}
