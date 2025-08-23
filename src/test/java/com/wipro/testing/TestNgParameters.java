package com.wipro.testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgParameters {
	@Parameters({ "browser", "platform" })
	@Test
	public void testparameters(String browser, String platform) {
		if (browser.equals("chrome")) {
			if(platform.equals("widnows")) {
			ChromeOptions chromeOptions = new ChromeOptions();
 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			}
		}else {
			System.setProperty("webdriver.edge.driver", "C://Users//Siva Sai//Downloads//edgedriver_win64//msedgedriver.exe");
			//EdgeOptions edgeOptions = new EdgeOptions();
			//WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}

	}	

}
