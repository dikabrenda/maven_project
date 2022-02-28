package scenarios;

import org.testng.annotations.Test;

import config.baseClass;

public class scenario extends baseClass {
    
    @Test(priority = 1)
    public void clickOnMasuk() {
        pages.clickOnMasuk();
    }

    @Test(priority = 2)
    public void clickOnCareer() {
        pages.clickOnKarir();
    }

    @Test(priority = 3)
    public void clickOnProduct() {
        pages.clickOnProduct();
    }
}
