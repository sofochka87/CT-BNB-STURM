package com.bnb.step_definitions;

import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import com.bnb.pages.MapPage;
import com.bnb.utilities.BrowserUtils;
public class SPA1732_Campus_Verification {

	@Then("campus should be displayed")
	public void campus_should_be_displayed() throws Exception {
		MapPage mapPage = new MapPage();
		BrowserUtils.waitFor(5);
		assertEquals("VA",mapPage.campus.getText());
	}
	
	
}
