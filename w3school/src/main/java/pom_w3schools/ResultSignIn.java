package pom_w3schools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultSignIn extends BaseW3Schools {

    @FindBy(xpath = "//input[@class='EmailInput_input_field__6t4Ux undefined']")
    public WebElement email;
    @FindBy(xpath = "//input[@class='PasswordInput_input_field__EWMIU undefined']")
    public WebElement password;
    @FindBy(xpath = "//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
    public WebElement logIn;
    @FindBy(xpath = "//div[@class='EmailInput_input_field_wrapper__eWcDI -fif_input_wrp EmailInput_error__mCGc7']//input")
    public WebElement resultLogIn;
    public ResultSignIn() {
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String INPUT1) {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(email));
        email.sendKeys(INPUT1);
    }
    public void enterPassword(String INPUT2) {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys(INPUT2);
    }
    public void clickLogIn() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        logIn.click();
    }


    public void doClickLogIn(String INPUT1,String INPUT2) {
        enterEmail(INPUT1);
        enterPassword(INPUT2);
        clickLogIn();
    }

}
