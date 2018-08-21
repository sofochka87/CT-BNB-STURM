package com.bnb.step_definitions;

import com.bnb.pages.SelfPage;
import com.bnb.utilities.BrowserUtils;
import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Then;

public class User_Info_verification {

	@Then("The user clicks on link MY")
	public void the_user_clicks_on_link_MY() throws Exception {
		SelfPage selfPage = new SelfPage();
		BrowserUtils.waitFor(5);
		selfPage.goToSelf();
	}

	@Then("the user is on the my self page")
	public void the_user_is_on_the_my_self_page() throws Exception {
		SelfPage selfPage = new SelfPage();
		BrowserUtils.waitFor(2);
		selfPage.goToSelf();
	}
	
	@Then("The user {string} {string} {string} {string} {string} information should be displayed")
	public void the_user_information_should_be_displayed(String name, String role, String team, String batch, String campus) throws Exception {
		BrowserUtils.waitFor(2);
		SelfPage selfPage = new SelfPage();
		assertEquals(selfPage.name.getText(),name);
		assertEquals(selfPage.role.getText(), role);
		assertEquals(selfPage.team.getText(), team);
		assertEquals(selfPage.batch .getText(), batch);
		assertEquals(selfPage.campus.getText(), campus);
	}

	

}
