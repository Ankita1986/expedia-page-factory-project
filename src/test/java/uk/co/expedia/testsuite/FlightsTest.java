package uk.co.expedia.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import uk.co.expedia.pages.FlightsPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.ResultPage;
import uk.co.expedia.testbase.TestBase;

/**
 * Created by Ankita
 */
public class FlightsTest extends TestBase {

    HomePage homePage;
    FlightsPage flightsPage;
    ResultPage resultPage;

    @BeforeMethod
    public void setUp(){
        flightsPage = new FlightsPage();
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(groups = {"Regression", "Sanity"})
    public void verifySearchFlight(){
        SoftAssert sa = new SoftAssert();
        homePage.clickOnAcceptBtn();
        homePage.clickOnFlightsTab();
        flightsPage.enterFlyingFrom("London (LHR-Heathrow)");
        flightsPage.enterGoingTo("Mumbai (BOM-Chhatrapati Shivaji Intl.)");
        flightsPage.enterDepartingDate("20/12/2020");
        flightsPage.clearReturnDate();
        flightsPage.enterReturningDate("11/01/2021");
        flightsPage.clickOnTravellers();
        flightsPage.clickOnAdults();
        flightsPage.clickOnClose();
        flightsPage.clickOnSearchButton();
        flightsPage.getDestinationText();
        sa.assertTrue(flightsPage.verifyBodyContainsDestinationName().contains("Mumbai (BOM-Chhatrapati Shivaji Intl.)"));

    }
    }




