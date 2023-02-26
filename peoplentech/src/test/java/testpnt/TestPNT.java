package testpnt;

import org.testng.Assert;
import org.testng.annotations.Test;
import peoplentech.com.Base;
import peoplentech.com.HomePage;
import peoplentech.com.ResultContactUs;

public class TestPNT extends Base {

@Test//test case:user can click on forumLogin field in home page
    public void testForumLogin(){
    HomePage homePage=new HomePage();
    homePage.clickForumLogIn();
    Assert.assertTrue(isElementVisible(homePage.resultForumLogIn));
}


    @Test//test case:user can click on home field in home page
    public void testHome(){
        HomePage homePage=new HomePage();
        homePage.clickHome();
        Assert.assertTrue(isElementVisible(homePage.home));
    }

    @Test//test case:user can click on career field in home page
    public void testCareer(){
        HomePage homePage=new HomePage();
        homePage.clickCareer();
}


    @Test//test case:user can click on english box in home page
    public void testEnglishBox(){
        HomePage homePage=new HomePage();
        homePage.clickEnglishBox();
        Assert.assertTrue(isElementVisible(homePage.englishBox));
}


    @Test//test case:user can see company profile in about us field
    public void testActions(){
        HomePage homePage=new HomePage();
        homePage.actionOnAboutUs();
        Assert.assertTrue(isElementVisible(homePage.aboutUsToCompanyProfile));}



    @Test//test case:user can search for became instructor in job placement field
    public void testActions2(){
        HomePage homePage=new HomePage();
        homePage.actionOnJobPlacement();
        Assert.assertTrue(isElementVisible(homePage.jobPlacementToBecameInstructor));}




    @Test//test case:user can search peoplentech Bangladesh Office with google map in contact us field :
    public void testAfterContactUs() {
        HomePage homePage = new HomePage();
        ResultContactUs resultContactUs = homePage.clickContactUs();
        resultContactUs.clickAfterContactUs();
        Assert.assertTrue(isElementVisible(resultContactUs.resultAfterContactUs));

    }



    @Test//test case:user can click in SliderRedButton
    public void testSliderRedButton(){
        HomePage homePage=new HomePage();
        homePage.clickSliderRedButton();
        Assert.assertTrue(isElementVisible(homePage.ResultSliderRedButton));}




    @Test//test case:user can click On Certification Logo
    public void testCertificationLogo()  {
        HomePage homePage=new HomePage();
        homePage.clickCertificationLogo();
        Assert.assertTrue(isElementVisible(homePage.peopleNTechCertificationLogo));}



    @Test//test case:user can click On partner university
    public void testPartnerUniversity()  {
        HomePage homePage=new HomePage();
        homePage.clickPartnerUniversity();
        Assert.assertTrue(isElementVisible(homePage.resultPartnerUniversity));
}










}

