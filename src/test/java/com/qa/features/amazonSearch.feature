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
@web
Feature: Amazon website test
  I want to test multiple search on amazon.com


  @web
  Scenario Outline: 
    Given I want to make sure amazon home page open
    When I search for "<name>" as a product
    Then I verify result displayed "<status>" in step

    Examples: 
      | name  | status  |
      | B07TWFWJDZ | Success |
      | B07TWFW | Fail    |
      | B07TWF | Fail    |
