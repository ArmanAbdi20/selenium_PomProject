package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ToolsQALogin2 {


    public ToolsQALogin2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy (id = "userName")
    WebElement userName;

    @FindBy (id = "password")
    WebElement password;

    @FindBy (id = "login")
    WebElement login;

    @FindBy (id = "name")
    WebElement message;



    public void userNamePrint(String inputUser){
        userName.sendKeys(inputUser);
    }

    public void passwordPrint(String inputPassword){
        password.sendKeys(inputPassword);
    }

    public void loginPrint(){
        login.click();
    }

    public String getMessage(){
String messageStr = message.getText();
        return messageStr;
    }
}
