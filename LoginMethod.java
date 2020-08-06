package webdriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginMethod {
	
			public static void successfullLogin(WebDriver driver, String username, String password) {
				WebElement usernameField = driver.findElement(By.name("usernameOrEmail"));
				usernameField.sendKeys(username);
				WebElement passWord = driver.findElement(By.id("defaultLoginFormPassword"));
				passWord.sendKeys(password);
				WebElement signinButton = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
				signinButton.click();
				WebElement searchField = driver.findElement(By.id("search-bar"));
				boolean displayed = searchField.isDisplayed();
				assertTrue(displayed);
			}
}


