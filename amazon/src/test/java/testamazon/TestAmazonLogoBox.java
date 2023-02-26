package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestAmazonLogoBox extends BaseSetupAmazon {


    @Test
    public void TestAmazonLogoBox() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnAmazonLogoBox();
        Assert.assertTrue(isElementVisible(amazonHomePage.AmazonLogoBox));

    }
}
