package testgoogle;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_google.*;

public class TestGoogle extends GoogleBaseSetup {


    @Test

    public void TestPopUpWindow() {
        GoogleHomePage home = new GoogleHomePage();
        home.PopUp();
        Assert.assertTrue(isElementVisible(home.signInPopUp));

    }


   /* @Test
    public void TestAccountIcon(){
        GoogleHomePage home=new GoogleHomePage();
        home.clickOnAccountIcon();
    }*/


    @Test

    public void TestSearchBox() {
        GoogleHomePage home = new GoogleHomePage();
        home.doSearch("dress");
        Assert.assertTrue(isElementVisible(home.resultSearchText));

    }

    @Test
    public void TestCamera() {
        GoogleHomePage home = new GoogleHomePage();
        home.clickOnCamera();
        Assert.assertTrue(isElementVisible(home.textResultCamera));

    }


    @Test
    public void TestImage() {
        GoogleHomePage home = new GoogleHomePage();
        home.clickOnImage();
        Assert.assertTrue(isElementVisible(home.textResultImage));


    }


    @Test
    public void TestSignInHomePage() {
        GoogleHomePage home = new GoogleHomePage();
        home.clickOnSignInHomePage();
        Assert.assertTrue(isElementVisible(home.signInHomePage));
    }

    @Test
    public void TestAfterSignInHomePage() {
        GoogleHomePage home = new GoogleHomePage();
        ResultSigninFromHomePage after = home.clickOnSignInHomePage();
        after.clickOnForgotEmail();
        Assert.assertTrue(isElementVisible(home.ForgotEmailTextResult));
    }


    @Test
    public void TestAbout() {
        GoogleHomePage home = new GoogleHomePage();
        home.clickOnAbout();
        Assert.assertEquals(driver.getTitle(), "Google - About Google, Our Culture & Company News");

    }



  /* @Test
    public void TestGoogleSearch(){
        GoogleHomePage home=new GoogleHomePage();
        home.clickOnGoogleSearch();
    }*/


    @Test
    public void TestGmail() {
        GoogleHomePage home = new GoogleHomePage();
        home.clickOnGmail();
        Assert.assertEquals(driver.getTitle(), "Gmail: Private and secure email at no cost | Google Workspace");
    }


    @Test
    public void TestSignIn() {
        GoogleHomePage home = new GoogleHomePage();

        ResultStore resultStore = home.clickOnStore();
        resultStore.clickOnSignIn();
        Assert.assertTrue(isElementVisible(home.textResultStore));

    }


    @Test
    public void TestResultAbout() {
        GoogleHomePage home = new GoogleHomePage();

        ResultAbout resultAbout = home.clickOnAbout();

        resultAbout.clickOnViewCommitments();

        Assert.assertTrue(isElementVisible(home.viewCommitmentsTextReturn));

    }


}






