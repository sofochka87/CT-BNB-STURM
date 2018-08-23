Feature: Campus Information Verification
@smoke
Scenario Outline: Campus Verification
	Given The user is on login page 
	When The user enters credentials "<email>" and "<password>" 
	Then campus should be displayed  
	
	   Examples:
    | email                     |   password        |
    | jalabaster7f@drupal.org   |   terimapam       |
    | sdarben7g@alibaba.com     |   angiecoatham    |
    | aneagle7h@miibeian.gov.cn |   bennetttomanek  |
    
