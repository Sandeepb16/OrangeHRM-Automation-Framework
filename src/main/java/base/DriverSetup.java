package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
public static WebDriver driver;
	
	public static WebDriver initDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
//			ChromeOptions options =new ChromeOptions();
//			options.addArguments("--headless=new");
//			driver = new ChromeDriver(options);
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
//			EdgeOptions options = new EdgeOptions();
//			options.addArguments("--headless=new");
//			driver = new EdgeDriver(options);
		}
		
		return driver;
	}
	
}
