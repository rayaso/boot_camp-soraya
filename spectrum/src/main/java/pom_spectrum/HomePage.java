package pom_spectrum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Base {

    @FindBy(xpath = "//input[@id='address1-desktop']")
    public WebElement streetAddress;
    @FindBy(xpath = "//input[@id='apt-desktop']")
    public WebElement aptOrUnt;
    @FindBy(xpath = "//input[@id='zip-desktop']")
    public WebElement zipCode;
    @FindBy(xpath = "//header[@class='sp-common-header spjs-global-navigation-header']//div[4]//button[@type='submit']")
    public WebElement go;

    @FindBy(xpath = "//span[@class='sp-label-error'and@aria-hidden='false']")
    public WebElement resultCompleteInput;

    @FindBy(xpath = "//div[@id='oneColumn-e2bd0ac6f2']//div[@class='button cmp-button--primary']//a//span")
    public WebElement shopNow;
    @FindBy(xpath = "//h1")
    public WebElement resultShopNow;

    @FindBy(xpath = "//a[@href='/stores'and@title='View Spectrum Mobile stores.']")
    public WebElement spectrumStore;
    @FindBy(xpath = "//h1")
    public WebElement resultSpectrumStore;

    @FindBy(xpath = "//div[@class='sp-global-nav__desktop--segment-nav residential']//li[@class='cmp-navigation__item cmp-navigation__item--level-0']//a[@href='/business'and@title='Business'and@class='cmp-navigation__item-link']")
    public WebElement business;
    @FindBy(xpath = "//div[@id='heading-cd250403ee']//h2")
    public WebElement resultBusiness;


    @FindBy(xpath = "//ul[@role='menu']//a[@title='account'and@href='https://www.spectrum.net/']")
    public WebElement myAccount;
    @FindBy(xpath = "//h1")
    public WebElement resultMyAccount;


    @FindBy(xpath = "//li[@class='sp-mpTranslate']//div[@class='pageLoadInitialize']//a")
    public WebElement Espanol;
    @FindBy(xpath = "//div[@id='localization-e15523b5bdtablet']//span[@class='sp-find']")
    public WebElement resultEspanol;

    @FindBy(xpath = "//div[@class='sp-global-nav__desktop--mega-nav']//ul[@class='cmp-navigation__group']//a[@href='https://espanol.spectrum.com/cable-tv/latino-plans'and@title='TV']")
    public WebElement TV;
    @FindBy(xpath = "//div[@class='sp-global-nav__desktop--mega-nav']//ul[@class='cmp-navigation__group']//li[@class='cmp-navigation__item cmp-navigation__item--level-1']//a[@href='https://espanol.spectrum.com/cable-tv/plans'and@title='Planes de TV'and@class='cmp-navigation__item-link']")
    public WebElement TVPlans;
    @FindBy(xpath = "//div[@id='heading-e20d03e0fe']//h2")
    public WebElement resultActionTV;

    @FindBy(xpath = "//div[@class='sp-global-nav__desktop--mega-nav']//ul[@class='cmp-navigation__group']//li[@class='cmp-navigation__item cmp-navigation__item--level-0']//a[@href='https://espanol.spectrum.com/internet'and@title='Internet'and@class='cmp-navigation__item-link'and@data-linkname='Internet'and@data-linktype='navigation-1283cba0cb'and@target='_self']")
    public WebElement internet;
    @FindBy(xpath = "//div[@class='sp-global-nav__desktop--middle-col']//div//ul//li//li//a[@href='https://espanol.spectrum.com/internet']")
    public WebElement spectrumInternet;
    @FindBy(xpath = "//div[@id='eyebrow-f09ebccd43']//div[@class='sp-headline-eyebrow'and@data-globalvars-replaced='true']")
    public WebElement resultSpectrumInternet;

    @FindBy(xpath = "//span[@class='asappChatSDKBadge__text']")
    public WebElement chatWithUs;

    @FindBy(xpath = "//div[@class='chatInput__buttonContainer']")
    public WebElement ResultChatWithUs;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void enterStreetAddress(String input1) {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(streetAddress));
        streetAddress.sendKeys(input1);

    }

    public void enterAptOrUnt(String input2) {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(aptOrUnt));
        aptOrUnt.sendKeys(input2);
    }


    public void enterZipCode(String input3) {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(zipCode));
        zipCode.sendKeys(input3);
    }

    public void clickGo() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(go));
        go.click();
    }


    public void completeInputs(String input1, String input2, String input3) {
        enterStreetAddress(input1);
        enterAptOrUnt(input2);
        enterZipCode(input3);
        clickGo();
    }


    public void clickShopNow() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(shopNow));
        shopNow.click();
    }


    public void clickSpectrumStore() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(spectrumStore));
        spectrumStore.click();
    }


    public void clickBusiness() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(business));
        business.click();
    }


    public void clickMyAccount() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(myAccount));
        myAccount.click();
    }


    public void clickEspanol() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Espanol));
        Espanol.click();
    }


    public void ActionTV() {


        Actions act = new Actions(driver);

        act.moveToElement(TV).perform();
        wait.until(ExpectedConditions.elementToBeClickable(TVPlans));
        act.moveToElement(TVPlans).click().build().perform();
    }
    public void clickInternet() {
       // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       wait.until(ExpectedConditions.elementToBeClickable(internet));
        internet.click();
    }

  /*  public void ActionInternet() {

 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Actions act = new Actions(driver);

        act.moveToElement(internet).perform();
       // wait.until(ExpectedConditions.elementToBeClickable(spectrumInternet));
        act.moveToElement(spectrumInternet).click().build().perform();
    }*/
  public void clickChatWithUs() {
      // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      wait.until(ExpectedConditions.elementToBeClickable(chatWithUs));
      chatWithUs.click();
  }
}