package com.wipro.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgMultiple {
	@Test(priority=1)
	public void launchbrowser() {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	@Test(priority=0)
	public void testalerts() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
 
		WebDriverManager.chromedriver().setup();
 
		WebDriver driver = new ChromeDriver(chromeOptions);
 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// maximize the window
		driver.manage().window().maximize();
		// click on simple alert 
		WebElement simplealert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		simplealert.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		// click on ok button
		alt.accept();
		Thread.sleep(2000);

		// click on confirmational  alert 
		WebElement confirmalert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		confirmalert.click();
		Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
		// click on cancel  button
		alt1.dismiss();
		Thread.sleep(2000);
		// click on prompt   alert 
		WebElement pronmptalert = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		pronmptalert.click();
		Thread.sleep(2000);
		Alert alt2 = driver.switchTo().alert();
		// click on ok button
		String alerttext = alt2.getText();
		System.out.println(alerttext);
		alt2.sendKeys("Harsha");
		Thread.sleep(2000);
		alt2.accept();
		Thread.sleep(2000);
	}
	

}
