package base;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigLoader {
	
	Properties propertyProperties;
	
	public ConfigLoader() {
		
		try {
			propertyProperties = new Properties();
			FileInputStream File = new FileInputStream("C:\\Users\\4sand\\eclipse-workspace\\CapstoneProject\\src\\test\\resources\\config\\config.properties");
			propertyProperties.load(File);
	
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public String getBrowser() {
		return propertyProperties.getProperty("browser");
	}
	
	public String getUrl() {
		return propertyProperties.getProperty("url");
	}
	
	public String getUsername() {
		return propertyProperties.getProperty("username");
	}
	
	public String getPassword() {
		return propertyProperties.getProperty("password");
	}
	
	public String getHeadless() {

	    return propertyProperties.getProperty("headless");
	}
	
}
