package com.bnb.step_definitions;

import org.openqa.selenium.support.ui.Select;

import com.bnb.pages.HuntPage;
import com.bnb.pages.MapPage;
import com.bnb.utilities.BrowserUtils;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Then;

public class SPA1760_Room_Reservation_and_Cancelation {

	HuntPage huntPage = new HuntPage();

	@Then("Team lead clicks on Hunt for spot")
	public void team_lead_clicks_on_Hunt_for_spot() {
		BrowserUtils.waitFor(2);
		MapPage mapPage = new MapPage();
		mapPage.hunt.click();
	}

	@Then("Team lead chooses date and time")
	public void team_lead_chooses_date_and_time() {
		BrowserUtils.waitFor(5);
		huntPage.date.click();
		huntPage.date.sendKeys("2018-08-28");
		BrowserUtils.waitFor(2);
		Select time = new Select(huntPage.timeLine);
		time.selectByIndex(0);
		BrowserUtils.waitFor(5);
		Select timeFinish = new Select(huntPage.timeLineFinish);
		timeFinish.selectByIndex(3);
		BrowserUtils.waitFor(2);
		huntPage.submit.click();
		BrowserUtils.waitFor(5);
	}

	@Then("Team lead reserves the spot")
	public void team_lead_reserves_the_spot() {
		huntPage.booksButtons.get(2).click();
		BrowserUtils.waitFor(2);
		huntPage.submitReservation.click();
	}

	@Then("the reservation should be displayed")
	public void the_reservation_should_be_displayed() {
		assertTrue(huntPage.scheduledConference.isDisplayed());
	}

	@Then("Team lead cancels reservation")
	public void team_lead_cancel_reservation() {
		BrowserUtils.waitFor(3);
		huntPage.scheduledConference.click();
		BrowserUtils.waitFor(3);
		huntPage.cancelButton.click();		
	}
}
