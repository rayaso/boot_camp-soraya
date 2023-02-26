package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestActionS extends BaseSetupAmazon {

    @Test
    public void TestActionS() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.actionsS();
        Assert.assertTrue(isElementVisible(amazonHomePage.startHerePopUp));
        //listenersOnActionS();
        System.out.println("this is TestActionS");
    }
}
