package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        features = {"src/test/resources/menu.Feature"},//PATH OF LOGIN FEATURE
        glue = {"stepdef"},//LOCATION OF STEP DFINITION
        tags = "",
        plugin = {},
        dryRun = true
)
public class Runner extends AbstractTestNGCucumberTests {




}
