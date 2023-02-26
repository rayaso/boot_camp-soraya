package pom_google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultStore extends GoogleBaseSetup{



    @FindBy(xpath = " //button[@class='subscribe btn cta-shop']")
    public WebElement signIn;
    public ResultStore(){
        PageFactory.initElements(driver,this);
    }



    public void clickOnSignIn(){

        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();

    }







    }
