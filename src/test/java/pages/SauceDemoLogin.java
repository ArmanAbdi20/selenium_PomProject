package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SauceDemoLogin {



    public SauceDemoLogin(){
        PageFactory.initElements(Driver.getDriver(), this);    }

    @FindBy (id = "user-name")
    WebElement txtUserName;

    @FindBy  (id ="password")
    WebElement txtPassword;

    @FindBy (id = "login-button")
    WebElement btnLogin;


    public void enterUserName(String userName){
        txtUserName.sendKeys(userName);

    }

    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clickLogin(){
        btnLogin.click();
    }
}
