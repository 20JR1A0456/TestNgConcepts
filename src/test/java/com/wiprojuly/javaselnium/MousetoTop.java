package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MousetoTop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		try {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
			Actions act = new Actions (driver);
			WebElement top = driver.findElement(By.xpath("//button[@id='mousehover']"));
			act.moveToElement(top).perform();
			Thread.sleep(2000);
			WebElement movetotop = driver.findElement(By.xpath("//a[@href='#top']"));
			act.click(movetotop).perform();
			String cUrl = driver.getCurrentUrl();
			if (cUrl.contains("#top")) {
			    System.out.println("Navigated to Top");
			} else {
			    System.out.println("URL did not change");
			}
			
			
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			
			driver.close();
			
		}

	}

}
