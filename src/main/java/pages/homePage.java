package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import element.loginPageElem;

import static helper.testngHelper.*;
public class homePage extends loginPageElem{
    
    WebDriver driver;

    public homePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void setUsername(String username) {
        enterText(USERNAME_FILLED_BOX, username);
    }

    public void setPassword(String pwd) {
        enterText(PASSWORD_FILLED_BOX, pwd);
    }

    public void clickLoggedIn() {
        LOGIN_BUTTON.click();
    }
}