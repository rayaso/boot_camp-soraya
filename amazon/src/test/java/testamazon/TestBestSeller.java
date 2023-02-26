package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestBestSeller extends BaseSetupAmazon {



    @Test
    public void TestBestSellers() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnBestSellers();
        Assert.assertTrue(isElementVisible(amazonHomePage.bestSellers));
        //listenersOnBestSeller();
    }
}
