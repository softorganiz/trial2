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
@tag
Feature: admin acceptance
  I want to use this template for my feature file

  @tag1
  Scenario: admin accept house
    Given want to show waiting requests 
    And enter a valid id "1" house
    When he press 1 
    Then the house request is published to tenants
    And delete it from the waiting list

  @tag2
   Scenario: admin reject house
    Given want to show waiting requests 
    And enter a valid id "1" house 
    When he press 2
    Then the house request is deleted from the waiting list
    
      @tag3
  Scenario: admin enter unvalid id "id" house 
    Given want to show waiting requests 
    When  enter  unvalid id "1" house
    Then  give him a message that it is a false house id 
  
   
 