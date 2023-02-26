package testbankofamerica;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_bankofamerica.BaseBankOfAmerica;
import pom_bankofamerica.HomePage;

public class TestSearch extends BaseBankOfAmerica {
    @Test
    //this test with retryAnalyser

    public void TestSearchWithRetry() {
        HomePage home = new HomePage();
        home.clickSearch();
        Assert.assertTrue(isElementVisible(home.resultSearch));

    }
}
