package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverUtil {
 
	public static void click(WebDriver driver, By locator) {
		
		driver.findElement(locator).click();
	}
	
	public static void sendKeys(WebDriver driver, By locator, String value) {
		
		driver.findElement(locator).sendKeys(value);
	}
}
