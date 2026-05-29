package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
	
	public ConfigReader() {
		
		try {
			
			FileInputStream file = new FileInputStream("src/test/resources/config.properties");
			
			prop = new Properties();
			
			prop.load(file);
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public String getBrowser() {
		return prop.getProperty("browser");
	}
	
	public String getUrl() {
		return prop.getProperty("url");
	}
	
	public String getUsername() {
		return prop.getProperty("username");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	
}
