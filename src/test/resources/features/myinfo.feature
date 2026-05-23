@MyInfo
Feature: My Info Module

Scenario: Verify My Info page access

Given user logged into application
When user clicks My Info menu
Then My Info page should display


Scenario: Update personal details

Given user logged into application
When user clicks My Info menu
And user updates personal details
And user clicks personal details save button
Then personal details should update successfully


Scenario: Update contact details

Given user logged into application
When user clicks My Info menu
And user clicks contact details section
And user updates contact details
And user clicks contact save button
Then contact details should update successfully



Scenario: Save and verify updated information

Given user logged into application
When user clicks My Info menu
And user updates personal details
And user clicks personal details save button
And user clicks contact details section
And user updates contact details
And user clicks contact save button
Then updated information should be displayed successfully