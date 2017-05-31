Feature: BrokenLink Functionality 

Scenario Outline: To test the Broken Link 
	Given You are on Home "<page>" of lifexclusiv
	Then Check whether links are broken
	
	
	
	Examples: 
		| page                      |
		| http://www.lifexclusiv.com|
		|https://www.hdfclife.com   |
