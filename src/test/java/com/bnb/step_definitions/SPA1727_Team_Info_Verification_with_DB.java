package com.bnb.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.bnb.pages.TeamPage;
import com.bnb.utilities.DBUtils;

import cucumber.api.java.en.Then;

public class SPA1727_Team_Info_Verification_with_DB {

	@Then("team info should match the db records using {string}")
	public void team_info_should_match_the_db_records_using(String email) throws Exception {
		TeamPage teamPage = new TeamPage();

		List<String> actualNames = new ArrayList<>();
		for (WebElement el : teamPage.teamMemberNames) {
			actualNames.add(el.getText());
		}

		String query = "SELECT u1.firstname, u1.lastname, u1.role FROM users u1 INNER JOIN users u2 ON (u1.team_id = u2.team_id) where u2.email='"
				+ email + "';";

		System.out.println(query);
		List<Map<String, Object>> queryResult = DBUtils.getQueryResultMap(query);

		assertEquals(queryResult.size(), actualNames.size());

		for (Map<String, Object> map : queryResult) {
			String fullName = map.get("firstname") + " " + map.get("lastname");
			assertTrue(fullName + " was not found", actualNames.contains(fullName));
		}
	}
}
