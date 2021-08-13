@End-to-End
Feature: Handle CRM Contact Module

@RegressionTest
Scenario: Create contact
Given User is logged in
When User creates a new contcat

@RegressionTest
Scenario: View contact details
Given User is logged in
When User view contact details

@SmokeTest @RegressionTest
Scenario: Edit contact details
Given User is logged in
When User edit contact details


Scenario: Delete contact details
Given User is logged in
When User delete a contact

@RegressionTest
Scenario: User Logout
Given User logout


 