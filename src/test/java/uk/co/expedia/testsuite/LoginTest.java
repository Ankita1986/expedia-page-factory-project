package uk.co.expedia.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.expedia.loadproperty.LoadProperty;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;
import uk.co.expedia.testbase.TestBase;

/**
 * Created by Ankita
 */
public class LoginTest extends TestBase {

    HomePage homePage;
    AccountPage accountPage;
    SignInPage signInPage;


    @BeforeMethod
    public void setUp() {
        homePage = new HomePage();
        accountPage = new AccountPage();
        signInPage = new SignInPage();
    }

    @Test(groups = {"Regression", "Sanity"})
    public void verifyErrorMessageOnSignInPage() {
        String expectedErrorMessage = "You may have entered an unknown email address or an incorrect password";
        homePage.clickOnAccountMenu();
        accountPage.clickOnSignInButton();
        signInPage.enterEmailAddress(new LoadProperty().getProperty("username"));
        signInPage.enterPassword(new LoadProperty().getProperty("password"));
        signInPage.clickOnSignInButton();
        Assert.assertEquals(expectedErrorMessage, signInPage.getErrorMessage());
    }


}
