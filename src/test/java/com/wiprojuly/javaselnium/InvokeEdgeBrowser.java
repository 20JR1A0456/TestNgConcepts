package com.wiprojuly.javaselnium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C://Users//Siva Sai//Downloads//edgedriver_win64//msedgedriver.exe");
		//EdgeOptions edgeOptions = new EdgeOptions();
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

	}

}
