Feature: Login Test

  @sprint1
  Scenario: As a tester I oen amazon application and I click accountandlist button
    				to enter my valid email and i click continue button to enter password 
    				and I click sing in button so that i can loged in

    Given I open amazon application
    And I click accountandlist button
    When I enter my valid email
    And I click countinue button
    And I enter my valid password
    And I click sing in button
    Then I can loged in
