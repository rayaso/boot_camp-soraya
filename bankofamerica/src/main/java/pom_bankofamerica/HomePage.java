package pom_bankofamerica;

import bankofamerica.com.DataProviderExample;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class HomePage extends BaseBankOfAmerica{

    @FindBy(xpath = "//input[@id='onlineId1']")
    public WebElement userID;

    @FindBy(xpath = "//input[@id='passcode1']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='signIn']")
    public WebElement logIn;

    @FindBy(xpath = "//div[@class='ico-bg']")
    public WebElement redIconError;


    @FindBy(xpath = "//button[@='global-search-button']//span[1]//span[1]")
    public WebElement search;

    @FindBy(xpath = "//button[@id='global-search-button']//span[1]//span[1]")
    public WebElement searchWithoutRetry;

    @FindBy(xpath = " //input[@id='nav-search-query']")
    public WebElement resultSearch;


    @FindBy(xpath = "//a[@id='navCreditCards']//span[3]")
    public WebElement creditCards;


    @FindBy(xpath = "//a[@id='btnCompareCreditCards']")
    public WebElement creditCardsResult;

    @FindBy(xpath = "//a[@id='navHomeLoans']")
    public WebElement homeLoans;
    @FindBy(xpath = "//a[@id='mortgage']")
    public WebElement resultHomeLoans;

    @FindBy(xpath = "//a[@id='navSavings']//span[3]")
    public WebElement savings;
    @FindBy(xpath = "//a[@id='navSavingsOnlineBanking']")
    public WebElement resultSavings;

    @FindBy(xpath = " //div[@class='columns small-10 small-push-1 medium-8 medium-push-2 explore-container']//a[2]")
    public WebElement VisitBetterMoneyHabits;
    @FindBy(xpath = "//h1[@class='heading-latest__text headline-display--sm heading--text-blue heading--align-left']")
    public WebElement resultVisitBetterMoneyHabits;

    @FindBy(xpath = "//a[@id='NAV_HELP']")
    public WebElement help;

    @FindBy(xpath = "//a[@href='https://secure.bankofamerica.com/mycommunications/public/appointments/getTopics.go?marketingCode=NEWHP_ECHMPG'and@id='apptScheduler']")
    public WebElement scheduleAppointment;


    @FindBy(xpath = "//a[@href='https://promo.bankofamerica.com/hp-oaa2/']")
    public WebElement openAccount;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void enterUserID(String user){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        userID.sendKeys(user);
    }


    public void enterPassword(String passW){
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys(passW);
    }

    public void clickLogIn(){
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        logIn.click();}


    public void clickScheduleAppointment(){
        wait.until(ExpectedConditions.elementToBeClickable(scheduleAppointment));
        scheduleAppointment.click();}



    public void clickSearch(){
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();}


    public void clickSearchWithoutRetry(){
        wait.until(ExpectedConditions.elementToBeClickable(searchWithoutRetry));
        searchWithoutRetry.click();}




    public void actionLogInDataModel(String user, String passW)  {

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        ExelWithDataModel obj = new ExelWithDataModel();

        String path = "C:\\Users\\soray\\OneDrive\\Documents\\bootcamp_hacmap.xlsx";
        String sheet = "Sheet1";

try{
        HashMap<String, String> testData = obj.readXl(path, sheet);
        String UId = testData.get("userID");
        String PssW = testData.get("password");

        enterUserID(UId);
        enterPassword(PssW);
        clickLogIn();

    } catch (IOException e) {

        e.printStackTrace();

    }

    }


   public void DoLogInWithProvider(String user, String passW){

       enterUserID(user);
       enterPassword(passW);
       clickLogIn();

   }

    public void clickCreditCards(){
        wait.until(ExpectedConditions.elementToBeClickable(creditCards));
        creditCards.click();}




    public void clickHomeLoans(){
        wait.until(ExpectedConditions.elementToBeClickable(homeLoans));
        homeLoans.click();}




    public void clickSavings(){
        wait.until(ExpectedConditions.elementToBeClickable(savings));
        savings.click();}



    public void clickHelp(){
        wait.until(ExpectedConditions.elementToBeClickable(help));
        help.click();}


    public void clickVisitBetterMoneyHabits(){
       BaseBankOfAmerica.scrollIntoView(VisitBetterMoneyHabits,driver);
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(VisitBetterMoneyHabits));
        VisitBetterMoneyHabits.click();}



    public void clickOpenAccount(){
        wait.until(ExpectedConditions.elementToBeClickable(openAccount));
        openAccount.click();}

}
