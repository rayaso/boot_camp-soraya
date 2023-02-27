package stepdef;

import base.Base;
import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pom.HomePage;
import pom.ResultHomePage;

import static stepdef.hooks.Background.home;
import static stepdef.hooks.Background.config;
import static stepdef.hooks.Background.result;


public class LoginSteps extends Base {
   /* @And("enters valid username")
    public void enters_valid_username() {
home.enterUsername(config.prop.getProperty("username"));
    }*/

    @And("enters valid {string} in username field")
    public void entersValidInUsernameField(String username) {
        home.enterUsername(username);
    }

   /* @And("enters valid password")
    public void enters_valid_password() {
        home.enterPassword(config.prop.getProperty("password"));
    }*/

    @And("enters valid {string} in password field")
    public void entersValidInPasswordField(String password) {
        home.enterPassword(password);
    }

    @Then("clicks on login button")
    public void clicks_on_login_button() {
home.clickLogin();
    }


    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        Assert.assertEquals("PRODUCTS",result.userTextVerify());
//closeUp();
    }


    @And("enters invalid {string} in username field")
    public void entersInvalidInUsernameField(String username) {
        home.enterUsername(username);
    }

    @And("enters invalid {string} in password field")
    public void entersInvalidInPasswordField(String password) {
        home.enterPassword(password);

    }

    @And("user sees an error message")
    public void userSeesAnErrorMessage() {
Assert.assertTrue(isElementVisible(result.resultLogInFailed));


    }
}
