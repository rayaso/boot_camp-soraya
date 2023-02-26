package pom_youtube;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Base {


    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBox;


    @FindBy(xpath = "//button[@id='search-icon-legacy']//yt-icon")
    public WebElement searchIcon;

    @FindBy(xpath = "//h3[@class='style-scope ytd-promoted-video-renderer']")
    public WebElement resultDoSearch;

    @FindBy(xpath = "//div[@class='yt-spec-icon-badge-shape yt-spec-icon-badge-shape--type-notification  ']//div//yt-icon")
    public WebElement notification;

    @FindBy(xpath = "//div[@class='promo-title style-scope ytd-background-promo-renderer']")
    public WebElement resultNotification;

    @FindBy(xpath = "//div[@id='buttons'and@class='style-scope ytd-masthead']//div[1]//a//yt-icon-button//button//yt-icon")
    public WebElement yt_icon;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void enterInput(String input) {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.sendKeys(input);
    }

    public void clickSearch() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.click();}



    public void doSearch(String input){
        enterInput(input);
        clickSearch();
    }

    public void clickNotification() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(notification));
        notification.click();}



    public void clickYt_Icon() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(yt_icon));
        yt_icon.click();}
































}






