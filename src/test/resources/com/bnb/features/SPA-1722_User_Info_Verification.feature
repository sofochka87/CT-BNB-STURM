Feature: Information Verification 

Scenario Outline: User Information Verification 
	Given The user is on login page 
	When The user enters credentials "jalabaster7f@drupal.org" and "terimapam" 
	Then the user is on the my self page 
	And The user "<name>" "<role>" "<team>" "<batch>" "<campus>" information should be displayed 
		
	Examples: 
		| name         |  role                | team    | batch  | campus       |
		| Teri Mapam   |  student-team-leader | TheCrew | #8     | VA           | 