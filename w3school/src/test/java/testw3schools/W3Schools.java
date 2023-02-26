package testw3schools;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_w3schools.*;

public class W3Schools extends BaseW3Schools {

    @Test
     public void TestDoLogIn(){
        HomePage homePage=new HomePage();
        ResultSignIn resultSignIn=homePage.clickSigIn();
        resultSignIn.doClickLogIn("email","password");
        Assert.assertTrue(isElementVisible(resultSignIn.resultLogIn));
    }
    @Test(dataProvider = "loginDataProvider", dataProviderClass = BaseW3Schools.class)
    public void TestDoLogInDataPro(String email,String password){
        HomePage homePage=new HomePage();
        ResultSignIn resultSignIn=homePage.clickSigIn();
        resultSignIn.doClickLogIn(email,password);
        Assert.assertTrue(isElementVisible(resultSignIn.resultLogIn));
    }

    //this test is data provider with exel
    @Test(dataProvider = "Excel Data Provider",dataProviderClass = BaseW3Schools.class)
    public void TestDoLogInWithDataProvider(String INPUT1,String INPUT2)  {
        if (!(INPUT1 == null) && !(INPUT2 == null))
        {
            HomePage homePage = new HomePage();
            ResultSignIn resultSignIn=homePage.clickSigIn();
            resultSignIn.doClickLogIn(INPUT1,INPUT2);
              Assert.assertTrue(isElementVisible(resultSignIn.resultLogIn));
        }}

    @Test
    public void TestCreateWebSite(){
        HomePage homePage=new HomePage();
       homePage.clickCreateWebSite();
        Assert.assertTrue(isElementVisible(homePage.resultCreateWebSite));
    }

    @Test
    public void TestDoSearch(){
        HomePage homePage=new HomePage();
        homePage.doSearch("sql");
        Assert.assertTrue(isElementVisible(homePage.resultDoSearch));
    }



    @Test
    public void TestSQL(){
        HomePage homePage=new HomePage();
        ResultDoSearchForSQL sql=homePage.doSearch("sql");
        sql.clickSQL();
        Assert.assertTrue(isElementVisible(sql.resultSQL));
    }

    @Test
    public void TestIamNotSureMsg(){
        HomePage homePage=new HomePage();
        homePage.clickIamNotSureMsg();
        Assert.assertTrue(isElementVisible(homePage.resultIamNotSureMsg));
    }

    @Test
    public void TestGlobalEarthIcon(){
        HomePage homePage=new HomePage();
        homePage.clickGlobalEarthIcon();
        Assert.assertTrue(isElementVisible(homePage.resultGlobalEarthIcon));
    }


    @Test
    public void TestSearch(){
        HomePage homePage=new HomePage();
        homePage.clickSearch();
        Assert.assertTrue(isElementVisible(homePage.resultSearch));
    }


    @Test
    public void TestGetCertified(){
        HomePage homePage=new HomePage();
        homePage.clickGetCertified();
        Assert.assertTrue(isElementVisible(homePage.resultGetCertified));
    }





   /* @Test
    public void TestGetCertifiedGetStarted(){
        HomePage homePage=new HomePage();
        ResultGetCertified resultGetCertified=homePage.clickGetCertified();
        resultGetCertified.clickGetCertifiedGetStarted();
       // Assert.assertTrue(isElementVisible(resultGetCertified.resultGetCertified));
    }*/





    @Test
    public void TestTutorials(){
        HomePage homePage=new HomePage();
        homePage.clickTutorials();
        //Assert.assertTrue(isElementVisible(homePage.resultGetCertified));
        Assert.assertEquals(driver.getTitle(),"W3Schools Online Web Tutorials");
    }




}









