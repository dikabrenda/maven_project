package scenarios;

import org.testng.annotations.Test;

import config.baseClass;

public class scenario extends baseClass {
    
    @Test()
    public void loginUser() {
        pages.setUsername("Admin");
        pages.setPassword("admin123");
        pages.clickLoggedIn();
    }
}
