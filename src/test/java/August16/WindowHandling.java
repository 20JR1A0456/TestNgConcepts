package August16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://the-internet.herokuapp.com/windows");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			WebElement clickhere = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
			clickhere.click();
			Thread.sleep(2000);
			Object[] windowHandles = driver.getWindowHandles().toArray();
			System.out.println(windowHandles);
			driver.switchTo().window((String) windowHandles[1]);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window((String) windowHandles[0]);
			driver.quit();
			
			
		}catch(Exception e) {
			
		}finally {
			driver.close();
			
		}

	}

}
