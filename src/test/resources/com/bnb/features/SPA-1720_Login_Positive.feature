Feature: Positive Login verification
@smoke
Scenario Outline: Login with Valid credentials
    
    Given The user is on login page
    When The user enters credentials "<email>" and "<password>"
    Then The user should see map page
   
    Examples:
    | email                     |   password        |
    | jalabaster7f@drupal.org   |   terimapam       |
    | sdarben7g@alibaba.com     |   angiecoatham    |
    | aneagle7h@miibeian.gov.cn |   bennetttomanek  |