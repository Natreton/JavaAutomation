package webdriver;

import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class ReusableMethods {
		public static  WebDriver initializeWebDriver(){
			System.setProperty("webdriver.chrome.driver","D:\\Programs\\Java\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			return driver;
		}
		 
		public static void takeiSkillourl(WebDriver driver) {
			
			driver.get("http://training.skillo-bg.com:4300/posts/all");
		
		}
		public static void findLogin(WebDriver driver) {
			WebElement loginLink = driver.findElement(By.id("nav-link-login"));
			loginLink.click();
		}
		public static void findSearchField(WebDriver driver) {
			WebElement searchField = driver.findElement(By.id("search-bar"));
			boolean displayed = searchField.isDisplayed();
			assertTrue(displayed);
			
		}
		public static void findRegister(WebDriver driver) {
			WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
			registerLink.click();
		}
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
		public static void listofavailableUsers(WebDriver driver) {
			WebElement listofUsers = driver.findElement(By.xpath("//div[@class='col-12 offset-md-3 col-md-6 all-users-container']"));
			boolean displayed = listofUsers.isDisplayed();
			assertTrue(displayed);
		}
		public static void logoutfromSite(WebDriver driver) {
			WebElement buttonLogOut = driver.findElement(By.xpath("//i[@class='fas fa-sign-out-alt fa-lg']"));
			//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			buttonLogOut.click();
		
		}
		public static void ownprofileAvailable(WebDriver driver) {
			WebElement buttonProfile = driver.findElement(By.xpath("//a[@id='nav-link-profile']"));
			buttonProfile.click();
		}
		public static void findbuttonNewPost(WebDriver driver) {
			WebElement buttonNewPost = driver.findElement(By.xpath("//i[@class='far fa-plus-square fa-lg']"));
			buttonNewPost.click();
		}
	
		public static void findUpload(WebDriver driver) {
			WebElement fieldUpload = driver.findElement(By.xpath("//input[@type='file']"));
			fieldUpload.sendKeys("D:/Documents/Pustinqk.jpg");
		}
		
		
		public static void findCaptionField(WebDriver driver, String caption) {
			WebElement fieldCaption = driver.findElement(By.name("caption"));
			fieldCaption.sendKeys(caption);
		}
		public static void buttonCreatePost(WebDriver driver) {
			WebElement findCreatePost = driver.findElement(By.xpath("//button[@id='create-post']"));
			findCreatePost.click();
		}
		
		public static void poststatusPrivate(WebDriver driver) {
			WebElement findStatusPrivate = driver.findElement(By.xpath("//label[@class='post-status-label custom-control-label active']"));
			findStatusPrivate.click();
		}
		public static void ownprofileimageUpload(WebDriver driver) {
			WebElement findImageSection = driver.findElement(By.xpath("//input[@id='upload-img']"));
			findImageSection.sendKeys("D:/Documents/qkpustinqk.jpg");
		}
		//find if any post is displayed
		public static void appPostDisplayed(WebDriver driver) {
			WebElement findPost = driver.findElement(By.tagName("app-post-detail"));
			boolean displayed = findPost.isDisplayed();
			assertTrue(displayed);
		}
		public static void findImagePost(WebDriver driver) {
			WebElement findpostImage = driver.findElement(By.xpath("(//app-post-detail//div[@class='post-feed-img']//img)[1]"));
			findpostImage.click();
		}
		//find if there is comment field
		public static void commentFormDisplayed(WebDriver driver) {
			WebElement findCommentForm = driver.findElement(By.tagName("app-comment-form"));
			boolean displayed = findCommentForm.isDisplayed();
			assertTrue(displayed);
		}
		//Enter comments
		public static void submitComment(WebDriver driver, String comment) {
			WebElement findCommentField = driver.findElement(By.xpath("//input[@placeholder='Comment here']"));
			findCommentField.sendKeys(comment);
			findCommentField.sendKeys(Keys.ENTER);
			
		}
}
