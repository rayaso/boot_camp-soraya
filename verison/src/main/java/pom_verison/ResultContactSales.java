package pom_verison;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ResultContactSales extends Base {


    @FindBy(xpath = "//select[@id='_db_country']")
    public WebElement selectCountry;

    @FindBy(xpath = "//select[@class='topic']")
    public WebElement areaOfInterest;

    @FindBy(xpath = "//select[@name='NumberOfEmployees']")
    public WebElement sizeOfCompany;

    @FindBy(xpath = " //select[@name='Industry']")
    public WebElement industry;

    @FindBy(xpath = "//a[@class='primary button next step1 vz-button-link']")
    public WebElement next;
    @FindBy(xpath = "//label[@class='step'and@data-step='3']")
    public WebElement resultActionsAfterContactSles;


    public ResultContactSales() {
        PageFactory.initElements(driver, this);
    }


    public void doSelectCountry() {
        Select Country = new Select(driver.findElement(By.xpath("//select[@id='_db_country']")));
        wait.until(ExpectedConditions.elementToBeClickable(selectCountry));
        Country.selectByVisibleText("Brazil");
    }

    public void doSelectAreaOfInterest() {
        Select Country = new Select(driver.findElement(By.xpath("//select[@class='topic']")));
        wait.until(ExpectedConditions.elementToBeClickable(areaOfInterest));
        Country.selectByVisibleText("Cloud Services");
    }

    public void doSelectSizeOfCompany() {
        Select Country = new Select(driver.findElement(By.xpath("//select[@name='NumberOfEmployees']")));
        wait.until(ExpectedConditions.elementToBeClickable(sizeOfCompany));
        Country.selectByVisibleText("5000 or more");
    }

    public void doSelectIndustry() {
        Select Country = new Select(driver.findElement(By.xpath("//select[@name='Industry']")));
        wait.until(ExpectedConditions.elementToBeClickable(industry));
        Country.selectByVisibleText("Education");
    }

    public void clickNext() {
        wait.until(ExpectedConditions.elementToBeClickable(next));
        next.click();
    }

    public void actionsAfterContactSales() {
        doSelectCountry();
        doSelectAreaOfInterest();
        doSelectSizeOfCompany();
        doSelectIndustry();
        clickNext();
    }
}
