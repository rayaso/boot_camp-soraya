package testamazon;

import com.aventstack.extentreports.model.ReportStats;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom_amazon.AfterSignInInHomePage;
import pom_amazon.AmazonHomePage;
import pom_amazon.BaseSetupAmazon;
import pom_amazon.SearchResult;

public class TestAmazon extends BaseSetupAmazon {



    @Test(priority = 1)//test case:user can search for dress

    public void TestAmazonSearch() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        SearchResult searchResult = amazonHomePage.doAct("dress");
        searchResult.clickOnWeddingDress();
        Assert.assertTrue(isElementVisible(amazonHomePage.weddingDress));
       // logger=extent.createTest("TestAmazonSearch");
    }

//
    @Test//test case:user can click on location icon
    public void TestLocation() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnLocation();
        Assert.assertTrue(isElementVisible(amazonHomePage.clinicText));
    }

    @Test(priority = 1)//user can click on clinic
    public void TestClinicc() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnClinic();
        Assert.assertTrue(isElementVisible(amazonHomePage.clinicText));
        System.out.println("this is TestClinic");

    }


    @Test//test case:user can click on shop valentine day link
    public void TestShopValentineDay() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnShopValentineDy();
        Assert.assertEquals(driver.getTitle(), "Valentine's Day | Amazon.com Gift Finder");/*
        this assertion does not work know because the time i did my testing it was valentine link
        now we do not have any more valentine they changed the usage of it*/

        logger=extent.createTest("TestShopValentineDay");
    }


   /* @Test
    public void TestPopUp() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.signInPopUpElement();
amazonHomePage.popUp();

    }*/

    @Test//test case:user can interact with slider and move to another image
    public void TestSlider() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnSlider();
         Assert.assertTrue(isElementVisible(amazonHomePage.slider));

    }


    @Test(priority = 2)//test case:user can click on allIcon
    public void TestAllIconn() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnAll();
        Assert.assertTrue(isElementVisible(amazonHomePage.allIcon));
        System.out.println("this is TestAllIcon");
        logger=extent.createTest("TestAllIcon");
    }



    @Test//test case:user can interact with best sellers icon
    public void TestBestSellers() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnBestSellers();
        Assert.assertTrue(isElementVisible(amazonHomePage.bestSellers));
    }


    @Test//test case:user can click on start here through pop up window
    public void TestActionS() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.actionsS();
        Assert.assertTrue(isElementVisible(amazonHomePage.startHerePopUp));
    }


    @Test//test case:user can signin through pop up window
    public void TestActionSSignINHomePge() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
      //  amazonHomePage.actionsSignInHomePage();
        AfterSignInInHomePage afterSignInInHomePage=amazonHomePage.actionsSignInHomePage();
        Assert.assertTrue(isElementVisible(afterSignInInHomePage.resultTextAfterSgnIn));
    }



    @Test//test case:user can change language in language box
    public void TestLanguage() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.actionsOnLanguage();
        Assert.assertTrue(isElementVisible(amazonHomePage.languageSpanish));
    }







    @Test//test case:user can interact with amazon logo
    public void TestAmazonLogoBox() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.clickOnAmazonLogoBox();
        Assert.assertTrue(isElementVisible(amazonHomePage.AmazonLogoBox));
    }


}