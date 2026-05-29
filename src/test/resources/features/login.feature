Feature: Login Functionality

@smoke
Scenario: validating login

Given user launches browser
When user opens application
And user enters username and password
And user clicks login button
Then user should navigate to homepage