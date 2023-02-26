package testnike;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_nike.NikeBase;
import pom_nike.NikeHomePage;
import pom_nike.ResultSignInHomePage;

public class TestNike extends NikeBase {

    @Test

    public void TestSearchBox(){
        NikeHomePage nike=new NikeHomePage();
        nike.enterInput("jordan");
        Assert.assertTrue(isElementVisible(nike.searchBoxTextResult));
    }
@Test
    public void clickON(){
        NikeHomePage nike=new NikeHomePage();
        nike.clickShopWomenAir();
        Assert.assertTrue(isElementVisible(nike.womenResultButton));
    }

    @Test
    public void TestSignInHomePage(){
        NikeHomePage nike=new NikeHomePage();
        nike.clickSignInHomePage();
        Assert.assertTrue(isElementVisible(nike.signInTextResult));
    }


    @Test
    public void TesJoinUS(){
        NikeHomePage nike=new NikeHomePage();
        nike.clickJoinUs();
        Assert.assertTrue(isElementVisible(nike.joinUs));
    }
    @Test
    public void TesActionMen()  {
        NikeHomePage nike=new NikeHomePage();

        nike.Action();

        Assert.assertTrue(isElementVisible(nike.lifeStyleResult));


    }
    @Test
    public void TestWomen()  {
        NikeHomePage nike=new NikeHomePage();

        nike.clickShopWomenAir();
        Assert.assertTrue(isElementVisible(nike.womenResultButton));


    }


    @Test
    public void TestAfterSignInEmailBox(){
        NikeHomePage nike=new NikeHomePage();
        ResultSignInHomePage resultSignInHomePage=nike.clickSignInHomePage();
        resultSignInHomePage.enterEmail("soraya@gmail.com");
        //Assert.assertEquals(driver.getTitle()," Welcome to Nike - Sign In");
    }

    @Test
    public void TestChangeAfterSignIn(){
        NikeHomePage nike=new NikeHomePage();
        ResultSignInHomePage resultSignInHomePage=nike.clickSignInHomePage();
        resultSignInHomePage.clickChangResultSignIn();
       // Assert.assertEquals(driver.getTitle()," Welcome to Nike - Sign In");
    }
    @Test
    public void TestActionHelp(){
        NikeHomePage nike=new NikeHomePage();
       nike.ActionHelpOrderStatus();
         Assert.assertEquals(driver.getTitle(),"Guest Order Lookup. Nike.com");
    }



    @Test
    public void TestActionHelpReturn(){
        NikeHomePage nike=new NikeHomePage();
        nike.ActionHelpReturn();
        Assert.assertEquals(driver.getTitle(),"What Is Nike's Return Policy? | Nike Help");
    }





}
