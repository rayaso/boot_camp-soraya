package testbankofamerica;

import bankofamerica.com.DataProviderExample;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom_bankofamerica.BaseBankOfAmerica;
import pom_bankofamerica.HomePage;

import java.io.IOException;
//@Listeners(listeners.ListenersBankOfAmerica.class)

public class TestBankOfAmerica extends BaseBankOfAmerica {

    @Test//this test is a hacMap model
    public void TestLoginInHomePageWithDataModel() {

        HomePage home = new HomePage();
        home.actionLogInDataModel("userID", "password");
        Assert.assertTrue(isElementVisible(home.redIconError));
    }

    @Test
    //this test i made it fail to show the retry in xml file

    public void TestSearchWithRetry() {
        HomePage home = new HomePage();
        home.clickSearch();
        Assert.assertTrue(isElementVisible(home.resultSearch));

    }


    @Test
    //this test without retryAnalyser

    public void TestSearchWithoutRetry() {
        HomePage home = new HomePage();
        home.clickSearchWithoutRetry();
        Assert.assertTrue(isElementVisible(home.resultSearch));

    }

    @Test(dataProvider = "loginDataProvider", dataProviderClass = BaseBankOfAmerica.class)
    public void TestLogInWithProvider(String /*emailL*/user, String /*passWo*/passW) {

        HomePage home = new HomePage();
        home.DoLogInWithProvider(/*emailL, passWo*/user,passW);
        Assert.assertTrue(isElementVisible(home.redIconError));

    }

    @Test
    //this test is credit cards in home page

    public void TestCreditCards() {
        HomePage home = new HomePage();
        home.clickCreditCards();
        Assert.assertTrue(isElementVisible(home.creditCardsResult));

    }


    @Test//user can click on home loans
    public void TestHomeLoans() {
        HomePage home = new HomePage();
        home.clickHomeLoans();
        Assert.assertTrue(isElementVisible(home.resultHomeLoans));

    }


    @Test
    public void TestScheduleAppointment() {
        HomePage home = new HomePage();
        home.clickScheduleAppointment();
        Assert.assertEquals(driver.getTitle(),"Schedule an Appointment - Bank of America");

    }

    @Test
    public void TestSavings() {
        HomePage home = new HomePage();
        home.clickSavings();
        Assert.assertTrue(isElementVisible(home.resultSavings));

    }


    @Test
    public void TestOpenAccount() {
        HomePage home = new HomePage();
        home.clickOpenAccount();
        Assert.assertEquals(driver.getTitle(),"Bank of America");}


        @Test
    public void TestHelp() {
        HomePage home = new HomePage();
        home.clickHelp();
        Assert.assertEquals(driver.getTitle(),"Bank of America Help Center - Get Your Questions Answered");
    }

    @Test
    public void TestVisitBetterMoneyHabits() {
        HomePage home = new HomePage();
        home.clickVisitBetterMoneyHabits();
        Assert.assertTrue(isElementVisible(home.resultVisitBetterMoneyHabits));

    }




}


