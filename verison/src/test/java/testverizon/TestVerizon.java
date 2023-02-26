package testverizon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom_verison.Base;
import pom_verison.HomePage;
import pom_verison.ResultContactSales;
import pom_verison.ResultLogIn;

public class TestVerizon extends Base {


    @Test
    public void TestContactSales() {
        HomePage homePage = new HomePage();
        homePage.clickContactSles();
        Assert.assertTrue(isElementVisible(homePage.ResultContactSles));
    }

    @Test
    public void TestPhoneNumber() {
        HomePage homePage = new HomePage();
        homePage.clickPhoneNumber();
    }
    @Test
    public void TestSearch() {
        HomePage homePage = new HomePage();
        homePage.clickSearch();
        Assert.assertTrue(isElementVisible(homePage.resultSearch));
    }
    @Test
    public void TestBusiness() {
        HomePage homePage = new HomePage();
        homePage.clickBusiness();
        Assert.assertTrue(isElementVisible(homePage.resultBusiness));
    }
    @Test
    public void TestSupport() {
        HomePage homePage = new HomePage();
        homePage.clickSupport();
        Assert.assertTrue(isElementVisible(homePage.resultSupport));
    }
    @Test
    public void TestResultContactSales() {
        HomePage homePage = new HomePage();
        ResultContactSales resultContactSales = homePage.clickContactSles();
        resultContactSales.doSelectCountry();
         Assert.assertTrue(isElementVisible(homePage.ResultContactSles));
    }

    @Test//this test with select class
    public void TestActionsAfterContactSales() {
        HomePage homePage = new HomePage();
        ResultContactSales resultContactSales = homePage.clickContactSles();
        resultContactSales.actionsAfterContactSales();
        Assert.assertTrue(isElementVisible(resultContactSales.resultActionsAfterContactSles));

    }


    @Test//this test with data model hacmap
    public void TestActionsLogIn() {
        HomePage homePage = new HomePage();
        ResultLogIn resultLogIn = homePage.clickLogin();
        resultLogIn.actionLogInDataModel("USERID", "PASSWORD");
        Assert.assertTrue(isElementVisible(resultLogIn.ResultLogin));
    }


    @Test
    public void TestDoLogIn() {
        HomePage homePage = new HomePage();
        ResultLogIn resultLogIn = homePage.clickLogin();
        resultLogIn.doLogIn("soraya23", "456123");
        Assert.assertTrue(isElementVisible(resultLogIn.ResultLogin));

    }





//this test is data provider with exel
    @Test(dataProvider = "Excel Data Provider",dataProviderClass = Base.class)
    public void TestLogIn(String userid,String passworD)  {
        if (!(userid == null) && !(passworD == null))
        {
            HomePage homePage = new HomePage();
            ResultLogIn resultLogIn = homePage.clickLogin();
            resultLogIn.doLogIn(userid,passworD);
            Assert.assertTrue(isElementVisible(resultLogIn.ResultLogin));
        }}








}
