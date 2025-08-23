package August19Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(TestListners.class)
public class AddToCart {
WebDriver driver;
@BeforeClass(alwaysRun = true)
public void setupClass() {
    WebDriverManager.chromedriver().setup();
}

	// for launching the browser using  this annotation
	@BeforeMethod 
	public void launchbrowser() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
		
	 @Test(priority = 1, groups = {"Regression", "Sanity"})
	    public void addMobileToCart() throws InterruptedException {
	        WebElement phone = driver.findElement(By.xpath("//a[normalize-space()='Iphone 6 32gb']"));
	        phone.click();
	      WebElement cart =  driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
	      cart.click();
	        Thread.sleep(2000);
	        driver.switchTo().alert().accept();
	    }

	    @Test(priority = 2, groups = {"Regression"}, dependsOnMethods = "addMobileToCart")
	    public void addLaptopToCart() throws InterruptedException {
	        driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")).click();
	        driver.findElement(By.xpath("//a[3]")).click();
	        driver.findElement(By.xpath("//a[normalize-space()='MacBook air']")).click();
	        driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
	        Thread.sleep(2000);
	        driver.switchTo().alert().accept();
	    }

	    @Test(priority = 3, groups = {"Regression"}, dependsOnMethods = {"addMobileToCart", "addLaptopToCart"})
	    public void placeOrder() throws InterruptedException {
	        driver.findElement(By.id("cartur")).click();
	        driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("name")).sendKeys("Batman");
	        driver.findElement(By.id("country")).sendKeys("Dark world");
	        driver.findElement(By.id("city")).sendKeys("Dark Knight");
	        driver.findElement(By.id("card")).sendKeys("4581 4455 5487");
	        driver.findElement(By.id("month")).sendKeys("August");
	        driver.findElement(By.id("year")).sendKeys("2025");

	        driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
	        Thread.sleep(2000);

	        WebElement ok = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	        Assert.assertTrue(ok.isDisplayed(), "Order not placed successfully!");
	        ok.click();
	    }

	    @AfterMethod(alwaysRun = true)
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @AfterClass(alwaysRun = true)
	    public void closeClass() {
	        System.out.println("All tests finished.");
	    }

}
