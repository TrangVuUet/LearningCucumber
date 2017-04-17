Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

Scenario: TO check that the WedDriver Cucumber tutorial main page has loaded
	Given I navigate to TheTestRoom.com
	When I navigate to Cucumber Tutorial page
	Then the page title should be visible
