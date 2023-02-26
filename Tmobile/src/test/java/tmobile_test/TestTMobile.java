package tmobile_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_Tmobile.Base;
import pom_Tmobile.HomePage;
import pom_Tmobile.ResultClickLogin;
import pom_Tmobile.ResultClickMyAccount;

public class TestTMobile extends Base {

    @Test
    public void TestAccount() {
        HomePage homePage = new HomePage();
        homePage.clickMyAccount();
        ResultClickMyAccount resultClickMyAccount = new ResultClickMyAccount();
        Assert.assertTrue(isElementVisible(resultClickMyAccount.logIn));

    }


    @Test
    public void TestResultClickMyAccount() {
        HomePage homePage = new HomePage();
        ResultClickMyAccount resultClickMyAccount = homePage.clickMyAccount();
        ResultClickLogin resultClickLogin = new ResultClickLogin();
        resultClickMyAccount.clickLogIn();
        Assert.assertTrue(isElementVisible(resultClickLogin.resultClickLoginEmail));
    }


    @Test
    public void TestResultClickLLogin() {
        HomePage homePage = new HomePage();
        ResultClickMyAccount resultClickMyAccount = homePage.clickMyAccount();

        resultClickMyAccount.clickLogIn();
        ResultClickMyAccount resultClickMyAccount1 = new ResultClickMyAccount();

        ResultClickLogin resultClickLogin = resultClickMyAccount1.clickLogIn();
        resultClickLogin.doNext("sonia@gmail.com");

        //Assert.assertTrue(isElementVisible(resultClickLogin.resultResultClickLogin));
    }

    @Test
    public void TestCart() {
        HomePage homePage = new HomePage();
        homePage.clickCart();
        Assert.assertTrue(isElementVisible(homePage.resultCart));

    }


    @Test
    public void TestSearch() {
        HomePage homePage = new HomePage();
        homePage.clickSearch();
        Assert.assertTrue(isElementVisible(homePage.resultSearch));

    }


    @Test
    public void TestFindStore() {
        HomePage homePage = new HomePage();
        homePage.clickFindStore();
        Assert.assertTrue(isElementVisible(homePage.resultFindAStore));

    }


    @Test
    public void TestTMobilLogo() {
        HomePage homePage = new HomePage();
        homePage.clickTMobilLogo();
        Assert.assertTrue(isElementVisible(homePage.tMobilLogo));

    }


    @Test
    public void TestShopNow() {
        HomePage homePage = new HomePage();
        homePage.clickShopNow();
        Assert.assertTrue(isElementVisible(homePage.resultShopNow));

    }

    @Test
    public void TestGetFullTerm() {
        HomePage homePage = new HomePage();
        homePage.clickGetFullTerm();
        Assert.assertTrue(isElementVisible(homePage.resultGetFullTerm));

    }


    @Test
    public void TestActionDeals() {
        HomePage homePage = new HomePage();
        homePage.actionOnDeals();
        Assert.assertTrue(isElementVisible(homePage.resultAppleDeals));

    }


}