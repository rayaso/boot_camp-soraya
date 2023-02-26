package pom_nike;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultSignInHomePage extends NikeBase{




    @FindBy(xpath = "//div[@class='nds-input-layout-control']//input")
    public WebElement emailAfterSgnIn;


    @FindBy(xpath = "//select[@name='country']")
    public WebElement changResultSignIn;

    public ResultSignInHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email){
       // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(emailAfterSgnIn));
        emailAfterSgnIn.sendKeys(email);


}

public void clickChangResultSignIn(){

    //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   wait.until(ExpectedConditions.elementToBeClickable(changResultSignIn));
        changResultSignIn.click();
}



}
