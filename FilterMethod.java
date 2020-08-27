package webdriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterMethod {
		
		public static void findFilter(WebDriver driver) {
			WebElement filterPrivate = driver.findElement(By.xpath("//label[@class='btn-private btn btn-primary']"));
			filterPrivate.click();
		}
		
		public static void displayFilter(WebDriver driver) {
			WebElement displayFilter = driver.findElement(By.xpath("//label[@class='btn-all btn btn-primary']"));
			boolean displayed = displayFilter.isDisplayed();
			assertTrue(displayed);
		}
		public static void displayFilterAll(WebDriver driver) {
			WebElement displayFilter = driver.findElement(By.xpath("//label[@class='btn-all btn btn-primary']"));
			boolean displayed = displayFilter.isDisplayed();
			assertTrue(displayed);
		}	
		public static void displayFilterPublic(WebDriver driver) {
			WebElement displayFilter = driver.findElement(By.xpath("//label[@class='btn-public btn btn-primary active']"));
			boolean displayed = displayFilter.isDisplayed();
			assertTrue(displayed);
		}
		public static void displayFilterPrivate(WebDriver driver) {
			WebElement displayFilter = driver.findElement(By.xpath("//label[@class='btn-private btn btn-primary']"));
			boolean displayed = displayFilter.isDisplayed();
			assertTrue(displayed);
		}	
}
