Feature: Test login Function https://www.saucedemo.com/

  Scenario: check login function with valid credentials

    Given user opens browser and navigate to saucedemo.com
    And enters valid username
    And enters valid password
    Then clicks on login button
    And user is navigated to home page
