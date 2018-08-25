package com.bnb.step_definitions;

import static org.junit.Assert.assertEquals;

import com.bnb.pages.MapPage;
import com.bnb.utilities.BrowserUtils;
import com.bnb.utilities.DBUtils;

import cucumber.api.java.en.Then;

public class SPA1734_Campus_Verification_with_DB {

	@Then("correct campus should be displayed for {string}")
	public void correct_campus_should_be_displayed_for(String email) throws Exception {
		MapPage mapPage = new MapPage();
		BrowserUtils.waitFor(2);
		
		String query = "select location from campus where id = (select campus_id from users\n"
				+ "where email = '"+email+"');";
		String expectedCampus = (String) DBUtils.getCellValue(query);
		String actualCampus = mapPage.campus.getText();
		assertEquals("Campus name did not match", expectedCampus, actualCampus);
	}
}
