#Author: mounamukhar@gmail.com
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

Feature: Title of your feature
  I want to use this template for my feature file
  
  Background: List of steps run before each of the scenarios
  	When facebook home page loaded
  	
  	@web
  Scenario: Facebook log in test
    Given I want to log into Facebook
    When I enter username as "cyborg"
    And I enter password as "Automation"
    Then I validate if I can login
    
     @web
  Scenario: Title of your scenario
    Given FB home page is open
    When User click on Sign Up without any data
    Then Error message displayed
  	


  

