package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class FindBysFindAll {



    // örnek tir ..çalıştırmayınız


    /*
    locator lardan bir tanesi sağlaması yeterlidir
    or mantığıyla çalılır
     */
    @FindAll({
            @FindBy (xpath = "//a[contains()]"),
            @FindBy (id = "id5")
    })
    public List<WebElement> findElements;

    /*
Locator ların hepsi sağlamalıdır
and mantığı ile çalışır
     */

    @FindBys({
            @FindBy(xpath = "//a[contains]"),
            @FindBy(id = "id66")
    })
    public List<WebElement> findBys;
}
