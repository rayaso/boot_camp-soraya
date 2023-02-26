package pom_Tmobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Base {

    @FindBy(xpath = "//button[@type='button'and@class='unav-account__toggle unav-headerTool__link unav-headerTool__link--filled']//span")
    public WebElement myAccount;

    @FindBy(xpath = "//a[@href='/cart?INTNAV=tNav:Cart']//*[name() = 'svg'][contains(@class, 'phx-icon ')]")
    public WebElement cart;
    @FindBy(xpath = "//h1")
    public WebElement resultCart;

    @FindBy(xpath = "//div[@class='unav-header__search unav-header__search--wide']//div[@class='unav-headerTool unav-headerTool--search unav-search']//button[@class='unav-headerTool__link false unav-headerTool__link--search']//*[name() = 'svg'][contains(@class, 'phx-icon ')]")
    public WebElement Search;
    @FindBy(xpath = "//input[@id='unav-search-input-desktop']")
    public WebElement resultSearch;

    @FindBy(xpath = "//div[@class='unav-header__aside']//div[1]//div//div//a//span")
    public WebElement findAStore;
    @FindBy(xpath = "//input[@class='store-locator-search-box width-100 border-none text-black font-bold display-inline ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched']")
    public WebElement resultFindAStore;

    @FindBy(xpath = "//div[@class='unav-header__logo unav-header__logo--desktop']//a//img")
    public WebElement tMobilLogo;

    @FindBy(xpath = "//a[@id='button-5894a59786']//span")
    public WebElement shopNow;
    @FindBy(xpath = "//h1")
    public WebElement resultShopNow;

    @FindBy(xpath = "//button[@data-a11y-dialog-show='disclosure-cardPromo-e93b038207']//span")
    public WebElement getFullTerm;
    @FindBy(xpath = "//div[@id='disclosure-cardPromo-e93b038207']//div[@class='phx-modal__content']//h2")
    public WebElement resultGetFullTerm;

    @FindBy(xpath = "//a[@href='/offers?INTNAV=tNav%3ADeals']")
    public WebElement deals;
    @FindBy(xpath = "//a[@href='/offers/apple-iphone-deals?INTNAV=tNav%3ADeals%3AApple']")
    public WebElement appleDeals;
    @FindBy(xpath = "//h1")
    public WebElement resultAppleDeals;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public ResultClickMyAccount clickMyAccount() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(myAccount));
        myAccount.click();
        return new ResultClickMyAccount();
    }


    public void clickCart() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(cart));
        cart.click();

    }


    public void clickSearch() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Search));
        Search.click();

    }

    public void clickFindStore() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(findAStore));
        findAStore.click();

    }


    public void clickTMobilLogo() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(tMobilLogo));
        tMobilLogo.click();

    }

    public void clickShopNow() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(shopNow));
        shopNow.click();

    }


    public void clickGetFullTerm() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(getFullTerm));
        getFullTerm.click();

    }


    public void actionOnDeals() {
    Actions act = new Actions(driver);

        act.moveToElement(deals).perform();
        wait.until(ExpectedConditions.elementToBeClickable(appleDeals));
        act.moveToElement(appleDeals).click().build().perform();



}}
