package com.bnb.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import com.bnb.pages.SelfPage;
import com.bnb.utilities.BrowserUtils;
import com.bnb.utilities.DBUtils;

import cucumber.api.java.en.Then;

public class SPA1726_User_Info_Verification_with_DB {

	@Then("user info should match the db records using {string}")
	public void user_info_should_match_the_db_records_using(String email) throws Exception {
		BrowserUtils.waitFor(10);
		String sql = "select firstname, lastname, role from users where email = '" + email + "';";
		System.out.println(sql);
		List<Map<String, Object>> result = DBUtils.getQueryResultMap(sql);
		// per requirements, we cannot have duplicated emails
		assertEquals("Returned multiple users with email: " + email, 1, result.size());

		Map<String, Object> map = result.get(0);

		String expectedFirstName = (String) map.get("firstname");
		String expectedLastName = (String) map.get("lastname");
		String expectedRole = (String) map.get("role");

		SelfPage selfPage = new SelfPage();

		BrowserUtils.waitFor(2);
		String aFirstname = selfPage.name.getText().split(" ")[0];

		String aLastname = selfPage.name.getText().split(" ")[1];

		String aRole = selfPage.role.getText();

		assertEquals(expectedFirstName, aFirstname);
		assertEquals(expectedLastName, aLastname);
		assertEquals(expectedRole, aRole);

	}
}
