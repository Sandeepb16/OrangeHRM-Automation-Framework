@Login
Feature: Login Functionality
Scenario: Login with valid credentials
Given user launches browser
When user enters valid username and password
And user clicks login button
Then user should navigate to dashboard
Scenario: Login with invalid username
Given user launches browser
When user enters invalid username and valid password
And user clicks login button
Then error message should be displayed
Scenario: Login with invalid password
Given user launches browser
When user enters valid username and invalid password
And user clicks login button
Then error message should be displayed
Scenario: Login with blank credentials
Given user launches browser
When user clicks login button
Then error message required should be displayed