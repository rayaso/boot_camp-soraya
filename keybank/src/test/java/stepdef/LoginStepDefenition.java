package stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginStepDefenition {

WebDriver driver;
@Before
public void setUp(){
    driver=new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
@After
public void tearDown(){
    driver.quit();
}


    @Given("user launch the browser and navigate to {string}")
    public void user_launch_the_browser_and_navigate_to(String url) {
        driver.get(url);
    }

 /*   @Given("user launch the browser and navigate to{string}")
    public void user_launch_the_browser_and_navigate_to(String url) {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }*/





    @When("user is in the login page with title {string}")
    public void user_is_in_the_login_page_with_title(String title) {
        System.out.println("title:"+driver.getTitle() );
       Assert.assertEquals(driver.getTitle(),title);

    }

    @Then("user enter username{string}")
    public void user_enter_username(String username) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
    }

    @Then("user enter password{string}")
    public void user_enter_password(String password) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("user logs in to the home page with {string} header")
    public void user_logs_in_to_the_home_page_with_header(String expectedHeader) {
        String actualHeader=driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
        System.out.println("header:"+actualHeader);
        Assert.assertEquals(actualHeader,expectedHeader);
    }

    @Then("error message will show{string}")
    public void error_message_will_show(String expectedErrorMessage) {
        String actualErrorMessage=driver.findElement(By.xpath("//div[@class='error-message-container error']//h3")).getText();
        System.out.println("error message:"+actualErrorMessage);
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

    }
}
