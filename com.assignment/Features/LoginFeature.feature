Feature: Login Functionality 

Scenario Outline: To test the login functionality 
	Given You are on Login "<page>" of hdfclife
	And you enter valid "<username>" and "<password>"
	And  Click on Login Button
	Then Check whether Login Details are Correct
	
	
	
	Examples: 
		| page                                              |username|password   |
		| https://cp.hdfclife.com/cpweb/login.aspx#collapse2|ashwin  |karangutkar|
