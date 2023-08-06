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
Feature: owner reservation
 

  @tag1
  Scenario: show owner his housing reservation  when thier is no reservation
    Given "sema" want to see my housing reservation thier is no reservation 
   
    Then display  nothing
   

  Scenario: show owner his housing reservation  
    Given "sema" want to see my housing reservation 
   
    Then display the owner housing reservation information
   
 