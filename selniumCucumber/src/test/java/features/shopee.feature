Feature: Flipkart application

Scenario: Opens the page
Given user should navigate to the application
Given user moves cursor on Fashion
When user clicks on Mens Kurthas
Then Page should be opened

Scenario: NotOpens the page
Given user should navigate to the application
Given user moves cursor on Fashion
When user clicks on Mens Kurthas
But Page should Not be opened.