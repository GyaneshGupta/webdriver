Feature: Google page
This feature is for verifying Google page 

  
  Scenario: Search Java Tutorial 
  Given I launch google page
  When I Search Java Tutorial
  Then should display java result page
  And close the browser
  
  
  Scenario: Search Selenium Tutorial 
  Given I launch google page
  When I Search Selenium Tutorial
  Then should display Selenium result page
  And close the browser