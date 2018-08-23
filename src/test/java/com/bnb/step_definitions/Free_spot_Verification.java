package com.bnb.step_definitions;

import static org.junit.Assert.assertTrue;

import com.bnb.pages.HuntPage;

import cucumber.api.java.en.Then;

public class Free_spot_Verification {

	@Then("Free spots should be displayed")
	public void free_spots_should_be_displayed() {
		HuntPage huntPage = new HuntPage();
		assertTrue(huntPage.freeSpots.isDisplayed());
		huntPage.rooms.forEach(room -> assertTrue(room.isDisplayed()));
	}
}
