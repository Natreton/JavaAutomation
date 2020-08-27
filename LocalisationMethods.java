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
			
			
				
				public static void find_singinButton(WebDriver driver) {
					WebElement findSignIn = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
					findSignIn.click();
				}
				
				public static void find_dropdownSearchName(WebDriver driver) {
					WebElement findSearchName = driver.findElement(By.xpath("//a[contains(text(),'Emile Hutton')]"));
					if (findSearchName.isDisplayed()) {
						findSearchName.click();
					}
					else {
						System.out.println("Name is not correct");
					}
					
				}
				public static void find_thecaptionField(WebDriver driver) {
					WebElement findtheCaptionField = driver.findElement(By.xpath("//input[@placeholder='Enter you post caption here']"));
					boolean displayed = findtheCaptionField.isDisplayed();
					assertTrue(displayed);
					//assertTrue(displayed, "Enter you post caption here");
				}
				public static void find_SearchName(WebDriver driver) {
					WebElement findDropdownName = driver.findElement(By.xpath("//div[@class='dropdown-container']//a[contains(text(),'Emile Hutton')]"));
					boolean displayed = findDropdownName.isDisplayed();
					assertTrue(displayed);
					//assertTrue(displayed,"Emile Hutton");
				}
				public static void find_filterprivateDisabled(WebDriver driver) {
					WebElement privateDisabled = driver.findElement(By.xpath("//label[@class='btn-private btn btn-primary disabled']"));
					boolean displayed = privateDisabled.isDisplayed();
					assertTrue(displayed);
				}
				public static void find_buttonFollow(WebDriver driver) {
					WebElement findFollow = driver.findElement(By.xpath("//button[contains(text(),'Follow')]"));
					boolean displayed = findFollow.isDisplayed();
					assertTrue(displayed);
				}
				
				public static void find_NoPostHereElements(WebDriver driver) {
					WebElement findImageFace = driver.findElement(By.xpath("//i[contains(@class,'fas fa-sad-tear  fa-3x')]"));
					boolean displayedImage = findImageFace.isDisplayed();
					assertTrue(displayedImage);
					WebElement nopostHere = driver.findElement(By.xpath("//h3[contains(text(),'No posts here')]"));
					boolean displayedText = nopostHere.isDisplayed();
					assertTrue(displayedText);
				}
				
				public static void find_buttonX_closeForm(WebDriver driver) {
					WebElement findXClose = driver.findElement(By.xpath("//i[contains(@class,'fas fa-times')]"));
					findXClose.click();
				}
				
				
				public static void find_followingCounter(WebDriver driver) {
					WebElement findCounter = driver.findElement(By.id("following"));
					findCounter.click();
				}
				
				public static void find_FormFollowing(WebDriver driver) {
					WebElement formFollowing = driver.findElement(By.xpath("//div[contains(@class,'modal-content')]//app-followers-modal"));
					boolean display = formFollowing.isDisplayed();
					assertTrue(display);
				}
}
