Feature: Team Lead Room Reservation and Cancellation 
	@temp
	Scenario: Room Reservation and cancellation
	Given  The user is on login page 
	When  The user enters credentials "jalabaster7f@drupal.org" and "terimapam" 
	Then  Team lead clicks on Hunt for spot 
	And  Team lead chooses date and time 
	And  Team lead reserves the spot
	Then Message status code should be "200"
    Then the reservation should be displayed
    And Team lead cancels reservation
    Then Message status code should be "200"
    
	