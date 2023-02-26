package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestAllIcon extends BaseSetupAmazon {


    @Test
    public void TestAllIconInHomePage() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnAll();
        Assert.assertTrue(isElementVisible(amazonHomePage.allIcon));
        System.out.println("this is TestAllIcon");
        //listenersOnAllIcon();

        //logger=extent.createTest("TestAllIcon");


    }

}
