package com.wiprojuly.javaselnium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiRadio {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebElement radiobutton = driver.findElement(By.xpath("//input[@value='radio3']"));
		//radiobutton.click();
		driver.manage().window().maximize();
		List<WebElement>radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
		int size = radio.size();
		System.out.println(size);
		for(int i = 0; i<size;i++) {
			radio.get(i).click();
		}

	}

}
 