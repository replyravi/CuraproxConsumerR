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
##Given Tab Next button
   ## Given Click on Sign In
    ##Then Type email and password with <email> and <password>
    ##Then Click on Login 
    ##Then Come to lesson to recommend section and select one lesson
@lessonComplete
Feature: Curaprox Continue Your Lesson

  Scenario Outline: Curaprox Login with email Id South Africa Location
    Given Login to Curaprox
    Given Verify Continue Your Lesson
    Given Navigate to MY CURAPOINTS  get text Complete Educational Content and get text Complete Educational Content Correctly
    Given Log out application
  ##Examples:
    ##|email    |password|
   ## |curatest+rzsa211@morphos.is |Ringzero123 |
