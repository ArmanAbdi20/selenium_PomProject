package tests;

import org.testng.annotations.Test;
import pages.SauceDemoLogin;
import pages.SauceInventory;
import utils.Driver;

public class SauceDemoTest {

    /*
    Navigate to https://www.saucedemo.com/
Enter the user name as standard_user
Enter the password as secret_sauce
Click on login button.
- Choose price low to high with soft Assert.
- Verify item prices are sorted from low to high with hard Assert.
     */


    @Test
    public void testSauceDemo(){
        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLogin lp = new SauceDemoLogin();

        lp.enterUserName("standard_user");
        lp.enterPassword("secret_sauce");
        lp.clickLogin();


        SauceInventory sp = new SauceInventory();

        sp.sortBy("Price (low to high)");
        sp.validateProductAreSorted();



    }
}
