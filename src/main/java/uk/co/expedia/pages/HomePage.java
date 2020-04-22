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
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy (xpath ="//span[@class ='button-text']" )
    WebElement acceptTab;



    @FindBy(xpath = "//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']")
    WebElement flightsTab;

    @FindBy(id = "header-account-menu")
    WebElement accountLink;

    public void clickOnFlightsTab() {
        Reporter.log("Clicking on flights tab : " + flightsTab.toString() + "<br>");
        clickOnElement(flightsTab);
        log.info("Clicking on flights tab" + flightsTab.toString());
    }

    public void clickOnAccountMenu() {
        Reporter.log("Clicking on account menu : " + accountLink.toString() + "<br>");
        clickOnElement(accountLink);
        log.info("Clicking on account menu" + accountLink.toString());
    }

    public void clickOnAcceptBtn() {
        Reporter.log("clicking on accept tab : "+ acceptTab.toString()+"<br>");
        clickOnElement(acceptTab);
        log.info("clicking on accept tab : "+ acceptTab.toString());

    }

}
