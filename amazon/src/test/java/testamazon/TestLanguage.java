package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestLanguage extends BaseSetupAmazon {

    @Test
    public void TestLanguage() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.actionsOnLanguage();
        Assert.assertTrue(isElementVisible(amazonHomePage.languageSpanish));
    }
}
