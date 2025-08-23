package August19Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestListners.class)


public class LoginModify {
	WebDriver driver;
	
	// for launching the browser using  this annotation
	@BeforeMethod 
	public void launchbrowser() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);

		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	//Adding Test Priority and Groups and dependsOnMethods And Assertions Concepts on Urls and Messages
	
	@Test(priority = 0,groups = {"Sanity","Regression"})
	public void validlogin() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("student");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Password123");
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String execptedtitle = "Logged In Successfully | Practice Test Automation";
		Assert.assertEquals(actualtitle,execptedtitle);
		
		//Assertion On Url
		/*String currrentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currrentUrl.contains("logged-in-successfully"),"URL verfication pass");
		
		//Assertion On Sucess Mesage 
		WebElement heading = driver.findElement(By.tagName("h1"));
		Assert.assertEquals(heading.getText().contains("Logged In Successfully") , "Success message matched!");*/
		WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
		logout.click();
		
	}
	
	@Test(priority = 1,groups = {"Sanity"})
	public void negativeuser() throws InterruptedException {
		WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));
		username1.sendKeys("incorrectUser ");
		Thread.sleep(2000);
		WebElement password1= driver.findElement(By.xpath("//input[@id='password']"));
		password1.sendKeys("Password123");
		Thread.sleep(2000);
		WebElement submit1 = driver.findElement(By.xpath("//button[@id='submit']"));
		submit1.click();
		Thread.sleep(2000);
		//WebElement errorMsg = driver.findElement(By.id("error"));
       // Assert.assertTrue(errorMsg.getText().contains("Your username is invalid!"));
	}
	@Test(priority = 3,groups = {"Sanity"})
	public void negativepass() throws InterruptedException {
		WebElement username2 = driver.findElement(By.xpath("//input[@id='username']"));
		username2.sendKeys("student");
		Thread.sleep(2000);
		WebElement password2= driver.findElement(By.xpath("//input[@id='password']"));
		password2.sendKeys("incorrectPassword ");
		Thread.sleep(2000);
		WebElement submit2 = driver.findElement(By.xpath("//button[@id='submit']"));
		submit2.click();
		  // WebElement errorMsg = driver.findElement(By.id("error"));
	        //Assert.assertTrue(errorMsg.getText().contains("Your password is invalid!"));
	}
	@AfterMethod
	public void close() {
		if(driver != null) {
			driver.quit();
		}
	}
	

}
