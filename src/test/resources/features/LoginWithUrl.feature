
@sprint2
Feature: Login With Url Test


  Scenario: user open amazon application and click accountandlist button and user enter
    			valid Email or mobile phone number and user click continue button and 
    			user enter valid password and user click sing in button user can loged in
    			
    Given user open browser "sokal" and enter url "https://www.amazon.com/"
    And user click accountandlist button
    When user enter email "suvo@gmail.com"
    And user click countinu button
    And user enter password "m123456789"
    And user click on sing in button
    Then user logged in amazon
    
      Scenario: user open amazon application and click accountandlist button and user enter
    			valid Email or mobile phone number and user click continue button and 
    			user enter valid password and user click sing in button user can loged in
    			
    Given user open browser "Edge" and enter url "https://www.amazon.com/"
    And user click accountandlist button
    When user enter email "suvo@gmail.com"
    And user click countinu button
    And user enter password "m123456789"
    And user click on sing in button
    Then user logged in amazon
