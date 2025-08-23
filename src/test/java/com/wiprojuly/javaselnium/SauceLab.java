package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLab {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		/*WebElement user = driver.findElement(By.name("user-name"));
		user.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);*/

		WebElement user1 = driver.findElement(By.name("user-name"));
		user1.sendKeys("problem_user");
		Thread.sleep(2000);
		WebElement pass1 = driver.findElement(By.id("password"));
		pass1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login1 = driver.findElement(By.id("login-button"));
		login1.click();
		Thread.sleep(2000);
		driver.close();

	}

}
