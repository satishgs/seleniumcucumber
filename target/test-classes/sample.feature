Feature: Sample Feature
	
@Sample-Test1
Scenario: Test-1
	Given something
	When an event occurs
	Then something else happens
	And I quit the browser

@Sample-Test2
Scenario: Test-2
	Given I am on the Google search page
	When I search for "Cheese!"
	Then the page title should start with "cheese"
	And I am on the lloyds banking page
	And I quit the browser
