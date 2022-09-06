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
@Login
Feature: Login function for Curaprox Consumer

  Scenario Outline: Curaprox Consumer Login 
    Given Select South Africa
    Given Tab Next button
    Given Click on Sign In
    Then type email and password with <email> and <password>
    Then Click on Login 
    Then Click on My Account
    Then Click on Logout
    
  Examples:
    |email    |password|
    |curatest+rzsa378@morphos.is |Ringzero123 |


@LoginSlovenia
    Scenario Outline: Curaprox Consumer Login Slovenia 
    Given Select South Slovenia
    Given Tab Next button Slovenia
    Given Click on Sign In Slovenia
    Then Slovenia type email and password with <email> and <password>
    Then Click on Login Slovenia
    Then Click on My Account Slovenia
    Then Click on Logout Slovenia
    
  Examples:
    |email    |password|
    |curatest+rzsa378@morphos.is |Ringzero123 |

    
    
    