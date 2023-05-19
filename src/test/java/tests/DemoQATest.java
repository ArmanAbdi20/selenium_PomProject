package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ToolsQALogin;
import pages.ToolsQALogin2;
import utils.Driver;

public class DemoQATest {

    ToolsQALogin t1 = new ToolsQALogin();
    ToolsQALogin2 t2 = new ToolsQALogin2();

    @Test
    public void test(){

        Driver.getDriver().get("https://demoqa.com/books");

        t1.singIn();

        t2.userNamePrint("ebik");
        t2.passwordPrint("gabık");
        t2.loginPrint();

        Assert.assertTrue(t2.getMessage().contains("Invalid username or password!"));

        System.out.println("kod cıncık :)");


    }
}
