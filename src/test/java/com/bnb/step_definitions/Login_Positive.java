package com.bnb.step_definitions;

import com.bnb.pages.MapPage;
import com.bnb.pages.SigninPage;
import com.bnb.utilities.ConfigurationReader;
import com.bnb.utilities.Driver;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Positive {

	@Given("The user is on login page")
	public void the_user_is_on_login_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@When("The user enters credentials {string} and {string}")
	public void the_user_enters_credentials_and(String email, String password) throws Exception {
		SigninPage signinPage = new SigninPage();
		signinPage.email.sendKeys(email);
		signinPage.password.sendKeys(password);
		signinPage.signInButton.click();
	}

	@Then("The user should see map page")
	public void the_user_should_see_map_page() throws Exception {
		MapPage mapPage = new MapPage();
		assertTrue(mapPage.campus.isDisplayed());
	}
}
