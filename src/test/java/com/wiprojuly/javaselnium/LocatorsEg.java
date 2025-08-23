package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsEg {

	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		username.sendKeys("Admin");
		Thread.sleep(1000);
	
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='pasword']"));
		password.sendKeys("admin123");
		Thread.sleep(1000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(1000);
		driver.close();
		
		
		

	}

}
