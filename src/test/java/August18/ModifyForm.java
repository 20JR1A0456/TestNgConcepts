package August18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModifyForm {
	@Test(groups = {"Regression"})
	public void details() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//1. Enter the First Name
		WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("Batman");
		Thread.sleep(2000);
		//2. Enter the Last Name
		WebElement last = driver.findElement(By.xpath("//input[@name='lastname']"));
		last.sendKeys("IronMan");
		Thread.sleep(2000);
		// 3. Select the Gender 
		WebElement gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
		gender.click();
		Thread.sleep(2000);
		//4. Select the Expereince 
		WebElement yexp = driver.findElement(By.xpath("//input[@id='exp-2']"));
		yexp.click();
		Thread.sleep(2000);
		//5. Select the Date
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("18/08/2025");
		Thread.sleep(2000);
		//6. select the profession
		WebElement proff = driver.findElement(By.xpath("//input[@id='profession-0']"));
		proff.click();
		Thread.sleep(2000);
		//7. Select the tools
		WebElement tools = driver.findElement(By.xpath("//input[@id='tool-0']"));
		tools.click();
		Thread.sleep(2000);
		
		WebElement tools1 = driver.findElement(By.xpath("//input[@id='tool-2']"));
		tools1.click();
		Thread.sleep(2000);
		
		WebElement drdwn = driver.findElement(By.xpath("//select[@id='continents']"));
		drdwn.click();
		Select sel = new Select(drdwn);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.xpath("//input[@id='photo']"));
		upload.sendKeys("C:\\\\Users\\\\Siva Sai\\\\Downloads\\\\1080x1920-420521-TV-Show-Batman-The-Animated-Series-Phone-Wallpaper.jpg");
		
	}

}
