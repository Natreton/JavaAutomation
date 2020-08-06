package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OtherUsersProfileMethod {
				public static void accessbyName(WebDriver driver) {
					WebElement finduserName = driver.findElement(By.xpath("//a[contains(text(),'Georgi_Stankov')]"));
					finduserName.click();
				}
}
