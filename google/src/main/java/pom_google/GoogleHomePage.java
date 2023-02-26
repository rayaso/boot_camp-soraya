package pom_google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleHomePage extends GoogleBaseSetup {


    @FindBy(xpath = " //div[@class='RNNXgb']//div[2]//input")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[1]")
    public WebElement googleSearch;


    @FindBy(xpath = "//div[@class='nDcEnd']//img")
    public WebElement camera;


    @FindBy(xpath = " //div[@class='o3j99 n1xJcf Ne6nSd']//a[2]")
    public WebElement store;


    @FindBy(xpath = " //div[@class='gb_b gb_nd gb_qg gb_r gb_Ff']//div//a//img")
    public WebElement accountIcon;

    @FindBy(xpath = " //iframe[@name='callout']")
    public WebElement xFrame;


    @FindBy(xpath = "//div[@class='QlyBfb']//button")
    public WebElement signInPopUp;


    @FindBy(xpath = "//nobr")
    public WebElement resultSearchText;

    @FindBy(xpath = "//div[@class='p4pvTd']")
    public WebElement textResultCamera;

    @FindBy(xpath = "//span[@class='Images']")
    public WebElement textResultImage;
    @FindBy(xpath = "//h1")
    public WebElement textResultStore;


    @FindBy(xpath = "//div[@class='gb_ee gb_r gb_qg gb_hg']//div[2]//a")
    public WebElement image;

    @FindBy(xpath = "//a[@class='gb_p'and@aria-label='Gmail']")
    public WebElement gmail;

    @FindBy(xpath = "//a[@class='MV3Tnb'and@href='https://about.google/?fg=1&utm_source=google-US&utm_medium=referral&utm_campaign=hp-header']")
    public WebElement about;

    @FindBy(xpath = "//h1")
    public WebElement viewCommitmentsTextReturn;


    @FindBy(xpath = "//a[@class='gb_ia gb_ja gb_fe gb_fd']")
    public WebElement signInHomePage;

    @FindBy(xpath = "//h1[@class='ahT6S ']//span")
    public WebElement ForgotEmailTextResult;


    public GoogleHomePage() {
        PageFactory.initElements(driver, this);
    }


    public void enterInput(String item) {

        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.sendKeys(item);

    }


    public void doSearch(String item) {
        enterInput(item);
        clickOnGoogleSearch();

    }


    public void clickOnGoogleSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(googleSearch));
        googleSearch.click();
    }

    public void clickOnImage() {
        wait.until(ExpectedConditions.elementToBeClickable(googleSearch));
        image.click();
    }


    public void clickOnCamera() {
        wait.until(ExpectedConditions.elementToBeClickable(camera));
        camera.click();
    }


    public ResultStore clickOnStore() {
        wait.until(ExpectedConditions.elementToBeClickable(store));
        store.click();
        return new ResultStore();
    }

    public void clickOnAccountIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(accountIcon));
        accountIcon.click();
    }

    public ResultSigninFromHomePage clickOnSignInHomePage() {
        wait.until(ExpectedConditions.elementToBeClickable(signInHomePage));
        signInHomePage.click();
        return new ResultSigninFromHomePage();
    }


    public ResultAbout clickOnAbout() {
        wait.until(ExpectedConditions.elementToBeClickable(about));
        about.click();

        return new ResultAbout();
    }


    public void clickOnGmail() {
        wait.until(ExpectedConditions.elementToBeClickable(gmail));
        gmail.click();
    }

    public void xFrameElement() {
        driver.switchTo().frame(xFrame);
    }

    public void pop() {
        signInPopUp.click();
    }

    public void PopUp() {
        xFrameElement();
        pop();
    }
}
