package com.wiprojuly.javaselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions(); 
		// web driver manager - download,setup and maitanance of diff browsers
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		WebElement fileupload = driver.findElement(By.xpath("//input [@id='file-submit']"));
		fileupload.sendKeys("C:\\Users\\Siva Sai\\Downloads\\1080x1920-420521-TV-Show-Batman-The-Animated-Series-Phone-Wallpaper.jpg");
		WebElement submit = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!]"));
		submit.click();
		WebElement validationmsg = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!"));
		if(validationmsg.isDisplayed()) {
			System.out.println("The message is properly displayed");
		}else {
			System.out.println("The message is not properly dispalyed");
		}

	}

}
