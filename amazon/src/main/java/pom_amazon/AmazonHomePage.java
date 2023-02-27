package pom_amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHomePage extends BaseSetupAmazon {


    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;


    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchIcon;


    @FindBy(xpath = "//div[@class='a-section a-spacing-none _bGlmZ_block_1vI8- _bGlmZ_hFull_2lnNw _bGlmZ_wFull_3f8b2 _bGlmZ_row_3CEm0 _bGlmZ_itemsCenter_3flfN']//div[2]//div//a//span[2]")

    public WebElement weddingDress;


    @FindBy(xpath = "//div[@id='nav-xshop-container']//div//a[2]")

    public WebElement clinic;
    @FindBy(xpath = "//div[@id='nav-xshop-cont']//div//a[2]")

    public WebElement clinic2;


    @FindBy(xpath = "//a[@class='sign-in-tooltip-link']")

    public WebElement startHere;


    @FindBy(xpath = " //div[@id='nav-flyout-ya-signin']//a//span")

    public WebElement signInHomePage;


    @FindBy(xpath = "//div[@id='nav-swmslot']//a")

    public WebElement ShopValentineDy;


    @FindBy(xpath = "//h1")
    public WebElement textResult;


    @FindBy(xpath = "//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")
    public WebElement allIcon;
    @FindBy(xpath = "//div[@id='nav-global-location-slot']//span[2]")
    public WebElement location;


    /*  @FindBy(xpath = "//div[@class='nav-signin-tt nav-flyout']")private WebElement AmazonSignInPopUp;
      @FindBy(xpath = "//div[@class='nav-signin-tooltip-footer']//a")private WebElement AmazonStartHere;*/
    @FindBy(xpath = "//strong[1]")
    public WebElement clinicText;

    @FindBy(xpath = "//div[@class='a-carousel-col a-carousel-right celwidget']//a//i")
    public WebElement slider;

    @FindBy(xpath = "//a[@class='nav-a nav-a-2   nav-progressive-attribute'and@id='nav-link-accountList']")
    public WebElement HelloSignInAccountList;

    @FindBy(xpath = "//a[@class='nav-a'and@rel='nofollow']")
    public WebElement startHerePopUp;
    @FindBy(xpath = "//div[@id='nav-xshop-container']//div//a[4]")
    public WebElement bestSellers;

    @FindBy(xpath = "//span[@class='icp-nav-link-inner']")
    public WebElement languageBox;
    @FindBy(xpath = " //div[@id='nav-flyout-icp']//a[@href='#switch-lang=es_US']")
    public WebElement languageSpanish;

    @FindBy(xpath = "//a[@class='nav-logo-link nav-progressive-attribute']")
    public WebElement AmazonLogoBox;

    public AmazonHomePage() {
        PageFactory.initElements(driver, this);
    }


    public void enterInput(String item) {

        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.sendKeys(item);
    }

    public void clickOnSearchIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        searchIcon.click();
    }

    public void clickOnSignInHomePge() {
        wait.until(ExpectedConditions.elementToBeClickable(signInHomePage));
        signInHomePage.click();
    }

    public SearchResult doAct(String item) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        enterInput(item);
        clickOnSearchIcon();
        return new SearchResult();
    }

    public void clickOnClinic() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        clinic.click();


    }
    public void clickOnClinic2() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        clinic2.click();


    }


    public void clickOnSignIn() {
        startHere.click();
    }



    public void clickOnLocation() {
        wait.until(ExpectedConditions.elementToBeClickable(location));
        location.click();

    }

    public void clickOnShopValentineDy() {
        wait.until(ExpectedConditions.elementToBeClickable(ShopValentineDy));
        ShopValentineDy.click();

    }


    public void actionsOnLanguage() {


        Actions act = new Actions(driver);

        act.moveToElement(languageBox).perform();
        wait.until(ExpectedConditions.elementToBeClickable(languageSpanish));
        act.moveToElement(languageSpanish).click().build().perform();

    }

    public void clickOnSlider() {
        wait.until(ExpectedConditions.elementToBeClickable(slider));
        slider.click();
    }


    public void clickOnAll() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        allIcon.click();
    }

    public void clickOnBestSellers() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        bestSellers.click();
    }


    public void actionsS() {


        Actions act = new Actions(driver);
        act.moveToElement(HelloSignInAccountList).build().perform();
        act.moveToElement(startHerePopUp).click().build().perform();
    }

    public void clickOnAmazonLogoBox() {
        wait.until(ExpectedConditions.elementToBeClickable(AmazonLogoBox));
        AmazonLogoBox.click();
    }

    public AfterSignInInHomePage actionsSignInHomePage() {


        Actions act = new Actions(driver);
        act.moveToElement(HelloSignInAccountList).build().perform();
        act.moveToElement(signInHomePage).click().build().perform();
        return new AfterSignInInHomePage();


    }

}