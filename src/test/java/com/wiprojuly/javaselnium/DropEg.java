package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropEg {

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
		WebElement drdwn = driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']"));
		Select sel = new Select(drdwn);
		sel.selectByVisibleText("Option1");
		Thread.sleep(2000);
		sel.selectByValue("option2");
		Thread.sleep(2000);
		sel.selectByIndex(3);

	}

}
