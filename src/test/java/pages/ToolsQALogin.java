package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ToolsQALogin {

    public ToolsQALogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id = "login")
    WebElement login;





    public void singIn(){
        login.click();
    }
}
