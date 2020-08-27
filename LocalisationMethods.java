package webdriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocalisationMethods {
				
				public static void find_headingthree(WebDriver driver) {
					WebElement findHeading = driver.findElement(By.xpath("//h3[contains(text(),'Post a picture to share with your awesome followers')]"));
					if (findHeading.isDisplayed()) {
						System.out.println("The text in the heading is correct");
					}
					else {
						System.out.println("Text is not correct!");
					}
				}
				
				public static void find_captionField(WebDriver driver) {
					WebElement findCaptionField = driver.findElement(By.xpath("//input[@placeholder='Enter you post caption here']"));
					boolean displayed = findCaptionField.isDisplayed();
					assertTrue(displayed);
				}
				
				public static void find_singinButton(WebDriver driver) {
					WebElement findSignIn = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
					findSignIn.click();
				}
}
