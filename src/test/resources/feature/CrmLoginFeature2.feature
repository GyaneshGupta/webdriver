Feature: CRM login feature

#Scenario: Free CRM Login test scenario

#Given User is already on login page
#When User enter credentials
#Then Should display Home page
#Then close the browser

#Given User is already on login page
#When User enters "corpdevops@gmail.com" and "CrmPro123"
#Then Should display Home page
#Then close the browser


Scenario Outline: Free CRM Login test scenario

Given User is already on login page
When User enters credentials
	| username | password |
	| corpdevops@gmail.com | CrmPro123 |
Then Should display Home page
Then close browser

Examples:

| username | password |
| corpdevops@gmail.com | CrmPro123 |
| corpdevos@gmail.com | CrmPro123 |

#Given user logins with user, pwd
#And user is on homepage
#When user create contact