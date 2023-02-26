package pom_carters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultSignIn extends Base{
    @FindBy(xpath = " //input[@class='form-control shared_input__2ZSeI']")
    public WebElement resultSignInEmail;


    public ResultSignIn() {
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String input){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(resultSignInEmail));
        resultSignInEmail.sendKeys(input);
    }


}
