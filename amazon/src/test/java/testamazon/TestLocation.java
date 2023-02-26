package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestLocation extends BaseSetupAmazon {

    @Test
    public void TestLocation() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnLocation();
        Assert.assertTrue(isElementVisible(amazonHomePage.location));
        logger=extent.createTest("TestAllIcon");
    }



}
