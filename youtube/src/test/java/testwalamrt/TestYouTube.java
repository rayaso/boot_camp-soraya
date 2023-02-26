package testwalamrt;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_youtube.Base;
import pom_youtube.HomePage;

public class TestYouTube extends Base {

    @Test

    public void TestDoSearch(){
        HomePage homePage=new HomePage();
        homePage.doSearch("java");
        Assert.assertTrue(isElementVisible(homePage.resultDoSearch));
    }

    @Test

    public void TestNotification(){
        HomePage homePage=new HomePage();
        homePage.clickNotification();
        Assert.assertTrue(isElementVisible(homePage.resultNotification));
    }


    @Test

    public void TesYt_Icon(){
        HomePage homePage=new HomePage();
        homePage.clickYt_Icon();

    }














}
