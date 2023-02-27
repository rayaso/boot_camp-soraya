package tags;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/tags/tags.feature"},
        glue = {"tags"},
        tags = {"@SmokeTest"},//in case i need to run a test with its tag
        plugin = {"json:target/cucumber.json"/*,"pretty","html:target/cucumber-html-report.html"*/}/*this plugin
        for reporting we do not need dependencies caus it is already in cucumber*/
        //monochrome = true



)



public class RunnerClass {
}
