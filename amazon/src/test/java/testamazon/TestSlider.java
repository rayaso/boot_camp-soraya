package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestSlider extends BaseSetupAmazon {


    @Test
    public void TestSlider() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnSlider();
        Assert.assertTrue(isElementVisible(amazonHomePage.slider));
    }

}
