package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationMethod {
	public static void fillRegistrationForm(WebDriver driver, String username,String email, String date, String password, String confirmpassword, String publicInfo) {
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.sendKeys(username);
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='email']"));
		emailField.sendKeys(email);
		WebElement dateField = driver.findElement(By.xpath("//input[@placeholder='Birth date']"));
		dateField.sendKeys(date);
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='defaultRegisterFormPassword']"));
		passwordField.sendKeys(password);
		WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@id='defaultRegisterPhonePassword']"));
		confirmPasswordField.sendKeys(confirmpassword);
		WebElement publicInfoField = driver.findElement(By.xpath("//textarea[@placeholder='Public info']"));
		publicInfoField.sendKeys(publicInfo);
		WebElement signIn = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
		signIn.click();
		
	}
}
