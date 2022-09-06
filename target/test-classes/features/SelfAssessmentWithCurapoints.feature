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
@AssessmentWithCurapoints
Feature: Login function for Curaprox Consumer verify selfAssessment successfully and should receive curapoints also

Scenario Outline: verify selfAssessment successfully and should receive curapoints also

Given Login to Curaprox Consumer app for verify selfAssessment successfully and should receive curapoints also
Given Click on Your Curapoints for verify user able to complete selfAssessment then click back
Given Click on bell Icon for verify user able to receive Curapoints regarding selfAssessment then click back
Then Logout the application


    
    
    