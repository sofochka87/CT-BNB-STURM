package com.bnb.step_definitions;

import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import com.bnb.pages.SigninPage;
import com.bnb.utilities.BrowserUtils;
public class SPA1721_Login_Negative {

	@Then("Message status code should be {string}")
	public void message_status_code_should_be(String status_code){
		BrowserUtils.waitFor(2);
		SigninPage signinPage = new SigninPage();
		System.out.println(signinPage.message.getText());
        assertTrue(signinPage.message.getText().contains(status_code));
	}
}
