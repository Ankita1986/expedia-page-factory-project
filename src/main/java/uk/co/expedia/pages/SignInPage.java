package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Ankita
 */
public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());



    @FindBy(id = "gss-signin-email")
    WebElement emailAddressField;

    @FindBy(id = "gss-signin-password")
    WebElement passwordField;

    @FindBy(id = "gss-signin-submit")
    WebElement signInBtn;

    @FindBy(id = "gss-signin-incorrect-email-or-password")
    WebElement errorMessage;

    public void enterEmailAddress(String email) {
        Reporter.log("Entering email : " + email + " On email address field : " + emailAddressField.toString() + "<br>");
        sendTextToElement(emailAddressField, email);
        log.info("Entering email " + email + " On email address field " + emailAddressField.toString());
    }

    public void enterPassword(String password) {
        Reporter.log("Entering password : " + password + " On password field : " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Entering password " + password + " On password field " + passwordField.toString());
    }

    public void clickOnSignInButton() {
        Reporter.log("Clicking on sign in button : " + signInBtn.toString() + "<br>");
        clickOnElement(signInBtn);
        log.info("Clicking on sign in button " + signInBtn.toString());
    }

    public String getErrorMessage() {
        Reporter.log("Getting text from error message : " + errorMessage.toString() + "<br>");
        log.info("Getting text from error message " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
}
