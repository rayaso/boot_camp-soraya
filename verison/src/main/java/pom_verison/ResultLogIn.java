package pom_verison;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class ResultLogIn extends Base {

    @FindBy(xpath = "//input[@class='input-f'and@type='text']")
    public WebElement userID;

    @FindBy(xpath = "//input[@class='input-f'and@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn primary_black']")
    public WebElement login;


    @FindBy(xpath = "//div[@class='messageImage newErrorMessageImage']")
    public WebElement ResultLogin;


    public ResultLogIn() {
        PageFactory.initElements(driver, this);
    }

    public void enterUserID(String userId) {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(userID));
        userID.sendKeys(userId);
    }

    public void enterPassword(String passworD) {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys(passworD);
    }

    public void clickLogIn() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(login));
        password.click();
    }


    public void doLogIn(String userid, String passorD) {
        enterUserID(userid);
        enterPassword(passorD);
        clickLogIn();
    }

    public void actionLogInDataModel(String userid, String passorD) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        DataModelHacMap obj = new DataModelHacMap();

        String path = "C:\\Users\\soray\\OneDrive\\Documents\\datamodelverizon.xlsx";
        String sheet = "Sheet1";

        try {
            HashMap<String, String> testData = obj.readXl(path, sheet);
            String UId = testData.get("USERID");
            String PssW = testData.get("PASSWORD");

            enterUserID(UId);
            enterPassword(PssW);
            clickLogIn();

        } catch (IOException e) {

            e.printStackTrace();


        }

    }
}

