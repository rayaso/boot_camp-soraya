package pom_amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AfterSignInInHomePage extends BaseSetupAmazon {


    @FindBy(xpath = "//h1")
    public WebElement resultTextAfterSgnIn;

    public AfterSignInInHomePage() {
        PageFactory.initElements(driver, this);
    }


}
