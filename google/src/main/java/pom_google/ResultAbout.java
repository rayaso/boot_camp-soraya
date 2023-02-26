package pom_google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultAbout extends GoogleBaseSetup{


    @FindBy(xpath = "//a[@href='./commitments/']")
    public WebElement viewCommitments;

    public ResultAbout(){
        PageFactory.initElements(driver,this);
    }



    public void clickOnViewCommitments(){

        wait.until(ExpectedConditions.elementToBeClickable(viewCommitments));
        viewCommitments.click();

    }



}
