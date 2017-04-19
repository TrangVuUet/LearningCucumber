Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

#Scenario: TO check that the Learn Software Testing page has loaded 
	#Given I navigate to Guru 
	#When I navigate to "Learn Software Testing" page 
	#Then the page title should be visible 
	
#Scenario: TO check that the Learn Cucumber Testing page has loaded 
	#Given I navigate to Guru 
	#When I navigate to "Learn Cucumber Testing" page 
	#Then the page title should be visible 
	
#Scenario: TO check that the Learn Agile Testing page has loaded 
	#Given I navigate to Guru 
	#When I navigate to "Learn Agile Testing" page 
	#Then the page title should be visible 
	
Scenario Outline: TO check that tutorial pages have loaded 
	Given I navigate to Guru 
	When I navigate to "<page>" page 
	Then the page title should be visible 
	Examples: Page titles 
		| page                   |
		| Learn Software Testing |
		| Learn Cucumber Testing |
		| Learn Agile Testing    |
	