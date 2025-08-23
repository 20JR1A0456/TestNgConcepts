package August18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModifyLogin {
	@Test(groups = {"Sanity","Regression"})
	//@Test(priority = 0)
	public void login() throws InterruptedException {
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("student");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Password123");
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("logged-in-sucessfully")) {
			System.out.println("logged-in-sucessfully");
		}else {
			System.out.println("Url verification failed");
		}
		WebElement message = driver.findElement(By.tagName("h1"));
		if(message.getText().contains("Logged in Sucessfully")) {
			System.out.println("Sucess message is verified");
		}else {
			System.out.println("sucess message is not verified");
		}
		WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
		logout.click();
		
	}
	@Test(groups = {"Regression"})
	//@Test(priority = 1)
	public void negativeuser() throws InterruptedException {
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));
		username1.sendKeys("incorrectUser ");
		Thread.sleep(2000);
		WebElement password1= driver.findElement(By.xpath("//input[@id='password']"));
		password1.sendKeys("Password123");
		Thread.sleep(2000);
		WebElement submit1 = driver.findElement(By.xpath("//button[@id='submit']"));
		submit1.click();
		Thread.sleep(2000);
	}
	//@Test(dependsOnMethods= {"login"})
	
	@Test(groups = {"Regression"})
	public void negativepass() throws InterruptedException {
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username2 = driver.findElement(By.xpath("//input[@id='username']"));
		username2.sendKeys("student");
		Thread.sleep(2000);
		WebElement password2= driver.findElement(By.xpath("//input[@id='password']"));
		password2.sendKeys("incorrectPassword ");
		Thread.sleep(2000);
		WebElement submit2 = driver.findElement(By.xpath("//button[@id='submit']"));
		submit2.click();
		
	}

}
