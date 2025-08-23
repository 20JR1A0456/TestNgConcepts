package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElement {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
			Actions act = new Actions (driver);
			WebElement prime = driver.findElement(By.xpath("//span[normalize-space()='Prime']"));
			act.moveToElement(prime).perform();
			Thread.sleep(2000);
			WebElement joinnow = driver.findElement(By.xpath("//a[@href ='/prime']"));
			act.click(joinnow).perform();
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			driver.close();
		}

	}

}
