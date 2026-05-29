package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
public static void captures(WebDriver driver,String testName) {
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	
	File dest = new File("src/test/resources/screenshots/" + testName +"_"+timestamp+".png");
	
	try {
		
		FileUtils.copyFile(src, dest);
		
	}catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
}
