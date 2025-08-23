package com.wiprojuly.javaselnium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebElement radiobutton = driver.findElement(By.xpath("//input[@value='radio3']"));
		//radiobutton.click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		//fetch the current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//close the current window
		driver.close();
		

	}

}
