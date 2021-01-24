Feature: Free CRM login
   
 #     Scenario Outline: Free CRM Login Test Scenario
 #   Given User is already on Login Page
 #   When user enters username and password
 #   Then user clicks on login button
 #   Then user is on home page
    
Scenario: Free CRM Login Test Scenario

Given User is already on Login Page
When user enters "mailsaravana@gmail.com" and "Intel125$"
Then user clicks on login button
Then user is on home page

