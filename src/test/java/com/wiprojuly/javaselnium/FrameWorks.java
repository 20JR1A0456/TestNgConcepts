package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWorks {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://jqueryui.com/droppable/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(Frame);
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
			act.dragAndDrop(drag, drop).perform();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
