package helper;

import org.openqa.selenium.WebElement;

public class testngHelper {

    public static WebElement enterText(WebElement e, String text) {
        boolean clear = true;
        if(clear){
            e.clear();
        }
        e.sendKeys(text);

        return e;
    }
}
