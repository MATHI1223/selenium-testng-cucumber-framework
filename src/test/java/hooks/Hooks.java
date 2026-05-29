package hooks;

import io.cucumber.java.Scenario;

import base.BaseClass;
import config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Screenshot;

public class Hooks {
	

	@Before
	public void setup() {
		
		new ConfigReader();
		
		BaseClass.browserSetup();
	}
	
	
	
	@After
	public void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			Screenshot.captures(
					BaseClass.driver,
					scenario.getName());
		}
		
		BaseClass.browserClose();
	}
}
