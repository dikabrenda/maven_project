package config;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testBase implements constant {

    public static WebDriver startApplication(WebDriver driver, String browserName, String appURL)
            throws MalformedURLException {

        switch (browserName) {
            case "Chrome":
                System.setProperty(WEBDRIVER_CHROME, CHROME_PATH);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito"); // headless //window-size=1920,1080
                driver = new ChromeDriver(options);
                break;

            default:
                System.out.println("we don't support this browser");
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(4));

        if (appURL == "Production") {
            driver.get(dotenv.get("BASEURL"));
        } else {
            System.out.println("we don't have any environtment");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(4));

        return driver;
    }
}
