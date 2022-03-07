package element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageElem {

    @FindBy(id = "txtUsername")
    protected 
    WebElement USERNAME_FILLED_BOX;

    @FindBy(id = "txtPassword")
    protected 
    WebElement PASSWORD_FILLED_BOX;

    @FindBy(id = "btnLogin")
    protected 
    WebElement LOGIN_BUTTON;
}
