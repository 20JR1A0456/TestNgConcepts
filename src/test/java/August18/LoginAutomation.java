package August18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {
	public static WebDriver driver;

	public static void main(String[] args) {
	try {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Login with valid credentials.
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("student");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Password123");
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(2000);
		//driver.navigate().back();
		WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
		logout.click();
		Thread.sleep(2000);
		//2. login with invalid username ansd valid paasword .
		
		WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));
		username1.sendKeys("incorrectUser ");
		Thread.sleep(2000);
		WebElement password1= driver.findElement(By.xpath("//input[@id='password']"));
		password1.sendKeys("Password123");
		Thread.sleep(2000);
		WebElement submit1 = driver.findElement(By.xpath("//button[@id='submit']"));
		submit1.click();
		Thread.sleep(2000);
		//3. login with correct username and incorrect password.
		WebElement username2 = driver.findElement(By.xpath("//input[@id='username']"));
		username2.sendKeys("student");
		Thread.sleep(2000);
		WebElement password2= driver.findElement(By.xpath("//input[@id='password']"));
		password2.sendKeys("incorrectPassword ");
		Thread.sleep(2000);
		WebElement submit2 = driver.findElement(By.xpath("//button[@id='submit']"));
		submit2.click();
		
		
	
	
	}catch(Exception e) {
		System.out.println(e);
	}finally {
		if(driver != null) {
			driver.quit();
		}
	}

	}

}
