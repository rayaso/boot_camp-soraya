package peoplentech.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Base {

    @FindBy(xpath = "//a[@href='https://forum.piit.us/']")
    public WebElement forumLogIn;
    @FindBy(xpath = "//div[@id='userarea']//strong")
    public WebElement resultForumLogIn;

    @FindBy(xpath = "//a[@href='https://piit.us/en'and@title=' Home']")
    public WebElement home;


    @FindBy(xpath = "//a[@data-toggle='tooltip'and@title=' Career']")
    public WebElement career;

    @FindBy(xpath = "//select[@class='language-dropdown']")
    public WebElement englishBox;

    @FindBy(xpath = "//a[@title=' About Us']")
    public WebElement aboutUs;

    @FindBy(xpath = "//a[@title='Company Profile']")
    public WebElement aboutUsToCompanyProfile;


    @FindBy(xpath = "//a[@title=' Job Placement']")
    public WebElement jobPlacement;
    @FindBy(xpath = "//a[@title='Become an Instructor']")
    public WebElement jobPlacementToBecameInstructor;

    @FindBy(xpath = "//a[@title=' Contact Us']")
    public WebElement contactUs;

    @FindBy(xpath = "//div[@class='navigation']//label[2]")
    public WebElement sliderRedButton;

    @FindBy(xpath = "//li[@class='second slide_back'][2]//img]")
    public WebElement ResultSliderRedButton;

    @FindBy(xpath = "//div[@class='col-md-5 col-sm-12 col-xs-12 certi_logo']//a[1]//img")
    public WebElement peopleNTechCertificationLogo;

    @FindBy(xpath = "//a[@title=' Partner University']")
    public WebElement partnerUniversity;

    @FindBy(xpath = "//h2")
    public WebElement resultPartnerUniversity;




    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickForumLogIn() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.elementToBeClickable(forumLogIn));
        forumLogIn.click();
    }


    public void clickHome() {
        wait.until(ExpectedConditions.elementToBeClickable(home));
        home.click();
    }

    public void clickCareer() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        career.click();
    }


    public void clickEnglishBox() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(englishBox));
        englishBox.click();
    }

    public void actionOnAboutUs() {
        Actions actions = new Actions(driver);

        actions.moveToElement(aboutUs).perform();
        wait.until(ExpectedConditions.elementToBeClickable(aboutUsToCompanyProfile));
        actions.moveToElement(aboutUsToCompanyProfile).click().build().perform();


    }

    public void actionOnJobPlacement() {
        Actions actions = new Actions(driver);

        actions.moveToElement(jobPlacement).perform();
        wait.until(ExpectedConditions.elementToBeClickable(jobPlacementToBecameInstructor));
        actions.moveToElement(jobPlacementToBecameInstructor).click().build().perform();
    }

    public ResultContactUs clickContactUs() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(contactUs));
        contactUs.click();
        return new ResultContactUs();
    }

    public void clickSliderRedButton() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(sliderRedButton));
        sliderRedButton.click();

    }


    public void clickPartnerUniversity() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(partnerUniversity));
        partnerUniversity.click();

    }



    public void clickCertificationLogo() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(peopleNTechCertificationLogo));
        peopleNTechCertificationLogo.click();


    }





}
