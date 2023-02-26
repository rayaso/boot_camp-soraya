package pom_carters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Base{


    @FindBy(xpath = "//input[@id='searchinputDesktopAgolia']")
    public WebElement searchBox;
    @FindBy(xpath = "//div[@class='custom-input-group-append']//button[@id='simpleSearchButtonDesktop']//span")
    public WebElement searchIcon;

    @FindBy(xpath = "//div[@class='col']//h1[@class='grid-heading js-header-container']")
    public WebElement resultDoSearch;

    @FindBy(xpath = "//div[@class='js-mini-cart global-minicart']//div[1]//div//a//span[@class='cart-icon']")
    public WebElement cartIcon;
    @FindBy(xpath = "//a[@href='https://www.carters.com/home']")
    public WebElement resultCartIcon;


    @FindBy(xpath = "//a[@href='https://www.carters.com/carters-hilary-duff']//span[@class='mega-nav-link-in']")
    public WebElement hillaryDuffCarters;


    @FindBy(xpath = "//a[@href='https://www.carters.com/carters-hilary-navigation']")
    public WebElement hillaryDuffCartersShopTheCollection;

    @FindBy(xpath = "//li[@class='breadcrumbs-item'and@aria-current='page']")
    public WebElement resultHillaryDuffCartersShopTheCollection;

    @FindBy(xpath = "//ul[@class='nav-links']//a[@href='https://www.carters.com/my-account'and@data-uw-rm-brl='false']")
    public WebElement signIn;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void enterInput(String input){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.sendKeys(input);
    }

    public void clickSearchIcon(){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        searchIcon.click();
    }

public void doSearch(String input){
        enterInput(input);
        clickSearchIcon();
}

    public void clickCartIcon(){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
        cartIcon.click();
    }

    public void actionOnHillaryDuff() {
        Actions act = new Actions(driver);
        act.moveToElement(hillaryDuffCarters).perform();
        wait.until(ExpectedConditions.elementToBeClickable(hillaryDuffCartersShopTheCollection));
        act.moveToElement(hillaryDuffCarters).click().build().perform();

    }

    public void clickSigIn(){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();
    }

}
