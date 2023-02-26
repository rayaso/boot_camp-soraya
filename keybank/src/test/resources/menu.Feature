Feature:  menu options


  Scenario: login with valid credentials
    Given user launch the browser and navigate to "https://www.saucedemo.com/"
    When user is in the login page with title "swag Labs"
    Then user enter username"standard_user"
    And user enter password"secret_sauce"
    Then user clicks on login button
    Then user logs in to the home page with "Products" header
    Then  user click on menu button
    Then user should see menu options as option
      | ALL ITEMS | ABOUT | LOGOUT | RESET APP STATE |