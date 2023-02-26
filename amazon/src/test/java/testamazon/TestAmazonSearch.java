package testamazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;
import pom_amazon.SearchResult;

public class TestAmazonSearch extends BaseSetupAmazon {



    @Test

    public void TestAmazonSearch() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        SearchResult searchResult = amazonHomePage.doAct("dress");
        searchResult.clickOnWeddingDress();
        Assert.assertTrue(isElementVisible(amazonHomePage.weddingDress));
    }


}
