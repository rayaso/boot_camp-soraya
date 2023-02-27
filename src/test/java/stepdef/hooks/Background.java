package stepdef.hooks;

import base.Base;
import config.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pom.HomePage;
import pom.ResultHomePage;

public class Background extends Base {
    //here we are just initiate classes because i need access for evrything inside every class
   public static HomePage home;
    public static ResultHomePage result;
    public static Config config;

    @Before
    public void setUp(){
        config=new Config();
    }

    @Given("user opens browser and navigate to saucedemo.com")
    public void user_opens_browser_and_navigate_to_saucedemo_com() {
        config=new Config();
        startBrowser(config.prop.getProperty("browser"),config.prop.getProperty("url"));
        home=new HomePage(driver);
        result=new ResultHomePage(driver);
    }

@After
    public void tearDown(){
        closeUp();
}
}
