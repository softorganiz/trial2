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
Feature: owner add house
  I want to use this template for my feature file

  @tag
 Scenario: Add a new house with unique ID to the waiting list.

Given The owner wants to add a new house to the waiting list.
When The owner provides all the necessary information (ID, location, number of floors, bedrooms, bathrooms, monthly rent, etc.).
Then The new house is successfully added to the waiting list, and the waiting list contains the new house.

 

 @tag
Scenario: Add multiple houses to the waiting list.

Given The owner wants to add multiple houses to the waiting list.
When The owner provides the information for each house (unique IDs, locations, number of floors, bedrooms, bathrooms, monthly rent, etc.).
Then Each new house is successfully added to the waiting list, and the waiting list contains all the new houses.