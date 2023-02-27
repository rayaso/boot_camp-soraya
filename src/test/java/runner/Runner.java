package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
   @CucumberOptions(
            features={"src/test/resources/Features/logIn.feature"},
            glue={"stepdef"},
            plugin={/*"json:target/cucumber.json"*/"pretty","html:target/cucumber-report.html"}

            )
public class Runner {

}
