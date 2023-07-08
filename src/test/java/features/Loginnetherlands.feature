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
 @LoginNetherlands
Feature: Login function for Curaprox Consumer
 
 
    Scenario Outline: Curaprox Consumer Login Netherlands 
    Given Select South Netherlands
    Given Tab Next button Netherlands
    Given Click on Sign In Netherlands
    Then Netherlands type email and password with <email> and <password>
    Then Click on Login Netherlands
    Then Click on My Account Netherlands
    Then Click on Logout Netherlands
    
  Examples:
    |email    |password|
    |curatest+rzsa378@morphos.is |Ringzero123 |
    
    
    
    