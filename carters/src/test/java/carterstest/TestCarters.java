package carterstest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_carters.Base;
import pom_carters.HomePage;
import pom_carters.ResultSignIn;

public class TestCarters extends Base {

    @Test

    public void TestDoSearch(){
        HomePage homePage=new HomePage();
        homePage.doSearch("pants");
        Assert.assertTrue(isElementVisible(homePage.resultDoSearch));
    }

@Test
    public void TestCartIcon(){
        HomePage homePage=new HomePage();
        homePage.clickCartIcon();
        Assert.assertTrue(isElementVisible(homePage.resultCartIcon));
    }

    @Test
    public void TestActionHillaryDuff(){
        HomePage homePage=new HomePage();
        homePage.actionOnHillaryDuff();
        Assert.assertTrue(isElementVisible(homePage.resultHillaryDuffCartersShopTheCollection));
    }

    @Test
    public void TestSigIn(){
        HomePage homePage=new HomePage();
        ResultSignIn resultSignIn=new ResultSignIn();
        homePage.clickSigIn();
        Assert.assertTrue(isElementVisible(resultSignIn.resultSignInEmail));
    }






}
