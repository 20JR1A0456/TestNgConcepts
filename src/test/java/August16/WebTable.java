package August16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			// web driver manager - download,setup and maitanance of diff browsers
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://the-internet.herokuapp.com/tables");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			//WebElement table1 = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]"));
			
			//table1.getText();
			// find the rows present 
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr"));
			int rowsize = rows.size();
			System.out.println(rowsize);
					
		    List<WebElement> cols = driver.findElements(By.xpath("//table[@id = 'table1']/thead/tr[1]/th"));
			int colcount = cols.size();
			System.out.println(colcount);
			//text of aa cell
			WebElement celltext = driver.findElement(By.xpath("//table[@id = 'table2']/tbody/tr[4]/td[3]"));
			String actualcelltext = celltext.getText();
			String expectedcelltext = "tconway@earthlink.net";
			if(actualcelltext.equalsIgnoreCase(expectedcelltext)) {
				System.out.println("The text matches");
			}else {
				System.out.println("the text diesnot match");
			}
			
			

		}catch(Exception e) {
			System.out.println(e);
		}finally {
			driver.close();
		}

	}

}
