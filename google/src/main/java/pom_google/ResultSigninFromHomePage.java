package pom_google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultSigninFromHomePage extends GoogleBaseSetup{

    @FindBy(xpath = "//button[@jsname='Cuz2Ue']")
    public WebElement forgotEmail;

    public ResultSigninFromHomePage(){
        PageFactory.initElements(driver,this);
    }



    public void clickOnForgotEmail(){

        wait.until(ExpectedConditions.elementToBeClickable(forgotEmail));
        forgotEmail.click();







    }}
