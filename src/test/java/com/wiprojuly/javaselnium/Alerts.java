package com.wiprojuly.javaselnium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//WebElement radiobutton = driver.findElement(By.xpath("//input[@value='radio3']"));
		//radiobutton.click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement simplealert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		simplealert.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		
		
		WebElement confirmalert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		confirmalert.click();
		Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		Thread.sleep(2000);
		
		WebElement promptalert = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		promptalert.click();
		Thread.sleep(2000);
		Alert alt2 = driver.switchTo().alert();
		String alerttext = alt2.getText();
		System.out.println(alerttext);
		alt2.sendKeys("Siva");
		alt2.accept();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		

	}

}
