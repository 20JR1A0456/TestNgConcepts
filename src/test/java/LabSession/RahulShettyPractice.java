package LabSession;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RahulShettyPractice {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//img[@class='logoClass']"));
		if(logo.isDisplayed()) {
			System.out.println("The logo is visible");
		}else {
			System.out.println("Logo is  not visible");
		}
		
		List<WebElement>radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
		int size = radio.size();
		System.out.println(size);
		for(int i = 0; i<size;i++) {
			radio.get(i).click();
		}
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		int size1 = chkboxes.size();
		System.out.println(size1);
		for(int i = 0; i<size1; i++) {
			Thread.sleep(2000);
			chkboxes.get(i).click();
		}
		Thread.sleep(2000);
		//Switch Window Example
		/*WebElement window = driver.findElement(By.xpath("//button[@id='openwindow']"));
		Actions act = new Actions(driver);
		act.moveToElement(window).click().perform();
		Thread.sleep(2000);
		//Switch Tab Example.
		WebElement opentab = driver.findElement(By.xpath("//a[@id='opentab']"));
		act.moveToElement(opentab).click().perform();
		
		//Alert examples 
		
		WebElement alert = driver.findElement(By.xpath("//input[@id='name']"));
		alert.sendKeys("Siva");
		
		WebElement simplealert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		simplealert.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		confirm.click();
		Thread.sleep(2000);
		alt.accept();*/
		//Hide and Show Elements
		WebElement display = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		display.sendKeys("BATMAN");
		Thread.sleep(2000);
		WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();
		Thread.sleep(2000);
		WebElement show = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		show.click();
		
		
		
		
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			driver.close();
		}

	}

}
