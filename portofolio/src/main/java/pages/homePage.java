package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class homePage{
    
    WebDriver driver;

    public homePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    @FindBy(xpath = "//button[normalize-space()='Masuk']")
    WebElement masuk;

    @FindBy(xpath = "//button[normalize-space()='Karir']")
    WebElement karir;

    @FindBy(xpath = "//button[normalize-space()='Produk']")
    WebElement product;


    public void assertionMasuk() {
        String actualText = masuk.getText();
        String expectedText = "Masuk";
        Assert.assertEquals(actualText, expectedText);
    }

    public void assertionKarir() {
        String actualText = karir.getText();
        String expectedText = "Karir";
        Assert.assertEquals(actualText, expectedText);
    }

    public void assertionProduct(){
        String actualText = product.getText();
        String expectedText = "Product";
        Assert.assertEquals(actualText, expectedText);
    }

    public void clickOnMasuk() {
        assertionMasuk();
        masuk.click();
    }

    public void clickOnKarir() {
        assertionKarir();
        karir.click();
    }

    public void clickOnProduct() {
        assertionProduct();
        product.click();
    }
}