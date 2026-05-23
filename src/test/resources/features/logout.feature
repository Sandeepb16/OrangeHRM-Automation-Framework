@Logout
Feature: Logout Module

Scenario: Verify logout functionality

Given user logged into application
When user clicks profile dropdown
And user clicks logout option
Then user should navigate to login page


Scenario: Verify session termination after logout

Given user logged into application
When user clicks profile dropdown
And user clicks logout option
And user clicks browser back button
Then user should not access application pages