Feature: Free CRM login

  Scenario: Free CRM Login Test Scenario
    Given User is already on Login Page
    When title of the login page is Free CRM
    Then user enters username and password
    Then user clicks on login button
    Then user is on home page
