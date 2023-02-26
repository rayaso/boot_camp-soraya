package peoplentech.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultContactUs extends Base{

@FindBy(xpath = "//div[@class='brn-padn']//a[@href='https://www.google.com/maps?ll=23.750716,90.386776&z=18&t=m&hl=en-US&gl=BD&mapclient=embed&cid=1018288364242359295'and@target='_blank']//small")
public WebElement afterContactUs;

    @FindBy(xpath = "//div[@class='RZ66Rb FgCUCc']//button//img")
    public WebElement resultAfterContactUs;




    public ResultContactUs() {
        PageFactory.initElements(driver, this);
    }

    public void clickAfterContactUs() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.elementToBeClickable(forumLogIn));
        afterContactUs.click();
    }

}
