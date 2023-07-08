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
@DPChatfunction
Feature: User can navigate to connected DP chat screen from home screen and able to chat successfully

Scenario Outline: Consumer connected DP chat screen from home screen and able to chat successfully

Given Login Consumer application
Given Navigate to Dental Professional and search DP name Click on it
Given Click on connect option and Click on chat now option
Given Type text on chat box and verify chat receive to DP
Given Logout application

 
    
    
    