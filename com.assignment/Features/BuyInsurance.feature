Feature:Buy Insurance Functionality 

Scenario Outline: To test the Buy Insurance Functionality 
	Given You are on Insurance plan "<page>"
	And You fill personal details
	And You choose the plan
	And You fill proposal form details
	
	
	
	Examples: 
		| page                                         |
		| https://www.hdfclife.com/term-insurance-plans|
