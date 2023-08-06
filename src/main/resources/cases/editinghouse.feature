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
Feature: edit information for one house

  @tag
Scenario: Update house photo
Given The owner wants to update the photo of a house
And The owner enters the house ID "1"
When The owner provides the new photo information "new_photo"
Then The photo of the house with ID "1" is updated successfully

@tag
Scenario: Update house location
Given The owner wants to update the location of a house
And The owner enters the house ID "1"
When The owner provides the new location information "new_location"
Then The location of the house with ID "1" is updated successfully

@tag
Scenario: Update house available services
Given The owner wants to update the available services of a house
And The owner enters the house ID "1"
When The owner provides the new available services information "new_services"
Then The available services of the house with ID "1" are updated successfully

@tag
Scenario: Update house monthly rent
Given The owner wants to update the monthly rent of a house
And The owner enters the house ID "1"
When The owner provides the new monthly rent information "new_rent"
Then The monthly rent of the house with ID "1" is updated successfully

#@tag
#Scenario: Update house contact information
#Given The owner wants to update the contact information of a house
#And The owner enters the house ID "house_id"
#When The owner provides the new contact information "new_contact_info"
#Then The contact information of the house with ID "house_id" is updated successfully
#

  
  