Feature: Campus Information Verification with DataBase
@db
Scenario Outline: Campus Information Verification with DataBase
	Given The user is on login page 
	When The user enters credentials "<email>" and "<password>" 
	Then correct campus should be displayed for "<email>"  
	
	   Examples:
    | email                     |   password        |
    | jalabaster7f@drupal.org   |   terimapam       |
    | sdarben7g@alibaba.com     |   angiecoatham    |
    | aneagle7h@miibeian.gov.cn |   bennetttomanek  |