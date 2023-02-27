Feature: Test login Function https://www.saucedemo.com/

  Background:
    Given user opens browser and navigate to saucedemo.com


  Scenario Outline: check login function with valid credentials


    And enters valid "<username>" in username field
    And enters valid "<password>" in password field
    Then clicks on login button
    And user is navigated to home page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |


  Scenario Outline: check login function with invalid credentials

    And enters invalid "<username>" in username field
    And enters invalid "<password>" in password field
    Then clicks on login button
    And user sees an error message

    Examples:
      | username | password |
      | soni     | sdfgh    |
      | leti     | poiuyt   |
      | neena    | adfgh    |
