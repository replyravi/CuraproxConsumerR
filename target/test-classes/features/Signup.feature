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
   
   @Signuptest
Feature: Sign up with Email for All Country and Consumer Device Android


  
  Scenario Outline: Sign up with Email with South Africa
  Given Open the curaprox consumer application and  Select the country as South Africa
    And Tab Next button
    And Click on sign up with email
    Then Type email and password
    And Click on sign up button
    And Click on accept terms and conditions 
    Then Open Gmail and conform the link
    And Curaprox app open
    And Type first name and last name and click next button
    And Click on No, I have not been referred by anyone
    And Click on next button till profile page open
    And Click on my account right side corner in the application
    And Click on logout

   @Signuptestfacebook
  
  Scenario Outline: Sign up with facebook
  Given Open the curaprox consumer application and  Select the country as South Africa
    And Tab Next button
    And Click on sign up with facebook
    And Open facebook application
    Then Type facebook email and password
   Then Close the application
   
  

      
      
