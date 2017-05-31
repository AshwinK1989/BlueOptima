Feature: Signup Functionality 

Scenario Outline: To test the signup functionality 
	Given You are on Login "<page>" of hdfclife
	Then Go to registration page
	
	
	
	Examples: 
		| page                                              |
		| https://cp.hdfclife.com/cpweb/login.aspx#collapse2|
