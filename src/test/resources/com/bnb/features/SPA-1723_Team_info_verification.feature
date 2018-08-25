Feature: Information Verification 

Scenario Outline: Team members Information Verification 
	Given The user is on login page 
	When The user enters credentials "jalabaster7f@drupal.org" and "terimapam" 
	Then the user is on the my team page  
	And The user "<name>" "<role>" should be displayed 
		
	Examples: 
		| name            |  role                |
		| Teri Mapam      |  student-team-leader |
		| Angie Coatham   |  student-team-member |
		| Bennett Tomanek |  student-team-member |
		| Mariann Dewi    |  student-team-member |
