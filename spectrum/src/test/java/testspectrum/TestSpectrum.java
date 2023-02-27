package testspectrum;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_spectrum.Base;
import pom_spectrum.HomePage;

public class TestSpectrum extends Base {

    @Test
    public void TestInputs(){
        HomePage homePage=new HomePage();
        homePage.completeInputs("dublin","apt9","43220");
        Assert.assertTrue(isElementVisible(homePage.resultCompleteInput));


    }

    //this test is exel with data provider
    @Test(dataProvider = "Excel Data Provider",dataProviderClass = Base.class)
    public void AfterClickMyAccount(String input1,String input2,String input3)  {
        if (!(input1 == null) && !(input2 == null)&& !(input3 == null))
        {
            HomePage homePage=new HomePage();
            homePage.completeInputs(input1,input2,input3);
            Assert.assertTrue(isElementVisible(homePage.resultCompleteInput));
        }}

    @Test
    public void TestShopNow(){
        HomePage homePage=new HomePage();
        homePage.clickShopNow();
        Assert.assertTrue(isElementVisible(homePage.resultShopNow));
    }



    @Test
    public void TestSpectrumStore(){
        HomePage homePage=new HomePage();
        homePage.clickSpectrumStore();
        Assert.assertTrue(isElementVisible(homePage.resultSpectrumStore));
    }




    @Test
    public void TestBusiness(){
        HomePage homePage=new HomePage();
        homePage.clickBusiness();
        Assert.assertTrue(isElementVisible(homePage.resultBusiness));
    }



    @Test
    public void TestMyAccount(){
        HomePage homePage=new HomePage();
        homePage.clickMyAccount();
        Assert.assertTrue(isElementVisible(homePage.resultMyAccount));
    }



    @Test
    public void TestEspanol(){
        HomePage homePage=new HomePage();
        homePage.clickEspanol();
        Assert.assertTrue(isElementVisible(homePage.resultEspanol));
    }

    @Test
    public void TestActionTv(){
        HomePage homePage=new HomePage();
        homePage.ActionTV();
        Assert.assertTrue(isElementVisible(homePage.resultActionTV));
    }




  /*  @Test
    public void TestActionInternet(){
        HomePage homePage=new HomePage();
        homePage.ActionInternet();
        Assert.assertTrue(isElementVisible(homePage.resultSpectrumInternet));
    }*/


    @Test
    public void TestInternet(){
        HomePage homePage=new HomePage();
        homePage.clickInternet();
        Assert.assertTrue(isElementVisible(homePage.resultSpectrumInternet));
    }

    @Test
    public void TestChatWithUs(){
        HomePage homePage=new HomePage();
        homePage.clickChatWithUs();
        Assert.assertTrue(isElementVisible(homePage.ResultChatWithUs));
    }






}
