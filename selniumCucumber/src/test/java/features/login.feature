Feature: Bookcart application demo

Scenario:Login should be Unsucessful

Given user should navigate to the application
Given user clicks on the Login link
Given user enters the username "ortoni"
Given user enters the password "admin"
When user clicks the Login button
Then Login should be Unsucessful.