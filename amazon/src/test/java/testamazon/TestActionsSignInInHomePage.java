package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AfterSignInInHomePage;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;

public class TestActionsSignInInHomePage extends BaseSetupAmazon {

    @Test
    public void TestActionSSignINHomePge() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        //  amazonHomePage.actionsSignInHomePage();
        AfterSignInInHomePage afterSignInInHomePage=amazonHomePage.actionsSignInHomePage();
        Assert.assertTrue(isElementVisible(afterSignInInHomePage.resultTextAfterSgnIn));
    }

}
