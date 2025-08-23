package LabSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentRegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@id = 'name']"));
		name.sendKeys("Siva");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("abcscds@gmail.com");
		WebElement gender = driver.findElement(By.xpath("//input[@id = 'gender']"));
		gender.click();
		WebElement value = driver.findElement(By.xpath("//label[normalize-space()='Male']"));value.click();
		WebElement mobile = driver.findElement(By.xpath("//input[@id = 'mobile']"));
		mobile.sendKeys("27346746373");
		Thread.sleep(2000);
		WebElement dob = driver.findElement(By.xpath("//input[@id = 'dob']"));
		dob.sendKeys("22/04/2025");
		Thread.sleep(2000);
		WebElement subject = driver.findElement(By.xpath("//input[@id = 'subjects']"));
		subject.sendKeys("Selenium");
		WebElement Hobbies = driver.findElement(By.xpath("//label[normalize-space()='Hobbies:']"));
		Hobbies.click();
		Thread.sleep(2000);
		
		WebElement Hobbies1 = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
		Hobbies1.click();
		Thread.sleep(2000);
		WebElement picture = driver.findElement(By.xpath("//input[@id = 'picture']"));
		picture.sendKeys("C:\\Users\\Siva Sai\\Downloads\\1080x1920-420521-TV-Show-Batman-The-Animated-Series-Phone-Wallpaper.jpg");
		//WebElement upload = driver.findElement(By.xpath(null))
		WebElement currentaddr = driver.findElement(By.xpath("//textarea[@id='picture']"));
		currentaddr.sendKeys("road no 456");
		WebElement State = driver.findElement(By.xpath("//select[@id = 'state']"));
		WebElement city = driver.findElement(By.xpath("//select[@id = 'city']"));
		Select state1 = new Select(State);
		Select city1 = new Select(city);
		state1.selectByIndex(2);
		city1.selectByVisibleText("Agra");
		
		

	}

}
