package tags;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

    @Given("we add tags")
    public void we_add_tags() {
        System.out.println("one");
    }



    @When("added properly")
    public void added_properly() {
        System.out.println("two");
    }



    @Then("it works")
    public void it_works() {
        System.out.println("three");
    }



    }











