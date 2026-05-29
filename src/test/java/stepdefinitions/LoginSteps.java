package stepdefinitions;

import static org.testng.Assert.assertTrue;

import base.BaseClass;
import config.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginSteps {

	LoginPage loginPage;
	
	ConfigReader config = new ConfigReader();
	
	@Given("user launches browser")
	public void user_launches_browser() {
		BaseClass.browserSetup();
	}
	
	@When("user opens application")
	public void user_opens_application() {
		loginPage = new LoginPage(BaseClass.driver);
	}
	
	@And("user enters username and password")
	public void user_enters_username_and_password() {
		loginPage.enterUsername(config.getUsername());
		loginPage.enterPassword(config.getPassword());
	}
	
	@And("user clicks login button")
	public void user_clicks_login_button() {
		loginPage.clickLogin();
	}
	
	@Then("user should navigate to homepage")
	public void user_should_navigate_to_homepage() {
		String currentUrl = BaseClass.driver.getCurrentUrl();
		assertTrue(currentUrl.contains("dashboard"));
	}
}
