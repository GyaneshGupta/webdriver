@Functional
Feature: Handle CRM Deal Module

@RegressionTest
Scenario: Create Deal
Given User is logged in
When User creates a new deal


Scenario: View Deal details
Given User is logged in
When User view Deal details

#@After("@RegressionTest")
#Scenario: User Logout
#Given User logout




 