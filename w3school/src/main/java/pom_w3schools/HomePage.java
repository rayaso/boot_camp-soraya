package pom_w3schools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseW3Schools {


    @FindBy(xpath = "//a[@id='w3loginbtn']")
    public WebElement sigIn;
    @FindBy(xpath = "//a[@class='w3-bar-item w3-button w3-right ws-hide-1080 w3-hide-small barex ws-yellow ws-hover-yellow gt-btn-top-spaces']")
    public WebElement createWebSite;

    @FindBy(xpath = "//div[@class='top-section']//h1")
    public WebElement resultCreateWebSite;

    @FindBy(xpath = "//input[@id='search2']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@id='learntocode_searchbtn']")
    public WebElement searchIcon;
    @FindBy(xpath = "//h1")
    public WebElement resultDoSearch;

    @FindBy(xpath = "//a[@href='where_to_start.asp']")
    public WebElement iamNotSureMsg;
    @FindBy(xpath = "//h1")
    public WebElement resultIamNotSureMsg;

    @FindBy(xpath = "//i[@class='fa fa-globe']")
    public WebElement globalEarthIcon;

    @FindBy(xpath = "//div[@id=':0.targetLanguage']//img[@src='https://www.google.com/images/cleardot.gif'and@class='goog-te-gadget-icon']")
    public WebElement resultGlobalEarthIcon;

    @FindBy(xpath = "//div[@class='w3-right w3-padding-16 ext_icon_container']//i[@class='fa fa-search']")
    public WebElement search;
    @FindBy(xpath = "//input[@class='gsc-input']")
    public WebElement resultSearch;


    @FindBy(xpath = "//a[@class='w3-bar-item w3-button w3-right ws-hide-1200 w3-hide-small barex ws-pink ws-hover-pink gt-btn-top-cert']")
    public WebElement getCertified;
    @FindBy(xpath = "//div[@class='productgrid--masthead']//h1")
    public WebElement resultGetCertified;

    @FindBy(xpath = "//a[@class='w3-bar-item w3-button w3-hide-small barex bar-item-hover w3-padding-24'and@id='navbtn_tutorials']")
    public WebElement tutorials;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public ResultSignIn clickSigIn() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(sigIn));
        sigIn.click();
        return new ResultSignIn();
    }

    public void clickCreateWebSite() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(createWebSite));
        createWebSite.click();

}



    public void enterInput(String input) {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.sendKeys(input);
    }
    public void clickSearchIcon() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        searchIcon.click();
    }

public ResultDoSearchForSQL doSearch(String input){
        enterInput(input);
        clickSearchIcon();
        return new ResultDoSearchForSQL();
}

    public void clickIamNotSureMsg() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(iamNotSureMsg));
        iamNotSureMsg.click();
    }



    public void clickGlobalEarthIcon() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(globalEarthIcon));
        globalEarthIcon.click();
    }

    public void clickSearch() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();

}




    public ResultGetCertified clickGetCertified() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(getCertified));
        getCertified.click();
return new ResultGetCertified();
    }

    public void clickTutorials() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(tutorials));
        tutorials.click();





}







}