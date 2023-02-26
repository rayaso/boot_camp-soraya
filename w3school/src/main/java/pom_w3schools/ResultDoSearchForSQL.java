package pom_w3schools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultDoSearchForSQL extends BaseW3Schools{

    @FindBy(xpath = "//div[@id='leftmenuinnerinner']//a[@href='sql_intro.asp']")
    public WebElement SQL;

    @FindBy(xpath = "//h1")
    public WebElement resultSQL;

    public ResultDoSearchForSQL() {
        PageFactory.initElements(driver, this);
    }
    public void  clickSQL() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(SQL));
        SQL.click();

    }


}
