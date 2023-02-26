package pom_automation_scalduplit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultClickMyAccount extends BaseSetup{

    @FindBy(xpath = "//input[@type='email']")
    WebElement enterEmail;
    @FindBy(xpath = "//input[@type='password'and@autocomplete='new-password']")
    WebElement enterPassword;

    @FindBy(xpath = "//button[@value='Register']")
    WebElement clickRegister;
    @FindBy (id = "username")
    public WebElement usernameField;

    @FindBy (id = "password")
    public WebElement passwordField;

    @FindBy (name = "login")
    public WebElement logInButton;

    public ResultClickMyAccount() {
        PageFactory.initElements(driver, this);
    }


    public void enterEmail(String email) {
        enterEmail.sendKeys(email);
    }





    public void enterPassword(String password) {
        enterPassword.sendKeys(password);

    }





    public void clickOnRegisterButton() {
        clickRegister.click();
    }







    public void  doClick(String email,String password ){
        enterEmail(email);
        enterPassword(password);
        clickOnRegisterButton();}

        public void inputUsername(String username){

            usernameField.sendKeys(username);

        }

        public void inputPassword(String password){

           passwordField.sendKeys(password);

        }

        public void clickLogInButton(){

           logInButton.click();

        }

        public void logIn(String username, String password){

            inputUsername(username);
            inputPassword(password);
            clickLogInButton();






    }





}






