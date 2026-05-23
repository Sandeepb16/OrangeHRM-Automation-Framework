package hooks;

import org.openqa.selenium.WebDriver;

import base.ConfigLoader;
import base.DriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	
	@Before
	public void Setup() {
		
	ConfigLoader Config =  new ConfigLoader();
	driver = DriverSetup.initDriver(Config.getBrowser());
	driver.get(Config.getUrl());
	driver.manage().window().maximize();
	
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
