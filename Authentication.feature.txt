@Authentication 
Feature: To check the functionality of Login Authentication

@LoginSocVue
Scenario: 
	Given  User navigates to SocVue Portal and logins with "Http://www.google.com" 
	When   User enters userEntersSearchCriteria "Iphone5S"
	And    User selects the value from the suggestion dropdown
	Then   Clicks on OK button	
	
