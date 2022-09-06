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
   
@SloveniaSignuptest
Feature: Sign up with Email for All Country and Consumer Device Android

 
     Scenario Outline: Sign up with Email with Slovenia
  Given Open the curaprox consumer application and  Select the country as Slovenia
    And Tab Next button in slovenia region
    And Click on sign up with email slovenia region
    Then Type email and password slovenia region
    And Click on sign up button slovenia region
    And Click on accept terms and conditions slovenia region
    Then Open Gmail and conform the link slovenia region
    And Curaprox app open slovenia region
    And Type first name and last name and click next button slovenia region
    And Click on No, I have not been referred by anyone slovenia region
    And Click on next button till profile page open slovenia region
    And Click on my account right side corner in the application slovenia region
    And Click on logout slovenia region



      
      
