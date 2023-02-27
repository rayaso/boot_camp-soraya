$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/logIn.feature");
formatter.feature({
  "name": "Test login Function https://www.saucedemo.com/",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "check login function with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enters valid \"\u003cusername\u003e\" in username field",
  "keyword": "And "
});
formatter.step({
  "name": "enters valid \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user is navigated to home page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens browser and navigate to saucedemo.com",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.hooks.Background.user_opens_browser_and_navigate_to_saucedemo_com()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check login function with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enters valid \"standard_user\" in username field",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.entersValidInUsernameField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters valid \"secret_sauce\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.entersValidInPasswordField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to home page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.user_is_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "check login function with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enters invalid \"\u003cusername\u003e\" in username field",
  "keyword": "And "
});
formatter.step({
  "name": "enters invalid \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user sees an error message",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "soni",
        "sdfgh"
      ]
    },
    {
      "cells": [
        "leti",
        "poiuyt"
      ]
    },
    {
      "cells": [
        "neena",
        "adfgh"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens browser and navigate to saucedemo.com",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.hooks.Background.user_opens_browser_and_navigate_to_saucedemo_com()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check login function with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enters invalid \"soni\" in username field",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.entersInvalidInUsernameField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters invalid \"sdfgh\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.entersInvalidInPasswordField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees an error message",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.userSeesAnErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens browser and navigate to saucedemo.com",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.hooks.Background.user_opens_browser_and_navigate_to_saucedemo_com()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check login function with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enters invalid \"leti\" in username field",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.entersInvalidInUsernameField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters invalid \"poiuyt\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.entersInvalidInPasswordField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees an error message",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.userSeesAnErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens browser and navigate to saucedemo.com",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.hooks.Background.user_opens_browser_and_navigate_to_saucedemo_com()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check login function with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enters invalid \"neena\" in username field",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.entersInvalidInUsernameField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters invalid \"adfgh\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.entersInvalidInPasswordField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees an error message",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.LoginSteps.userSeesAnErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});