package stepdef;

import cucumber.api.java.en.Then;
import gherkin.ast.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class MenuStepDef {
//here we hve just 2 steps that we added in menu otherwise we have everything from login ,everything is same

    WebDriver driver;

    @Then("user click on menu button")
    public void user_click_on_menu_button() {
  driver.findElement(By.xpath("")).click();
    }

    @Then("user should see menu options as option")
    public void user_should_see_menu_options_as_option(DataTable expectedMenuOptions) {
       // List<String> menuOptions=expectedMenuOptions.
        Assert.assertEquals(driver.findElement(By.xpath("")).getText(),"");
        Assert.assertEquals(driver.findElement(By.xpath("")).getText(),"");
     Assert.assertEquals(driver.findElement(By.xpath("")).getText(),"");
 Assert.assertEquals(driver.findElement(By.xpath("")).getText(),"");
}






}
