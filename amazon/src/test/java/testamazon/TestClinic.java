package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestClinic extends BaseSetupAmazon {





    @Test
    public void TestClinicInHomePage() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnClinic();
        Assert.assertTrue(isElementVisible(amazonHomePage.clinicText));
        System.out.println("this is TestClinic");
    }
}
