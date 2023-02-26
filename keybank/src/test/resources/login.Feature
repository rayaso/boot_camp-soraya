Feature: login feature


Background:
  Given user launch the browser and navigate to "https://www.saucedemo.com/"
  When user is in the login page with title "swag Labs"




  Scenario: login with valid credentials

    Then user enter username"standard_user"
    And user enter password"secret_sauce"
    Then user clicks on login button
    Then user logs in to the home page with "Products" header


  Scenario Outline: login with valid credentials

    Then user enter username"<username>"
    And user enter password"<password>"
    Then user clicks on login button
    Then error message will show"<errorMessage>"

    Examples:
      | username      | password     | errorMessage         |
      | standard_user |              | password is required |
      |               | secret_sauce | username is required |

