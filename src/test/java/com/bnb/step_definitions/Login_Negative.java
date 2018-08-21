package com.bnb.step_definitions;

import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import com.bnb.pages.SigninPage;
import com.bnb.utilities.BrowserUtils;
public class Login_Negative {

	@Then("Error Message status code should be {string}")
	public void error_Message_status_code_should_be(String status_code) throws Exception {
		BrowserUtils.waitFor(2);
		SigninPage signinPage = new SigninPage();
        assertTrue(signinPage.overlayContainer.getText().contains(status_code));
	}
}
