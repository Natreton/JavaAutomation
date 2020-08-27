package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SK01EX_299 {

	@Test
	void search_using_regular_expressions() throws InterruptedException {
		WebDriver driver = ReusableMethods.initializeWebDriver();
		ReusableMethods.takeiSkillourl(driver);
		ReusableMethods.findLogin(driver);
		LoginMethod.successfullLogin(driver, "GolemPustinqk", "pustinqkGOLEM123");
		ReusableMethods.inputSearchField(driver, "Georgi_Stankov");
		Thread.sleep(5000);
		ReusableMethods.findDropdownSearch(driver);
	}

}
