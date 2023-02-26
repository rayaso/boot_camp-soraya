package pom_automation_scalduplit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BaseSetup{


    @FindBy(xpath = " //div[@class='header-right']//div[3]//a//i")
    WebElement instagramIcon;
    @FindBy(xpath = "//div[@class='slider-section']//i[2]")
    WebElement slider;
    @FindBy(xpath = "//input[@class='wp-block-search__input wp-block-search__input ']")
    WebElement searchBox;

    @FindBy(xpath = "//button[@class='wp-block-search__button has-icon wp-element-button']")
    WebElement searchIcon;

    @FindBy(xpath = "//div[@class='wc-cart-icon-wrapper']//a//span")
    public WebElement cartButton;
    @FindBy(xpath = " //div[@class='acmethemes-nav']//li[6]/a")
    public WebElement blog;

    @FindBy(xpath = "//a[@class='my-account']")
    WebElement myAccount;

    @FindBy(xpath = "//strong[2]")
    public WebElement errorTextLogin;

    @FindBy(xpath = "//h2[1]")
    public WebElement instagramResult;

    @FindBy(xpath = "//h2")
    public WebElement resultCart;
    @FindBy(xpath = "//strong[1]")
    public WebElement errorTextRegister;
    @FindBy(xpath = " //div[@class='no-media-query at-slide-unit acme-col-1 slick-slide slick-current slick-active']")
    public WebElement image;
    @FindBy(xpath = "//div[@class='at-title-action-wrapper clearfix']//h2//span//a")
    public WebElement viewAll;
    @FindBy(xpath = "//a[@class='button wp-element-button product_type_simple add_to_cart_button ajax_add_to_cart'and@data-product_id='210']")
    public WebElement addToCartShoes;

    @FindBy(xpath = " //a[@class='button wc-forward wp-element-button']")
    public WebElement viewCart;


    @FindBy(xpath = "//div[@class='featured-entries-col column']//div[1]//div[1]//div[1]//a//img")
    public WebElement img;

    @FindBy(xpath = "//h1")
    public WebElement resultImg;
    public HomePage(){
        PageFactory.initElements(driver,this);
    }



    public void clickOnInstagram(){

        wait.until(ExpectedConditions.elementToBeClickable(instagramIcon));
        instagramIcon.click();

    }
 public void clickOnSlider(){

        wait.until(ExpectedConditions.elementToBeClickable(slider));
        slider.click();

    }


    public void ClickOnAddToCartShoes(){

        wait.until(ExpectedConditions.elementToBeClickable(addToCartShoes));
        addToCartShoes.click();

    }

    public void clickOnViewAll(){

        wait.until(ExpectedConditions.elementToBeClickable(viewAll));
        viewAll.click();}



    public void enterSearchInput(String item){

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        searchBox.sendKeys(item);
    }
    public void clickOnSearchIcon(){

        wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        searchIcon.click();

    }

    public void clickOnBlog(){

        wait.until(ExpectedConditions.elementToBeClickable(blog));
        blog.click();

    }
    public void doSearch(String item){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        enterSearchInput(item);
        clickOnSearchIcon();
    }
    public void clickOnCartButton(){

        wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        cartButton.click();


    }
    public ResultClickMyAccount clickOnAcc(){

        wait.until(ExpectedConditions.elementToBeClickable(myAccount));
        myAccount.click();
return new ResultClickMyAccount();
    }


    public void scrollAndClickImg() {

        wait.until(ExpectedConditions.elementToBeClickable(img));

        BaseSetup.scrollIntoView(img, driver);
        img.click();


    }}






