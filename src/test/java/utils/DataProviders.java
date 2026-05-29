package utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="loginData")
	
	public Object[][] loginDataProvider(){
		
		return Excel.getExcelData();
	}
}

