package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import utils.TestListener;
import org.testng.annotations.Test;

import page.LoginPage;
import utils.DataProviders;
import base.BaseClass;

@Listeners(TestListener.class)
public class LoginTest extends BaseClass {
	
	@Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
	
	public void loginTest(String username,String password) {
		
		browserSetup();
		
		LoginPage loginPage= new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
		String currentUrl = driver.getCurrentUrl();
		
		Assert.assertTrue(currentUrl.contains("dashboard"));
		
		browserClose();
	}

}
