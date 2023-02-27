package test_homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom_automation_scalduplit.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class TestAutomationWedApp extends BaseSetup {

    @Test(priority = 1)//user can interact with cart icon

    public void TestAddToCart() {
        HomePage home = new HomePage();
        home.ClickOnAddToCartShoes();
        Assert.assertTrue(isElementVisible(home.viewCart));
    }
   @Test(priority = 2)//user can click on slider and move to other page

    public void TestSlider() {
        HomePage home = new HomePage();

        home.clickOnSlider();
        Assert.assertTrue(isElementVisible(home.image));
    }


    @Test(priority = 3)//user can interact with view all box

    public void TestViewAll()  {
        HomePage home = new HomePage();
        home.clickOnViewAll();
        Assert.assertEquals(driver.getTitle(), "Products – Automation");
    }





    @Test(priority = 4)//user can interact with the search box and search bag

    public void TestSearch() {
        HomePage home = new HomePage();
        home.doSearch("bag");
        Assert.assertEquals(driver.getTitle(), "Search Results for “bag” – Automation");

    }

    @Test(priority = 5)//user can see what is in his cart
    public void TestCart() {
        HomePage home = new HomePage();
        home.clickOnCartButton();
        Assert.assertEquals(driver.getTitle(), "Cart – Automation");



    }

    @Test(priority = 6)//user can click on blog field
    public void TestBlog() {
        HomePage home = new HomePage();
        home.clickOnBlog();
        Assert.assertEquals(driver.getTitle(), "Blog – Automation");
    }


    @Test(priority = 7)//user can click on my account
    public void TestAcc() {
        HomePage home = new HomePage();
        home.clickOnAcc();
        Assert.assertEquals(driver.getTitle(), "My account – Automation");
    }
//this test is exel with data provider
    @Test(dataProvider = "Excel Data Provider",dataProviderClass = BaseSetup.class)
    public void AfterClickMyAccount(String email,String password)  {
        if (!(email == null) && !(password == null))
        {
            HomePage home = new HomePage();
        ResultClickMyAccount resultClickMyAccount = home.clickOnAcc();
        resultClickMyAccount.doClick(email, password);
        Assert.assertTrue(isElementVisible(home.errorTextRegister));
    }}



    @Test//user can login with his email and password
    public void AfterClickMyAccount2()  {

        HomePage home = new HomePage();
        ResultClickMyAccount resultClickMyAccount = home.clickOnAcc();
        resultClickMyAccount.doClick("soraya@gmail.com","abcdef");
            Assert.assertTrue(isElementVisible(home.errorTextRegister));
        }



    @Test(dataProvider = "loginDataProvider", dataProviderClass = BaseSetup.class)//test with data provider
    public void AfterClickMyAccount3(String email,String password)  {

        HomePage home = new HomePage();
        ResultClickMyAccount resultClickMyAccount = home.clickOnAcc();
        resultClickMyAccount.doClick(email,password);
        Assert.assertTrue(isElementVisible(home.errorTextRegister));
    }

//this test is with sqlData
    @Test(priority = 9)
    public void AfterClickMyAccountSecondTime() throws SQLException {
        while (resultSet.next()) {
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            HomePage home = new HomePage();
            ResultClickMyAccount resultClickMyAccount = home.clickOnAcc();
            resultClickMyAccount.logIn(username, password);
            Assert.assertTrue(isElementVisible(home.errorTextLogin));

        }}

        @Test(priority = 10)//user can open instagram icon

        public void TestInstagram (){
            HomePage home = new HomePage();

            home.clickOnInstagram();

            Assert.assertTrue(isElementVisible(home.instagramResult));
        }

    @Test(priority = 11)//user can scroll down the page and click on element
    public  void TestScroll() {
        HomePage home = new HomePage();
        home.scrollAndClickImg();
        Assert.assertTrue(isElementVisible(home.resultImg));


    }}




