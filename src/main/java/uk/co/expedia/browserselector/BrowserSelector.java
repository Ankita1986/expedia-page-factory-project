package uk.co.expedia.browserselector;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import uk.co.expedia.basepage.BasePage;

/**
 * Created by Ankita
 */
public class BrowserSelector extends BasePage {
    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());


    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            Reporter.log("Launching Chrome browser");
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            log.info("Launching Chrome Browser");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong browser name");
        }
    }

}
