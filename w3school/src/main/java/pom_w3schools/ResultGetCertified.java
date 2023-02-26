package pom_w3schools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultGetCertified extends BaseW3Schools {

    @FindBy(xpath = "//div[@class='small-promo-content']//span")
    public WebElement getCertifiedGetStarted;

    public ResultGetCertified() {
        PageFactory.initElements(driver, this);
    }

    public void clickGetCertifiedGetStarted() {
         wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      //  wait.until(ExpectedConditions.elementToBeClickable(getCertifiedGetStarted));
        getCertifiedGetStarted.click();

    }
}