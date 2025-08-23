package August18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking {
	private WebDriver driver;
    private WebDriverWait wait;
@BeforeClass
public void setup() throws InterruptedException {
	ChromeOptions chromeOptions = new ChromeOptions(); 
	// web driver manager - download,setup and maitanance of diff browsers
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(chromeOptions);
	driver.get("https://phptravels.net/");
	driver.manage().window().maximize();
	Thread.sleep(2000);

}
@Test
public void book() {
	
	// dismissPopupsIfAny();
	try {
		WebElement hotelsTab = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a[href*='hotels'], li a[data-bs-target='#hotels']")));
            hotelsTab.click();
	}catch(Exception e) {
		System.out.println(e);
	}
}

}
