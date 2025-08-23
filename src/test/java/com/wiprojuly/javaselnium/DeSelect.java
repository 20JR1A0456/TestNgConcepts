package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://grotechminds.com/multiple-select/?");
		//WebElement radiobutton = driver.findElement(By.xpath("//input[@value='radio3']"));
		//radiobutton.click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drdwn = driver.findElement(By.xpath("//select[@id = 'automobiles']"));
		Select s = new Select(drdwn);
		Thread.sleep(2000);
		s.selectByVisibleText("SUV");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.deselectByIndex(2);

	}

}
