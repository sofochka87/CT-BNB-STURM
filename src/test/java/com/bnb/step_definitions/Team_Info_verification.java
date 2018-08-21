package com.bnb.step_definitions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import com.bnb.pages.SelfPage;
import com.bnb.pages.TeamPage;
import com.bnb.utilities.BrowserUtils;
import cucumber.api.java.en.Then;

public class Team_Info_verification {

	@Then("the user is on the my team page")
	public void the_user_is_on_the_my_team_page() throws Exception {
		SelfPage selfPage = new SelfPage();
		BrowserUtils.waitFor(5);
		selfPage.goToTeam();
		BrowserUtils.waitFor(2);

	}

	@Then("The user {string} {string} should be displayed")
	public void the_user_should_be_displayed(String name, String role) throws Exception{
		TeamPage teamPage = new TeamPage();
		
		List<String> listOfActualNames = new ArrayList<>();
		teamPage.teamMemberNames.forEach(actualName -> listOfActualNames.add(actualName.getText()));
		assertTrue(listOfActualNames.contains(name));
		
		List<String> listOfActualRoles = new ArrayList<>();
        teamPage.teamMemberRoles.forEach(actualRole -> listOfActualRoles.add(actualRole.getText()));
        assertTrue(listOfActualRoles.contains(role));

	}

}
