package pom_nike;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NikeHomePage extends NikeBase{


    @FindBy(id = "VisualSearchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='wall-header__content']//span[1]//span[1]")
    public WebElement searchBoxTextResult;


    @FindBy(xpath = " //button[@data-var='loginBtn'and@class='nav-btn p0-sm d-sm-b body-4 u-bold ml2-sm mr2-sm']//span")
    public WebElement signInHomePage;
    @FindBy(xpath = "//h1")
    public WebElement signInTextResult;


    @FindBy(xpath = "//div[@class='pre-login-btns d-lg-flx flx-ai-lg-c']//a//span")
    public WebElement joinUs;

    @FindBy(xpath = "//a[@class='pre-desktop-menu-link headline-5 prl3-lg pt4-sm d-sm-b no-outline'and@role='menu'and@data-path='men']")
    public WebElement men;

    @FindBy(xpath = "//a[@class='pre-menu-item d-sm-h is-static body-3 u-bold pre-text-color-secondary'and@aria-label='main-menu, Men, All Shoes, Lifestyle']")
    public WebElement lifeStyle;


    @FindBy(xpath = "//h1")
    public WebElement lifeStyleResult;
    @FindBy(xpath = "///h1")
    public WebElement womenResultButton;

@FindBy(xpath = "//a[@data-analytics-action-id='c1e3f0ac-2683-40f4-902f-78b6ee3c7471'and@href='https://www.nike.com/w/womens-air-max-shoes-5e1x6za6d8hzy7ok']")
public WebElement shopWomenAir;

    @FindBy(xpath = "//div[@id='HelpMenuDropdown']//a//span[1]")
    public WebElement help;

    @FindBy(xpath = "//a[@class='pre-help-dropdown-menu-item body-3 u-bold'and@role='option'and@data-path='get help:order status']")
    public WebElement orderStatus;


    @FindBy(xpath = "//a[@data-path='get help:returns'and@href='https://www.nike.com/help/a/returns-policy'and@class='pre-help-dropdown-menu-item body-3 u-bold']")
    public WebElement returns;
    public NikeHomePage() {
        PageFactory.initElements(driver, this);
    }

public void enterInput(String shoes){
    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        searchBox.sendKeys(shoes);
}

    public ResultSignInHomePage clickSignInHomePage(){
       // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       signInHomePage.click();
        wait.until(ExpectedConditions.elementToBeClickable(signInHomePage));
       return new ResultSignInHomePage();
    }
    public void clickJoinUs(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        joinUs.click();

    }
    public void clickShopWomenAir(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        shopWomenAir.click();

    }





public void Action(){
    Actions act = new Actions(driver);


    // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        act.moveToElement(men).perform();
    wait.until(ExpectedConditions.elementToBeClickable(lifeStyle));

        act.moveToElement(lifeStyle).click().build().perform();
}



    public void ActionHelpOrderStatus(){
        Actions act = new Actions(driver);


        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        act.moveToElement(help).perform();
        wait.until(ExpectedConditions.elementToBeClickable(orderStatus));

        act.moveToElement(orderStatus).click().build().perform();
    }

    public void ActionHelpReturn(){
        Actions act = new Actions(driver);



        act.moveToElement(help).perform();


        act.moveToElement(returns).click().build().perform();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(returns));
    }
}














