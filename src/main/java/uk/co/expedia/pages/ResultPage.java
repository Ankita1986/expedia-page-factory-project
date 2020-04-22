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
public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @FindBy(xpath = "//*[@id=\"titleBar\"]/h1/div/span[1]")
    WebElement resultText;

    public String getResultText() {
        Reporter.log("Getting text from : " + resultText.toString() + "<br>");
        log.info("Getting text from" + resultText.toString());
        return getTextFromElement(resultText);

    }
}
