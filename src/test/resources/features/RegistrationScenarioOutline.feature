@sprint4
Feature: Registration Scenario Withoutline

  Scenario Outline: user want to create a account in amazon application user open application to create account
    								click accountandlist button and click create account button and input firstname and lastname and
    								email or phonenumber and password and confirm password and click create account button

    Given user open browser <browser> and give url <url> to open application
    And user click <account button> and <carteaccount button> to put valid information
    When user enter <firstname lastname> in yournamefield
    And user enter <email> in emailfield
    And user enter <password> in passwordfield
    And user enter <confirm password> in confirmpasswordfield
    And user click the create account button
    Then user close the application

    Examples: 
      | browser   |         url               | firstname lastname | email                    | password   | confirm password |
      | "Chrome"  | "https://www.amazon.com/" | "ashar alo"        | "ashaeralo@gmail.com"    | "a1234567" | "a1234567"       |
      | "Edge"    | "https://www.amazon.com/" | "suvo sokal"       | "suvosokal@gmail.com"    | "s1234567" | "s1234567"       |
      | "Firefox" | "https://www.amazon.com/" | "poronto bikel"    | "porontobikel@gmail.com" | "p1234567" | "p1234567"       |
