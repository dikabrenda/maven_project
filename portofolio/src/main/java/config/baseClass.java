package config;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.homePage;

public class baseClass implements constant{
      
      private static WebDriver driver;
      public homePage pages;

      @BeforeClass
      public WebDriver setup() throws MalformedURLException {
            driver = testBase.startApplication(driver, CHROME, PRODUCTION);
            pages = new homePage(driver);

            return driver;
      }

      @AfterClass
      public void tearDown() {
            if(driver!=null){
                  driver.quit();
            }
      }
}
