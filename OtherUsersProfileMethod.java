package webdriver;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OtherUsersProfileMethod {
				public static void accessbyName(WebDriver driver) {
					WebElement finduserName = driver.findElement(By.xpath("//a[contains(text(),'Georgi_Stankov')]"));
					finduserName.click();
				}
				public static void find_other_user_private_image(WebDriver driver) {
					WebElement imagePrivate = driver.findElement(By.xpath("(//app-post//div[@class='post-img']//img)[1]"));
					boolean displayed = imagePrivate.isDisplayed();
					assertTrue(displayed);
				}
}
