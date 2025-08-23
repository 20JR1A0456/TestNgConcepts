package August16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			WebElement aboutamz = driver.findElement(By.xpath("//a[normalize-space()='About Amazon']"));
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.scrollToElement(aboutamz).perform();
			aboutamz.click();
			
			
			
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			driver.quit();
		}

	}

}
