
Feature:  login feature

  Scenario: login successfully as admin
    Given that user is not logged in
    When username is "admin" which type is admin 
    And password is correct "IamAdmin"
    Then  logged in successfully
    
    
    Scenario: login faild as admin
    Given that user is not logged in
    When username is "admin" which type is admin
    And password is false "wrong"
    Then  log in faild
    
    
    
    Scenario: login successfully as tenant
    Given that user is not logged in
    When username is "sema" which type is tenant
    And password is correct "sema123"
    Then  logged in successfully
    
    
    Scenario: login faild as tenant
    Given that user is not logged in
    When username is "sema" which type is tenant
    And password is false "wrong"
    Then  log in faild
    
    
    
    Scenario: login successfully as owner
    Given that user is not logged in
    When username is "muna" which type is owner
    And password is correct "muna123"
    Then logged in successfully

     Scenario: login faild as owner
    Given that user is not logged in
    When username is "muna" which type is owner
    And password is false "wrong"
    Then  log in faild

    
    Scenario: adminType
    Given that admin is logged
	Then  type is admin
	
	
	Scenario: ownerType
    Given that owner is logged
	Then  type is owner
	
	Scenario: tenant Type
    Given that tenant is logged
	Then  type is tenant
	