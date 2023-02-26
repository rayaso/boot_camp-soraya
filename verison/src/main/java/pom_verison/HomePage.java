package pom_verison;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Base{

    @FindBy(xpath = "//a[@href='/business/contact-us/'and@class='vz-button-link button']//span")
    public WebElement contactSles;
    @FindBy(xpath = "//div[@class='main ']//label[9]//span[1]")
    public WebElement ResultContactSles;

    @FindBy(xpath = "//div[@id='gnav20-account-menu']//a")
    public WebElement logIn;

    @FindBy(xpath = "//div[@class='contact-us']//a//span[1]")
    public WebElement PhoneNumber;

    @FindBy(xpath = "//button[@class='gnav20-search-icon'and@id='gnav20-search-icon']")
    public WebElement search;

    @FindBy(xpath = "//button[@class='cancel_btn contrast Button__Button-jkHDFw jKukBA']")
    public WebElement resultSearch;

    @FindBy(xpath = "//a[@href='https://www.verizon.com/business/support/'and@aria-label='Support'and@data-label='Support']")
    public WebElement support;
    @FindBy(xpath = "//h1")
    public WebElement resultSupport;

    @FindBy(xpath = "//a[@id='gnav20-eyebrow-link-Business']")
    public WebElement business;
    @FindBy(xpath = " //a[@name='Bread Crumb']")
    public WebElement resultBusiness;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public ResultContactSales clickContactSles() {
       // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(contactSles));
        contactSles.click();
        return new ResultContactSales();
    }
    public void clickSupport() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(support));
        support.click();
    }
    public void clickBusiness() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(business));
        business.click();
    }
    public ResultLogIn clickLogin() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        logIn.click();
        return new ResultLogIn();
    }

    public void clickPhoneNumber() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(PhoneNumber));
        PhoneNumber.click();

    }

    public void clickSearch() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();

    }
}
