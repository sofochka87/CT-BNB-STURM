Feature: Negative Login verification
@smoke
Scenario Outline: Login with Invalid credentials 
    Given The user is on login page
    When The user enters credentials "<email>" and "<password>"
    Then Message status code should be "422"
    Examples:
    | email                     |     password         |
    | jalabaster7f@ drupal.org  |     terimapam        |
    | jalabaster7f@drupal.org   |     teri mapam       |
    | invalidemail@com.com      |     terimapam        |
    | jalabaster7f@drupal.org   |     invalidpassword  |

