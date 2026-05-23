
Feature: Forgot Password Functionality
Scenario: Reset password with valid username
Given user is on login page
When user clicks forgot password link
And user enters valid username
And user clicks reset button
Then reset success message should display


