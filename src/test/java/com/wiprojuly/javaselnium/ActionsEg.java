package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ActionsEg {
	public static WebDriver driver;


	//public Actions(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	//}


	public static void main(String[] args) throws InterruptedException {
		try {

			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
		
			Actions act = new Actions (driver);
			
			WebElement sell = driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
			act.doubleClick(sell).perform();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(6000);
			
			WebElement mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
			act.contextClick(mobiles).perform();
			
		
			
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			driver.close();
		}
	
		

	}

}
