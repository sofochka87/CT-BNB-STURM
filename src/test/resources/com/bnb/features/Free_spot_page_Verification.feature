Feature: Free Spot Verification 

	Scenario: Room Reservation and cancelation
	Given  The user is on login page 
	When  The user enters credentials "jalabaster7f@drupal.org" and "terimapam" 
	Then  Team lead clicks on Hunt for spot 
	And  Team lead chooses date and time 
	Then  Free spots should be displayed