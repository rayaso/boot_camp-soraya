package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestShopVlentineDay extends BaseSetupAmazon {



    @Test
    public void TestShopValentineDay() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnShopValentineDy();
        Assert.assertEquals(driver.getTitle(), "Valentine's Day | Amazon.com Gift Finder");
    }

}
