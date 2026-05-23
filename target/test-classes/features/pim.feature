@PIM
Feature: PIM Module

Scenario: Add a new employee

Given user logged into application
When user clicks PIM menu
And user clicks add employee button
And user enters employee details
And user clicks save employee button
Then employee should be added successfully


Scenario: Search employee by ID

Given user logged into application
When user clicks PIM menu
And user searches employee by ID "3456"
And user clicks employee search button
Then matching employee record should display


Scenario: Edit employee details

Given user logged into application
When user clicks PIM menu
And user edits employee details
Then employee details should update successfully


Scenario: Upload employee profile picture

Given user logged into application
When user clicks PIM menu
And user clicks add employee button
And user enters employee details
And user uploads employee profile picture
And user clicks save employee button
Then profile picture should upload successfully


Scenario: Delete employee record

Given user logged into application
When user clicks PIM menu
And user deletes employee record
Then employee record should be deleted successfully