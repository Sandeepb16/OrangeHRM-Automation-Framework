@Admin
Feature: Admin Module

Scenario: Verify Admin page access after login

Given user logged into application
When user clicks Admin menu
Then Admin page should display


Scenario: Search user by username

Given user logged into application
When user clicks Admin menu
And user searches username "Admin"
And user clicks search button
Then matching user records should display


Scenario: Add a new user with valid details

Given user logged into application
When user clicks Admin menu
And user clicks add button
And user enters new user details
And user clicks save button
Then user should be added successfully


Scenario: Edit existing user details

Given user logged into application
When user clicks Admin menu
And user edits existing user
Then user details should update successfully


Scenario: Delete an existing user

Given user logged into application
When user clicks Admin menu
And user deletes existing user
Then user should be deleted successfully