Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

Scenario: TO check that the WedDriver Cucumber tutorial main page has loaded
	Given I navigate to Guru
	When I navigate to "Learn Software Testing" page
	When I navigate to "Learn Cucumber Testing" page
	When I navigate to "Learn Agile Testing" page
	Then the page title should be visible
