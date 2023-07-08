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
   
@NetherlandsSignuptest
Feature: Sign up with Email for All Country and Consumer Device Android

     Scenario Outline: Sign up with Email with Netherlands
  Given Open the curaprox consumer application and  Select the country as Netherlands
    And Tab Next button in Netherlands region
    And Click on sign up with email Netherlands region
    Then Type email and password Netherlands region
    And Click on sign up button Netherlands region
    And Click on accept terms and conditions Netherlands region
    Then Open Gmail and conform the link Netherlands region
    And Curaprox app open Netherlands region
    And Type first name and last name and click next button Netherlands region
    And Click on No, I have not been referred by anyone Netherlands region
    And Click on next button till profile page open Netherlands region
    And Click on my account right side corner in the application Netherlands region
    And Click on logout Netherlands region

  

      
      
