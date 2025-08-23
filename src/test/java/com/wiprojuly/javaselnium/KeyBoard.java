package com.wiprojuly.javaselnium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard {
	public static  WebDriver driver;

	public static void main(String[] args) {
		try {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			//Thread.sleep(2000);
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(1));
			wait.until(d -> email.isDisplayed());
			act.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
			Thread.sleep(2000);
			WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
			act.moveToElement(password).click().sendKeys("hi").release().build().perform();
			//Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			driver.close();
			
		}

	}

}
