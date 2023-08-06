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
Feature: owner control panel
  I want to use this template for my feature file

  @tag1
  Scenario: show unpuplished housing of the owner
    Given the owner is logged in
    When enter number 5
    Then show all unpuplished houses 
    And check that are related to the owner

  @tag2
 Scenario: show puplished housing of the owner
    Given the owner is logged in
    When enter number 4
    Then show all puplished houses 
    And check that are related to the owner