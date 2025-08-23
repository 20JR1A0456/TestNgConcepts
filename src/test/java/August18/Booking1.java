package August18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking1 {
	public static WebDriver driver;


	public static void main(String[] args) {
		try {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement hotel = driver.findElement(By.xpath("//a[normalize-space()='Hotels']"));
		act.moveToElement(hotel).perform();
		hotel.click();
		Thread.sleep(2000);
		// Locate the destination input box
		/*WebElement destinationInput = driver.findElement(By.xpath("//input[@id='select2-hotels_city-container']"));
		destinationInput.click();
		Thread.sleep(2000);

		 WebElement sel = driver.findElement(By.xpath("//input[@role='searchbox']"));
		 sel.sendKeys("Dubai");
		 Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//li[contains(text(),'Dubai')]"));
		option.click();
		Thread.sleep(2000);*/
		WebElement search = driver.findElement(By.xpath("//input[@role='searchbox']"));
		search.sendKeys("Dubai");
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']"));
		option.click();
		Thread.sleep(2000);
	
		
	}catch(Exception e) {
		System.out.println(e);
	}finally {
		if(driver != null) {
			driver.quit();
		}
	}

}
}
