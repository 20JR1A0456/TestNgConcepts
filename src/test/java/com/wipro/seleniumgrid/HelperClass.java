
	package com.wipro.seleniumgrid;
	 
	import java.net.MalformedURLException;

	import java.net.URL;
	 
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

	import org.testng.annotations.AfterMethod;

	import org.testng.annotations.BeforeMethod;
	 
	public class HelperClass {
	 
		// remote web driver to support remote computers and browsers

		// Thread local is for the parallel execution support
	 
		protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	 
		public static String remote_url = "http://192.168.79.96:4444";
	 
		@BeforeMethod

		public void setDriver() throws MalformedURLException, InterruptedException {
	 
			EdgeOptions options = new EdgeOptions();
			
			

			driver.set(new RemoteWebDriver(new URL(remote_url), options));

			driver.get().get("https://opensource-demo.orangehrmlive.com/");

			driver.get().manage().window().maximize();
			Thread.sleep(2000);
			FirefoxOptions options1 = new FirefoxOptions();
			driver.set(new RemoteWebDriver(new URL(remote_url), options1));
			driver.get().get("https://opensource-demo.orangehrmlive.com/");
			driver.get().manage().window().maximize();
			Thread.sleep(2000);
			//@SuppressWarnings("unused")
			ChromeOptions option2 = new ChromeOptions(); 
			driver.set(new RemoteWebDriver(new URL(remote_url), option2));
			driver.get().get("https://opensource-demo.orangehrmlive.com/");
			driver.get().manage().window().maximize();
			Thread.sleep(2000);
	 
		}
	 
		public WebDriver getDriver() {

			return driver.get();

		}
	 
		@AfterMethod

		public void closeBrowser() {

			//driver.get().quit();

			//driver.remove();

		}
	 
	}

	 



