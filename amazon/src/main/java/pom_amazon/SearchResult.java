package pom_amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResult extends BaseSetupAmazon {


    @FindBy(xpath = "//div[@class='a-section a-spacing-none _bGlmZ_block_1vI8- _bGlmZ_hFull_2lnNw _bGlmZ_wFull_3f8b2 _bGlmZ_row_3CEm0 _bGlmZ_itemsCenter_3flfN']//div[2]//div//a//span[2]")

    public WebElement weddingDress;

    public SearchResult() {
        PageFactory.initElements(driver, this);
    }


    public void clickOnWeddingDress() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        weddingDress.click();
    }


}
