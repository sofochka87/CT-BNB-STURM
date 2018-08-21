Feature: Information Verification with DataBase
@db  @temp
Scenario Outline: Team members Information Verification with DataBase
	Given The user is on login page 
	When The user enters credentials "<email>" and "<password>" 
	Then the user is on the my team page  
	Then team info should match the db records using "<email>" 
	
	   Examples:
    | email                     |   password        |
    | jalabaster7f@drupal.org   |   terimapam       |
    | sdarben7g@alibaba.com     |   angiecoatham    |
    | aneagle7h@miibeian.gov.cn |   bennetttomanek  |