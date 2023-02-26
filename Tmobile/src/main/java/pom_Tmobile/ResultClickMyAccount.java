package pom_Tmobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultClickMyAccount extends Base{

    @FindBy(xpath = "//a[@href='/signin?state=eyJpbnRlbnQiOiJMb2dpbiIsImJvb2ttYXJrVXJsIjoiaHR0cHM6Ly93d3cudC1tb2JpbGUuY29tL2FjY291bnQvZGFzaGJvYXJkIn0=&INTNAV=tNav:LogIn']")
    public WebElement logIn;

    public ResultClickMyAccount() {
        PageFactory.initElements(driver, this);
    }

    public ResultClickLogin clickLogIn() {
         //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        logIn.click();
        return new ResultClickLogin();
    }
}
