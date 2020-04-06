Feature: Logging into the Calendly website

Scenario Outline: Verify that the user can login into the website
	Given I open the website in a browser
	When I entered the <email-id> details and click on Continue button
	Then Password page is displayed
	When I entered the <Password> details and click on Log In button
	Then MyHome page displayed  