package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayPicker {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://ui.shadcn.com/docs/components/date-picker");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement date1 = driver.findElement(By.id("//input[@id = 'date']"));
		date1.click();
		Thread.sleep(2000);
		WebElement date11 = driver.findElement(By.xpath("//option[@value = '0']"));
		date11.click();
		Thread.sleep(2000);
		
		WebElement date13 = driver.findElement(By.xpath("//option[@value ='2025']"));
		date13.click();
		WebElement date12 = driver.findElement(By.xpath("//value[@data-day = '11/1/2025']"));
		//date11.click();
		date12.click();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		/*WebElement dd = driver.findElement(By.xpath("//button[@ type = 'button']"));
		dd.click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//button[@aria-label='Monday, August 18th, 2025, selected']"));
		date.click();
		Thread.sleep(2000);
		WebElement date2 = driver.findElement(By.xpath("//button[@aria-label='Wednesday, August 20th, 2025, selected']"));
		date2.click();*/
		
		

	}

}
