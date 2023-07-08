#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@VerifyNotification
Feature: Login Curaprox Consumer and verify Notification, Sorting, Section and CuraPoint

Scenario Outline: Curaprox Consumer Login verify all function
  
Given Login Curaprox Consumer
Given Verify Notification Bar Open and click bell Icon verify notification and click back
Given Navigate to product page and verify sorting of product and click back
Given Navigate to my account and verify section and sub section screen and click back
Given Navigate to Cura Point section and verify 250CP received for onboarding process
  


    
    
    